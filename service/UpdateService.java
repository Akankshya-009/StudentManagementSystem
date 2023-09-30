/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateService {
    public static Connection cn=null;
    public static Statement st=null;
    public static boolean Update(String StudentId,String name,String college,String passoutyear,String course,String branch ){
        try{
            cn=connection.ConnectionDb.getConnection();
            st=cn.createStatement();
            st.executeUpdate("UPDATE addstud SET name='"+name+"',college='"+college+"',passoutyear='"+passoutyear+"',course='"+course+"',branch='"+branch+"' WHERE StudentId = '"+StudentId+"'");
            return true;
            
        }catch(SQLException se){
            se.printStackTrace();
            
        }
        return false;

    }
}
