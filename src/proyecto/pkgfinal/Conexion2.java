/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

import java.sql.*;

/**
 *
 * @author alexg
 */
public class Conexion2 {
    public static Connection obtenerConexion(){
       String user="root";
       String password="root";
       String url="jdbc:mysql://localhost:3306/g4s21?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
       Connection con=null;
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");   
         con =(Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }return con;
       
    }
}
