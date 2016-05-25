/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anas
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static String url = "", displayp = "";
    private static Statement st;
    private static ResultSet rs;
    private static Connection con;

    public static void connection() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            url = "jdbc:ucanaccess://C:/Users/Anas/Documents/IMS.accdb";
            displayp = "SELECT * FROM Table1";
            con = DriverManager.getConnection(url);
            st = con.createStatement();
            rs = st.executeQuery(displayp);

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        } catch (SQLException s) {
            System.out.println("SQL Exception is found " + s);
        }
    }

    public static Statement getSt() {
        return st;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static Connection getCon() {
        return con;
    }

}
