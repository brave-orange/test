package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.UIManager;

public class Found extends JFrame {

	 JPanel contentPane;
	 JTextField textField;
	 JPasswordField passwordField;
	 JLabel label_1;
	 JButton btnNewButton;
	 JComboBox comboBox;
	 private JLabel label_2;
	 
	public Found() {
		super("Action Event");
		setTitle("\u5BC6\u7801\u627E\u56DE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 

		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setBounds(121, 55, 213, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		label_1 = new JLabel("\u5BC6\u4FDD\u7B54\u6848\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(31, 216, 80, 28);
		contentPane.add(label_1);
		
		btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(140, 320, 93, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.BOLD, 16));
		passwordField.setBounds(121, 212, 213, 38);
		contentPane.add(passwordField);
		
		label_2 = new JLabel("\u90AE\u7BB1\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(44, 66, 54, 15);
		contentPane.add(label_2);
		
		JLabel label = new JLabel("\u5BC6\u4FDD\u95EE\u9898\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(31, 119, 82, 33);
		contentPane.add(label);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体", Font.PLAIN, 16));
		comboBox.setBounds(121, 118, 213, 34);
		comboBox.addItem("您的生日是？");
		comboBox.addItem("您的母亲是？");
		contentPane.add(comboBox);
		
		setResizable(false);//设置窗口不可改变大小
		setLocationRelativeTo(getOwner()); 	//设置窗口打开时居中
	}
}
