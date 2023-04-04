El patrón **DAO (Data Access Object)** es un patrón de diseño que se utiliza para separar la lógica de acceso a datos de la lógica de negocios en una aplicación. El objetivo del patrón DAO es proporcionar una capa de abstracción entre la aplicación y la fuente de datos, lo que permite a la aplicación trabajar con diferentes tipos de fuentes de datos sin cambiar el código de la aplicación.

El patrón DAO se compone de tres elementos principales:

***1.  La interfaz DAO***, que define los métodos de acceso a datos que la aplicación utilizará.
***2.  La implementación DAO,*** que implementa la interfaz DAO y proporciona la lógica de acceso a datos para una fuente de datos específica (como una base de datos o un archivo).
***3.  La clase de negocio o servicio,*** que utiliza la interfaz DAO para acceder a los datos.

El **patrón DAO** ayuda a mantener un alto nivel de abstracción en la capa de negocio de la aplicación, lo que la hace más fácil de mantener y modificar. Además, el patrón ***DAO*** también facilita las pruebas unitarias de la capa de negocio, ya que se pueden crear implementaciones **DAO** falsas o simuladas para las pruebas en lugar de tener que acceder a una fuente de datos real.

***En resumen, el patrón DAO es una técnica útil para separar la lógica de acceso a datos de la lógica de negocios en una aplicación, lo que proporciona una mayor flexibilidad y un mayor grado de mantenibilidad en la capa de negocio.***
