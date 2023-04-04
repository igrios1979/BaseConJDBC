package org.ignacio.rios;

import org.ignacio.rios.Repositorio.ProductoRepositorioImpl;
import org.ignacio.rios.Repositorio.Repositorio;
import org.ignacio.rios.models.Producto;
import org.ignacio.rios.util.ConeccionBD;

import java.sql.Connection;
import java.sql.SQLException;


public class EjemploJDBC2 {

    public static void main(String[] args) {

        try(Connection conn = ConeccionBD.getInstance()){ // hace un autoclose la virtual machine
            Repositorio<Producto> repositorio  = new ProductoRepositorioImpl();
           repositorio.lista().forEach(System.out::println);
            System.out.println("---------------------------------------------------------");
            System.out.println(repositorio.porId(10L));

        }catch(SQLException e){
                    e.printStackTrace();

        }




    }



}

