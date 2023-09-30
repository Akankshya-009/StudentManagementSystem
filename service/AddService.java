/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class AddService {
    public static Connection cn=null;
    public static Statement st=null;
    public static boolean AddStudent(String studentid,String name,String college,String Passoutyear,String course,String branch){
    try{
    cn=connection.ConnectionDb.getConnection();
    st=cn.createStatement();
    st.executeUpdate("insert into addstud values('"+studentid+"',' "+name+"', ' "+college+"', +'"+Passoutyear+"','"+course+"','"+branch+"' )");
    return true;
    }
    catch(SQLException se){
        se.printStackTrace();
    }
    return false;
    
}
    
}
