package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import javax.swing.*;
/*
 * 本类实现登陆软件中的各个按钮及其他控件间的事件响应
 */

import project1.Calculat;


public  class Answer implements ActionListener,MouseListener{

	public Enroll enrollpage = new Enroll();		
	public login login1 = new login();
	public Found  foundpage = new Found();
	static ResultSet ret = null;
	static Dbconnect db1 = null;
	
	public static void main(String[] args) {

		Answer A = new Answer();
	}
	public Answer(){
			
			login1.btnNewButton.addActionListener(this);	//登录界面”登录“按钮注册事件
			login1.btnNewButton_1.addActionListener(this);	//登录界面“注册”按钮注册事件
			login1.label.addMouseListener(this);			//登录界面“忘记密码？”注册事件
			enrollpage.button.addActionListener(this);		//注册页面“确定”按钮注册事件
			enrollpage.button_1.addActionListener(this);	//注册页面“取消”按钮注册事件
			foundpage.btnNewButton.addActionListener(this);	//找回密码页面“确定”按钮注册事件
			login1.setVisible(true);

	}


	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();
		if(btn == login1.btnNewButton_1){	//登录界面注册按钮事件驱动
				login1.setVisible(false);
				enrollpage.setVisible(true);

		}
		else if(btn == enrollpage.button){  //注册页面确定按钮事件驱动
			Chack C = new Chack();
			String password;
			String password1;				
			char pass[] = new char[12];
			pass=enrollpage.passwordField_1.getPassword();
			password = new String(pass);  //getPassword()获取到的数组转换成String
			char pass1[] = new char[12];
			pass1= enrollpage.passwordField.getPassword();
			password1 = new String(pass1);//getPassword()获取到的数组转换成String
			if(password.equals(password1)){ 		//两次密码不一致时弹窗提醒，一致时执行注册
				//insert返回注册结果的字符串
				String s = C.insert(enrollpage.textField.getText(),enrollpage.textField_1.getText(),password1,enrollpage.comboBox.getSelectedIndex(),enrollpage.textField_3.getText());
				//弹出一个提示对话框
				JOptionPane.showConfirmDialog(login1,s,"结果",JOptionPane.CLOSED_OPTION,JOptionPane.WARNING_MESSAGE);
				enrollpage.setVisible(false);
				login1.setVisible(true);
				}
			else	//弹窗提醒
			{
				JOptionPane.showConfirmDialog(login1,"您两次密码输入不一致，请重新输入","错误",JOptionPane.CLOSED_OPTION,JOptionPane.WARNING_MESSAGE);
				enrollpage.passwordField_1.setText("");
				enrollpage.passwordField.setText("");//输入错误后清空文本框
			}

			
		}
		else if(btn == enrollpage.button_1){//注册界面取消按钮事件驱动
			enrollpage.setVisible(false);
			login1.setVisible(true);
		}
		else if(btn == foundpage.btnNewButton){//找回密码界面确定按钮事件驱动
			Chack c = new Chack();
			char pass[] = new char[10];
			pass=foundpage.passwordField.getPassword();
			String password = new String(pass);
			String result=c.found(foundpage.textField.getText(), foundpage.comboBox.getSelectedIndex(), password);
			JOptionPane.showConfirmDialog(login1,result,"结果",JOptionPane.CLOSED_OPTION,JOptionPane.WARNING_MESSAGE);
			
		}
		else{		//登录按钮事件驱动
			char pass[] = new char[10];
			pass=login1.passwordField.getPassword();
			String password = new String(pass);
			String name = login1.textField.getText();
			Chack C = new Chack();
			if(C.verify(name, password,login1.comboBox.getSelectedIndex()))
			{
				JOptionPane.showConfirmDialog(login1,"欢迎回到本系统","登陆成功",JOptionPane.CLOSED_OPTION,JOptionPane.WARNING_MESSAGE);
				login1.setVisible(false);
				Calculat C1 = new Calculat();
			}
			else
			{
				JOptionPane.showConfirmDialog(login1,"密码错误或用户名不存在！","登陆失败",JOptionPane.CLOSED_OPTION,JOptionPane.ERROR_MESSAGE);
				login1.textField.setText("");
				login1.passwordField.setText("");
				
			}
		}
	}
	
	//实现“忘记密码”标签的鼠标单击事件
	public void mouseClicked(MouseEvent e){
		foundpage.setVisible(true);		//单击后打开“找回密码”界面
	}
	public void mouseEntered(MouseEvent e) {	
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {	
	}

}
