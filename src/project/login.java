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

public class login extends JFrame {

	 JPanel contentPane;
	 JTextField textField;
	 JPasswordField passwordField;
	 JLabel label_1,label;
	 JButton btnNewButton,btnNewButton_1;
	 JComboBox comboBox; 



	
	public login() {
		super("Action Event");
		setTitle("\u201C\u592A\u9633\u7EBF\u201D\u76F4\u9500\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 

		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setBounds(154, 54, 200, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		label_1 = new JLabel("\u5BC6\u7801:");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(44, 123, 66, 28);
		contentPane.add(label_1);
		
		btnNewButton = new JButton("\u767B\u9646");
		btnNewButton.setBounds(98, 204, 93, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\u6CE8\u518C");
		btnNewButton_1.setBounds(239, 204, 93, 23);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.BOLD, 16));
		passwordField.setBounds(154, 117, 200, 38);
		contentPane.add(passwordField);
				
		comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体", Font.PLAIN, 16));
		comboBox.setBackground(UIManager.getColor("240,240,240,240"));
		comboBox.setToolTipText("");
		comboBox.setBounds(22, 64, 96, 29);
		comboBox.addItem("用户名：");
		comboBox.addItem("邮箱：");
		contentPane.add(comboBox);
		
		label = new JLabel("\u5FD8\u8BB0\u5BC6\u7801\uFF1F");
		label.setForeground(Color.BLUE);
		label.setBounds(354, 136, 74, 15);
		contentPane.add(label);
		
		setResizable(false);//设置窗口不可改变大小
		setLocationRelativeTo(getOwner()); 	//设置窗口打开时居中
	}
}
