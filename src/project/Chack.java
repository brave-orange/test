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
 * ������Ҫʵ�ֵ�¼����ĸ���sql����
 * 
 */
public class Chack {
    PreparedStatement ps = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Connection conn = null;
 
    public boolean verify(String name,String password, int index) {
        //ʵ�ֵ�½�����е�¼��ť����Ӧ�¼�
    	boolean result=false;
        String sql;
        if(index==0){
        	sql = "select name,password from user where name=? and password=?";
        }
        else{
        	sql = "select name,password from user where mail=? and password=?";
        }
        //��Dbconnect��getConn()��������һ��JDBC������
        Connection con = (Connection) new Dbconnect().getConn(); 
        try {
            ps = con.prepareStatement(sql);//sql���Ԥ����
            ps.setString(1, name);  //���ʺŴ���ӽ�����
            ps.setString(2, password);
            rs = ps.executeQuery();//ִ��sql���
             
            if (rs.next()) {//��֤�ɹ�
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
    
    //����ע��ҳ����ȷ���������Ƿ�ע���
    public boolean verify(String name) {	
        boolean result=false;
        String sql;
        sql = "select * from user where mail=?";
        Connection con = (Connection) new Dbconnect().getConn();
        //��Dbconnect��getConn()��������һ��JDBC������
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
             
            if (rs.next()) {//��֤�ɹ�
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
    
    
    //����ע��ҳ�桰ȷ������ť����Ӧ�¼���ʵ�������ݿ��в���һ����¼����������ʾ��Ϣ
    public String insert(String mail,String name,String password,int choose,String answer){
    	String result;
    	if(verify(mail)){	//��֤�Ƿ�ע���
    		result="�������Ѿ���ע����ˣ�";
    		return result;	//������ʾ��Ϣ
    	}
    	String sql;
    	sql="insert into user value(?,?,?,?,?);";
    	 Connection con = (Connection) new Dbconnect().getConn();
    	 //��Dbconnect��getConn()��������һ��JDBC������
         try {
             pst = con.prepareStatement(sql);//Ԥ����sql���
             pst.setString(1, mail);
             pst.setString(2, name);
             pst.setString(3, password);
             pst.setInt(4, choose);
             pst.setString(5, answer); 
             pst.executeUpdate();  //ִ��insert into ���
             con.close();
         } catch (SQLException e) {
             
             e.printStackTrace();
         }	
         result="��ϲ��ע��ɹ�����";  //������ʾ��Ϣ
         return result;
    }
    
    
    //�����һ�����ҳ��ġ�ȷ������ť��Ӧ�¼����������ǵ����룬��������Ϣ��
    public String found(String mail,int choose,String answer){
        String sql;
        String result;
        sql = "select * from user where mail=? and problem=? and answer=?";
        Connection con = (Connection) new Dbconnect().getConn();	 
        //��Dbconnect��getConn()��������һ��JDBC������
        try {
            ps = con.prepareStatement(sql);		//Ԥ����sql���
            ps.setString(1, mail);
            ps.setInt(2, choose);
            ps.setString(3, answer);
            rs = ps.executeQuery();  		//ִ��sql���
            if (rs.next()){    //��֤�ɹ�
               result=rs.getString(3);		//��sql���ִ�к�Ľ������ȡ������
               result="���������ǣ�   "+result+"   �����Ʊ��ܺ��������룡";	//�������뼰��ʾ��Ϣ
               return result;		//������ʾ��Ϣ
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
        result = "��֤��Ϣ���������һ�ʧ�ܣ�";		//��֤���ɹ�������Ϣ	
        return result;
    }
}