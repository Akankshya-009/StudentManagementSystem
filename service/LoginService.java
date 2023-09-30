/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;


/**
 *
 * @author Lenovo
 */
public class LoginService {
    public static Connection cn=null;
    public static Statement st=null;
    public static boolean validUser(String username,String password){
        try{
            cn=connection.ConnectionDb.getConnection();
            st=cn.createStatement();
            ResultSet rs=st.executeQuery("select * from student where Name='"+username+"' and Password= '"+password+"'");
            if(rs.next()){
                return true;
            }else{
                return false;
            }
            
        }
            catch(SQLException se){
                    se.printStackTrace();
                    }
            return false;
                    
        }
}


