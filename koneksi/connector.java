/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author MSI GF63
 */
public class connector {
    static Connection con;
    public static Connection connection(){
        if(con==null){
    MysqlDataSource data = new MysqlDataSource();
    data.setDatabaseName("toserba_db");
    data.setUser("root");
    data.setPassword("");
    try{
    con = data.getConnection();
        System.out.println("koneksi berhasil");
    }catch(SQLException ex){ 
        ex.printStackTrace();
        System.out.println("Koneksi gagal");
    }
    }
        return con;
    }
}
