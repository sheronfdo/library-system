/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.library.db.DBConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Jamit
 */
public class UserProfile {
    
    static String username;
    static int empID;
    static String name;
    static String address;
    static String telephoneNo;
    static String nic;
    static String gender;
    static Date dob;
    
    static int posID;
    static String userPosition;
    static boolean employee;
    static boolean member;
    static boolean author;
    static boolean publisher;
    static boolean positionManage;
    static boolean book;
    static boolean checkout;
    static boolean returnManage;
    static boolean renew;
    static boolean subject;
    static boolean user;
    
    public static void userDetail(int empId, String username) throws ClassNotFoundException, SQLException {
        UserProfile.empID = empId;
        UserProfile.username = username;
        String sql = "select * from employee where empID=" + empID;
        ResultSet rs = DBConnect.getFromDB(sql);
        if (rs.next()) {
            UserProfile.name = rs.getString("name");
            UserProfile.address = rs.getString("address");
            UserProfile.telephoneNo = rs.getString("telephoneNo");
            UserProfile.nic = rs.getString("nic");
            UserProfile.gender = rs.getString("gender");
            UserProfile.dob = rs.getDate("dob");
            UserProfile.posID = rs.getInt("posID");
        }
        sql = "select * from staffposition where posID=" + UserProfile.posID;
        rs = DBConnect.getFromDB(sql);
        if (rs.next()) {
            UserProfile.userPosition = rs.getString("description");
            UserProfile.employee = (rs.getBoolean("employee")) ? true : false;
            UserProfile.member = (rs.getBoolean("member")) ? true : false;
            UserProfile.author = (rs.getBoolean("author")) ? true : false;
            UserProfile.publisher = (rs.getBoolean("publisher")) ? true : false;
            UserProfile.positionManage = (rs.getBoolean("position")) ? true : false;
            UserProfile.book = (rs.getBoolean("book")) ? true : false;
            UserProfile.checkout = (rs.getBoolean("checkout")) ? true : false;
            UserProfile.returnManage = (rs.getBoolean("return")) ? true : false;
            UserProfile.renew = (rs.getBoolean("renew")) ? true : false;
            UserProfile.subject = (rs.getBoolean("subject")) ? true : false;
            UserProfile.user = (rs.getBoolean("user")) ? true : false;
        }
        new Home().setVisible(true);
    }
}
