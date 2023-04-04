package org.ignacio.rios.Repositorio;

import org.ignacio.rios.models.Producto;
import org.ignacio.rios.util.ConeccionBD;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto>{

private Connection getConnection() throws SQLException {
    return ConeccionBD.getInstance();

}
    @Override
    public List<Producto> lista() {
    List<Producto> productos = new ArrayList<>();
    try(Statement stmt = getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("select * from productos");){
        while(rs.next()){
            Producto p = CrearProducto(rs);
            productos.add(p);
        }
    }catch(SQLException e){
          e.printStackTrace();
    }
        return productos;
    }

    @Override
    public Producto porId(Long id)
    {
        Producto producto = null;

        try(PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM productos where id = ?"))
        {
            stmt.setLong(1,id);
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                producto = CrearProducto(res);

            }

            res.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return producto;
    }

    @Override
    public void guardar(Producto producto) {



    }

    @Override
    public void eliminar(Long id) {

    }

    private static Producto CrearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setFechaRegistro(rs.getDate("fecha"));
        return p;
    }
}
