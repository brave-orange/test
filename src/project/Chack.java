package project;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
 

/*
 * 本类主要实现登录软件的各个sql操作
 * 
 */
public class Chack {
    PreparedStatement ps = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Connection conn = null;
 
    public boolean verify(String name,String password, int index) {
        //实现登陆界面中登录按钮的响应事件
    	boolean result=false;
        String sql;
        if(index==0){
        	sql = "select name,password from user where name=? and password=?";
        }
        else{
        	sql = "select name,password from user where mail=? and password=?";
        }
        //用Dbconnect的getConn()方法建立一个JDBC的链接
        Connection con = (Connection) new Dbconnect().getConn(); 
        try {
            ps = con.prepareStatement(sql);//sql语句预编译
            ps.setString(1, name);  //将问号处添加进内容
            ps.setString(2, password);
            rs = ps.executeQuery();//执行sql语句
             
            if (rs.next()) {//验证成功
                result=true;
            }
 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
   
                e.printStackTrace();
            }
        }
         
        return result;
    }
    
    //用于注册页面中确定该邮箱是否注册过
    public boolean verify(String name) {	
        boolean result=false;
        String sql;
        sql = "select * from user where mail=?";
        Connection con = (Connection) new Dbconnect().getConn();
        //用Dbconnect的getConn()方法建立一个JDBC的链接
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
             
            if (rs.next()) {//验证成功
                result=true;
            }
 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
   
                e.printStackTrace();
            }
        }
         
        return result;
    }
    
    
    //用于注册页面“确定”按钮的响应事件，实现向数据库中插入一条记录，并返回提示信息
    public String insert(String mail,String name,String password,int choose,String answer){
    	String result;
    	if(verify(mail)){	//验证是否注册过
    		result="该邮箱已经被注册过了！";
    		return result;	//返回提示信息
    	}
    	String sql;
    	sql="insert into user value(?,?,?,?,?);";
    	 Connection con = (Connection) new Dbconnect().getConn();
    	 //用Dbconnect的getConn()方法建立一个JDBC的链接
         try {
             pst = con.prepareStatement(sql);//预编译sql语句
             pst.setString(1, mail);
             pst.setString(2, name);
             pst.setString(3, password);
             pst.setInt(4, choose);
             pst.setString(5, answer); 
             pst.executeUpdate();  //执行insert into 语句
             con.close();
         } catch (SQLException e) {
             
             e.printStackTrace();
         }	
         result="恭喜您注册成功！！";  //返回提示信息
         return result;
    }
    
    
    //用于找回密码页面的”确定“按钮响应事件，查找忘记的密码，并返回信息。
    public String found(String mail,int choose,String answer){
        String sql;
        String result;
        sql = "select * from user where mail=? and problem=? and answer=?";
        Connection con = (Connection) new Dbconnect().getConn();	 
        //用Dbconnect的getConn()方法建立一个JDBC的链接
        try {
            ps = con.prepareStatement(sql);		//预编译sql语句
            ps.setString(1, mail);
            ps.setInt(2, choose);
            ps.setString(3, answer);
            rs = ps.executeQuery();  		//执行sql语句
            if (rs.next()){    //验证成功
               result=rs.getString(3);		//在sql语句执行后的结果集中取出密码
               result="您的密码是：   "+result+"   请妥善保管好您的密码！";	//返回密码及提示信息
               return result;		//返回提示信息
            }
 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
   
                e.printStackTrace();
            }
        }
        result = "验证信息错误，密码找回失败！";		//验证不成功返回信息	
        return result;
    }
}