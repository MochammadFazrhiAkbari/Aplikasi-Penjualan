package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    private static Connection mysqlconfig;

    public static Connection getKoneksi(){

        try{

            String url = "jdbc:mysql://localhost/penjualan";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            mysqlconfig = DriverManager.getConnection(url,user,pass);

        } catch(SQLException e){

            System.out.println("Koneksi gagal : " + e.getMessage());

        }

        return mysqlconfig;
    }
}