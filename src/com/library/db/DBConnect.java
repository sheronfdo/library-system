/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jamit
 */
public class DBConnect {
    static Connection con;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        connect();
    }
    
    public static void connect() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","password");
    }
    
    public static void pushToDB(String sql)throws ClassNotFoundException,SQLException{
        if(con == null){
            connect();
        }
        con.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet getFromDB(String sql)throws ClassNotFoundException,SQLException{
        if(con == null){
            connect();
        }
        return con.createStatement().executeQuery(sql);
    }
    
    public static Connection getDBConnection()throws Exception{
        if (con == null) {
            connect();
        }
        return con;
    }
}
