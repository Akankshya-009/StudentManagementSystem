/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Lenovo
 */
import java.sql.*;
public class SignupService {
    public static Connection cn=null;
    public static Statement st=null;
    public static boolean insertUser(String name,String email,String phnno,String address,String password){
        try{
            cn=connection.ConnectionDb.getConnection();
            st=cn.createStatement();
            st.executeUpdate("insert into student values('"+name+"','"+email+"','"+phnno+"','"+address+"','"+password+"')");
            return true;
        }catch(SQLException se){
            se.printStackTrace();
        }
        return false;
    }
    
    
}
