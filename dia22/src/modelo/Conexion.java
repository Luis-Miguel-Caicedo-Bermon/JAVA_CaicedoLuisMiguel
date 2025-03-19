
package modelo;

import java.sql.*;

public class Conexion {
    private String URL = "jdbc:mysql://ut6zxc7npmqytnzl:VHrH6k8ewoShhYaU2X0S@b6yfgv5kwlvo5jgdh21f-mysql.services.clever-cloud.com:3306/b6yfgv5kwlvo5jgdh21f";
    private String USUARIO = "ut6zxc7npmqytnzl";
    private String PASSWORD = "VHrH6k8ewoShhYaU2X0S";

    Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }
}
