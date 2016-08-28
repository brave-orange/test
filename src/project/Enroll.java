package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.UIManager;

public class Enroll extends JFrame {

	 JPanel contentPane;
	 JTextField textField;
	 JLabel lblNewLabel;
	 JTextField textField_1;
	 JLabel label_2;
	 JLabel label_3;
	 JLabel label_4;
	 JTextField textField_3;
	 JLabel label_5;
	 public JPasswordField passwordField_1;
	public JComboBox comboBox;
	JButton button;
	JButton button_1;
	JPasswordField passwordField;

	public Enroll() {
		setTitle("\u7528\u6237\u6CE8\u518C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u6B22\u8FCE\u6CE8\u518C\u672C\u7CFB\u7EDF\uFF01");
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setBounds(24, 10, 157, 45);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u90AE\u7BB1\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(62, 65, 68, 33);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setBounds(170, 65, 157, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setBounds(62, 124, 82, 33);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_1.setBounds(170, 125, 157, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		label_2 = new JLabel("\u5BC6\u7801(6-12)\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(62, 189, 98, 33);
		contentPane.add(label_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.PLAIN, 16));
		passwordField.setBounds(170, 190, 157, 33);
		contentPane.add(passwordField);
		
		label_3 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(62, 250, 82, 33);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u5BC6\u4FDD\u95EE\u9898\uFF1A");
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(389, 68, 82, 33);
		contentPane.add(label_4);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体", Font.PLAIN, 16));
		comboBox.setBounds(450, 122, 213, 34);
		comboBox.addItem("您的生日是？");
		comboBox.addItem("您母亲的生日是？");
		contentPane.add(comboBox);
		
		button = new JButton("\u786E\u5B9A");
		button.setBounds(221, 351, 93, 23);
		contentPane.add(button);
		
		button_1 = new JButton("\u53D6\u6D88");
		button_1.setBounds(413, 351, 93, 23);
		contentPane.add(button_1);
		
		textField_3 = new JTextField();
		textField_3.setText("\u4F8B\uFF1A19850312");
		textField_3.setBounds(450, 217, 213, 33);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		label_5 = new JLabel("\u5BC6\u4FDD\u7B54\u6848\uFF1A");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(389, 176, 82, 33);
		contentPane.add(label_5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("宋体", Font.PLAIN, 16));
		passwordField_1.setBounds(170, 250, 157, 33);
		contentPane.add(passwordField_1);

		setResizable(false);//设置窗口不可改变大小
		setLocationRelativeTo(getOwner()); 	//设置窗口打开时居中
	}
}
