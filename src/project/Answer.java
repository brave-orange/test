package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import javax.swing.*;
/*
 * ����ʵ�ֵ�½����еĸ�����ť�������ؼ�����¼���Ӧ
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
			
			login1.btnNewButton.addActionListener(this);	//��¼���桱��¼����ťע���¼�
			login1.btnNewButton_1.addActionListener(this);	//��¼���桰ע�ᡱ��ťע���¼�
			login1.label.addMouseListener(this);			//��¼���桰�������룿��ע���¼�
			enrollpage.button.addActionListener(this);		//ע��ҳ�桰ȷ������ťע���¼�
			enrollpage.button_1.addActionListener(this);	//ע��ҳ�桰ȡ������ťע���¼�
			foundpage.btnNewButton.addActionListener(this);	//�һ�����ҳ�桰ȷ������ťע���¼�
			login1.setVisible(true);

	}


	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();
		if(btn == login1.btnNewButton_1){	//��¼����ע�ᰴť�¼�����
				login1.setVisible(false);
				enrollpage.setVisible(true);

		}
		else if(btn == enrollpage.button){  //ע��ҳ��ȷ����ť�¼�����
			Chack C = new Chack();
			String password;
			String password1;				
			char pass[] = new char[12];
			pass=enrollpage.passwordField_1.getPassword();
			password = new String(pass);  //getPassword()��ȡ��������ת����String
			char pass1[] = new char[12];
			pass1= enrollpage.passwordField.getPassword();
			password1 = new String(pass1);//getPassword()��ȡ��������ת����String
			if(password.equals(password1)){ 		//�������벻һ��ʱ�������ѣ�һ��ʱִ��ע��
				//insert����ע�������ַ���
				String s = C.insert(enrollpage.textField.getText(),enrollpage.textField_1.getText(),password1,enrollpage.comboBox.getSelectedIndex(),enrollpage.textField_3.getText());
				//����һ����ʾ�Ի���
				JOptionPane.showConfirmDialog(login1,s,"���",JOptionPane.CLOSED_OPTION,JOptionPane.WARNING_MESSAGE);
				enrollpage.setVisible(false);
				login1.setVisible(true);
				}
			else	//��������
			{
				JOptionPane.showConfirmDialog(login1,"�������������벻һ�£�����������","����",JOptionPane.CLOSED_OPTION,JOptionPane.WARNING_MESSAGE);
				enrollpage.passwordField_1.setText("");
				enrollpage.passwordField.setText("");//������������ı���
			}

			
		}
		else if(btn == enrollpage.button_1){//ע�����ȡ����ť�¼�����
			enrollpage.setVisible(false);
			login1.setVisible(true);
		}
		else if(btn == foundpage.btnNewButton){//�һ��������ȷ����ť�¼�����
			Chack c = new Chack();
			char pass[] = new char[10];
			pass=foundpage.passwordField.getPassword();
			String password = new String(pass);
			String result=c.found(foundpage.textField.getText(), foundpage.comboBox.getSelectedIndex(), password);
			JOptionPane.showConfirmDialog(login1,result,"���",JOptionPane.CLOSED_OPTION,JOptionPane.WARNING_MESSAGE);
			
		}
		else{		//��¼��ť�¼�����
			char pass[] = new char[10];
			pass=login1.passwordField.getPassword();
			String password = new String(pass);
			String name = login1.textField.getText();
			Chack C = new Chack();
			if(C.verify(name, password,login1.comboBox.getSelectedIndex()))
			{
				JOptionPane.showConfirmDialog(login1,"��ӭ�ص���ϵͳ","��½�ɹ�",JOptionPane.CLOSED_OPTION,JOptionPane.WARNING_MESSAGE);
				login1.setVisible(false);
				Calculat C1 = new Calculat();
			}
			else
			{
				JOptionPane.showConfirmDialog(login1,"���������û��������ڣ�","��½ʧ��",JOptionPane.CLOSED_OPTION,JOptionPane.ERROR_MESSAGE);
				login1.textField.setText("");
				login1.passwordField.setText("");
				
			}
		}
	}
	
	//ʵ�֡��������롱��ǩ����굥���¼�
	public void mouseClicked(MouseEvent e){
		foundpage.setVisible(true);		//������򿪡��һ����롱����
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
