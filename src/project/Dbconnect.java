package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dbconnect{
     
    public static final String DBDRIVER="org.gjt.mm.mysql.Driver";	//指定连接类型
    public static final String DBURL="jdbc:mysql://localhost:3306/project";	//链接名
    public static final String DBUSER="root";	//账户
    public static final String DBPASS="****";	//Mysql管理员密码
    public  Connection getConn(){
        Connection conn=null;
        try{
            Class.forName(DBDRIVER);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
        	//链接JDBC
            conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);	
        }catch(SQLException e){
            e.printStackTrace();
        }
         
        return conn;
    }
}
