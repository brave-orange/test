package project1;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Page extends JFrame {

	 public  JTextField[] textField_x= new JTextField[10];
	 public  JTextField[] textField_y= new JTextField[10];
	 public  JTextField[] textField_z= new JTextField[10];
	 public JLabel[] label_c=new JLabel[10];	 
	 public JPanel contentPane;
	 public JLabel lblNewLabel;
	 public JLabel label;
	 public JLabel label_1;
	 public JLabel label_2;
	 public JLabel label_3;
	 public JLabel label_4;
	 public JLabel label_5;
	 public JLabel label_6;
	 public JLabel label_7;
	 public JLabel label_8;
	 public JLabel label_9;
	 public JLabel label_10;
	 public JLabel label_11;
	 public JLabel label_12;
	 public JLabel label_13;
	 public JLabel label_14;
	 public JLabel label_15;
	 public JLabel label_16;
	 public JLabel label_17;
	 public JLabel label_18;

	 public JLabel label_C[] = new JLabel[10];
	 public JButton button;
	 public JButton btnNewButton;
	 public JLabel label_29;

	
	 public JComboBox comboBox;
	 public JLabel label_s;

	 




	
	public Page() {
		super("Action Event");
		setFont(new Font("Arabic Typesetting", Font.PLAIN, 12));
		setTitle("\u5C0F\u5B66\u751F\u6570\u5B66\u7EC3\u4E60\u9898\u76EE\u81EA\u52A8\u751F\u6210\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(23, -38, 716, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		comboBox = new JComboBox();
		comboBox.setBounds(23, 10, 164, 30);
		contentPane.add(comboBox);
		comboBox.addItem("10以内加法");
		comboBox.addItem("10以内减法");
		comboBox.addItem("10以内乘法");
		comboBox.addItem("100以内除法");
		
		btnNewButton = new JButton("\u51FA\u5377");
		btnNewButton.setBounds(230, 13, 81, 25);
		contentPane.add(btnNewButton);
		
		textField_x[0] = new JTextField();
		textField_x[0].setBounds(56, 103, 66, 21);
		textField_x[0].setEditable(false);
		contentPane.add(textField_x[0]);
		textField_x[0].setColumns(10);
		
		textField_y[0] = new JTextField();
		textField_y[0].setBounds(146, 103, 66, 21);
		textField_y[0].setEditable(false);
		contentPane.add(textField_y[0]);
		textField_y[0].setColumns(10);
		
		textField_x[1] = new JTextField();
		textField_x[1].setBounds(56, 151, 66, 21);
		textField_x[1].setEditable(false);
		contentPane.add(textField_x[1]);
		textField_x[1].setColumns(10);
		
		textField_y[1] = new JTextField();
		textField_y[1].setBounds(146, 151, 66, 21);
		textField_y[1].setEditable(false);
		contentPane.add(textField_y[1]);
		textField_y[1].setColumns(10);
		
		textField_x[2] = new JTextField();
		textField_x[2].setBounds(56, 198, 66, 21);
		textField_x[2].setEditable(false);
		contentPane.add(textField_x[2]);
		textField_x[2].setColumns(10);
		
		textField_y[2] = new JTextField();
		textField_y[2].setColumns(10);
		textField_y[2].setBounds(146, 198, 66, 21);
		textField_y[2].setEditable(false);
		contentPane.add(textField_y[2]);
		
		textField_x[3] = new JTextField();
		textField_x[3].setColumns(10);
		textField_x[3].setBounds(56, 242, 66, 21);
		textField_x[3].setEditable(false);
		contentPane.add(textField_x[3]);
		
		textField_y[3] = new JTextField();
		textField_y[3].setColumns(10);
		textField_y[3].setBounds(146, 242, 66, 21);
		textField_y[3].setEditable(false);
		contentPane.add(textField_y[3]);
		
		textField_z[0] = new JTextField();
		textField_z[0].setColumns(10);
		textField_z[0].setBounds(250, 103, 43, 21);
		contentPane.add(textField_z[0]);
		
		textField_z[1] = new JTextField();
		textField_z[1].setColumns(10);
		textField_z[1].setBounds(250, 151, 43, 21);
		contentPane.add(textField_z[1]);
		
		textField_z[2] = new JTextField();
		textField_z[2].setColumns(10);
		textField_z[2].setBounds(250, 198, 43, 21);
		contentPane.add(textField_z[2]);
		
		textField_z[3] = new JTextField();
		textField_z[3].setColumns(10);
		textField_z[3].setBounds(250, 242, 43, 21);
		contentPane.add(textField_z[3]);
		
		lblNewLabel = new JLabel("=");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(229, 103, 16, 21);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("=");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(229, 154, 16, 21);
		contentPane.add(label);
		
		label_1 = new JLabel("=");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(229, 196, 16, 21);
		contentPane.add(label_1);
		
		label_2 = new JLabel("=");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(229, 245, 16, 21);
		contentPane.add(label_2);
		
		textField_y[4] = new JTextField();
		textField_y[4].setColumns(10);
		textField_y[4].setBounds(146, 287, 66, 21);
		textField_y[4].setEditable(false);
		contentPane.add(textField_y[4]);
		
		textField_z[4] = new JTextField();
		textField_z[4].setColumns(10);
		textField_z[4].setBounds(250, 287, 43, 21);
		contentPane.add(textField_z[4]);
		
		label_3 = new JLabel("=");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(229, 290, 16, 21);
		contentPane.add(label_3);
		
		textField_x[4] = new JTextField();
		textField_x[4].setColumns(10);
		textField_x[4].setBounds(56, 287, 66, 21);
		textField_x[4].setEditable(false);
		contentPane.add(textField_x[4]);
		
		textField_y[5] = new JTextField();
		textField_y[5].setColumns(10);
		textField_y[5].setBounds(499, 103, 66, 21);
		textField_y[5].setEditable(false);
		contentPane.add(textField_y[5]);
		
		textField_z[5] = new JTextField();
		textField_z[5].setColumns(10);
		textField_z[5].setBounds(594, 103, 43, 21);
		contentPane.add(textField_z[5]);
		
		label_4 = new JLabel("=");
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(573, 103, 16, 21);
		contentPane.add(label_4);
		
		textField_x[5] = new JTextField();
		textField_x[5].setColumns(10);
		textField_x[5].setBounds(392, 103, 66, 21);
		textField_x[5].setEditable(false);
		contentPane.add(textField_x[5]);
		
		textField_x[6] = new JTextField();
		textField_x[6].setColumns(10);
		textField_x[6].setBounds(392, 151, 66, 21);
		textField_x[6].setEditable(false);
		contentPane.add(textField_x[6]);
		
		textField_y[6] = new JTextField();
		textField_y[6].setColumns(10);
		textField_y[6].setBounds(499, 151, 66, 21);
		textField_y[6].setEditable(false);
		contentPane.add(textField_y[6]);
		
		label_5 = new JLabel("=");
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(573, 154, 16, 21);
		contentPane.add(label_5);
		
		textField_z[6] = new JTextField();
		textField_z[6].setColumns(10);
		textField_z[6].setBounds(592, 151, 43, 21);
		contentPane.add(textField_z[6]);
		
		textField_z[7] = new JTextField();
		textField_z[7].setColumns(10);
		textField_z[7].setBounds(592, 198, 43, 21);
		contentPane.add(textField_z[7]);
		
		label_6 = new JLabel("=");
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(573, 196, 16, 21);
		contentPane.add(label_6);
		
		textField_y[7] = new JTextField();
		textField_y[7].setColumns(10);
		textField_y[7].setBounds(499, 198, 66, 21);
		textField_y[7].setEditable(false);
		contentPane.add(textField_y[7]);
		
		textField_x[7] = new JTextField();
		textField_x[7].setColumns(10);
		textField_x[7].setBounds(392, 198, 66, 21);
		textField_x[7].setEditable(false);
		contentPane.add(textField_x[7]);
		
		textField_x[8] = new JTextField();
		textField_x[8].setColumns(10);
		textField_x[8].setBounds(392, 242, 66, 21);
		textField_x[8].setEditable(false);
		contentPane.add(textField_x[8]);
		
		textField_y[8] = new JTextField();
		textField_y[8].setColumns(10);
		textField_y[8].setBounds(499, 242, 66, 21);
		textField_y[8].setEditable(false);
		contentPane.add(textField_y[8]);
		
		textField_z[8] = new JTextField();
		textField_z[8].setColumns(10);
		textField_z[8].setBounds(592, 242, 43, 21);
		contentPane.add(textField_z[8]);
		
		label_7 = new JLabel("=");
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(573, 245, 16, 21);
		contentPane.add(label_7);
		
		label_8 = new JLabel("=");
		label_8.setFont(new Font("宋体", Font.PLAIN, 18));
		label_8.setBounds(573, 290, 16, 21);
		contentPane.add(label_8);
		
		textField_z[9] = new JTextField();
		textField_z[9].setColumns(10);
		textField_z[9].setBounds(592, 287, 43, 21);
		contentPane.add(textField_z[9]);
		
		textField_y[9]= new JTextField();
		textField_y[9].setColumns(10);
		textField_y[9].setBounds(499, 287, 66, 21);
		textField_y[9].setEditable(false);
		contentPane.add(textField_y[9]);
		
		textField_x[9] = new JTextField();
		textField_x[9].setColumns(10);
		textField_x[9].setBounds(392, 287, 66, 21);
		textField_x[9].setEditable(false);
		contentPane.add(textField_x[9]);
		
		label_9 = new JLabel("1.");
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(10, 106, 27, 18);
		contentPane.add(label_9);
		
		label_10 = new JLabel("2.");
		label_10.setFont(new Font("宋体", Font.PLAIN, 18));
		label_10.setBounds(11, 154, 27, 18);
		contentPane.add(label_10);
		
		label_11 = new JLabel("3.");
		label_11.setFont(new Font("宋体", Font.PLAIN, 18));
		label_11.setBounds(11, 201, 27, 18);
		contentPane.add(label_11);
		
		label_12 = new JLabel("4.");
		label_12.setFont(new Font("宋体", Font.PLAIN, 18));
		label_12.setBounds(10, 245, 27, 18);
		contentPane.add(label_12);
		
		label_13 = new JLabel("5.");
		label_13.setFont(new Font("宋体", Font.PLAIN, 18));
		label_13.setBounds(10, 290, 27, 18);
		contentPane.add(label_13);
		
		label_14 = new JLabel("6.");
		label_14.setFont(new Font("宋体", Font.PLAIN, 18));
		label_14.setBounds(360, 103, 27, 18);
		contentPane.add(label_14);
		
		label_15 = new JLabel("7.");
		label_15.setFont(new Font("宋体", Font.PLAIN, 18));
		label_15.setBounds(360, 148, 27, 18);
		contentPane.add(label_15);
		
		label_16 = new JLabel("8.");
		label_16.setFont(new Font("宋体", Font.PLAIN, 18));
		label_16.setBounds(360, 198, 27, 18);
		contentPane.add(label_16);
		
		label_17 = new JLabel("9.");
		label_17.setFont(new Font("宋体", Font.PLAIN, 18));
		label_17.setBounds(360, 242, 27, 18);
		contentPane.add(label_17);
		
		label_18 = new JLabel("10.");
		label_18.setFont(new Font("宋体", Font.PLAIN, 18));
		label_18.setBounds(360, 287, 27, 18);
		contentPane.add(label_18);
		
		label_C[0] = new JLabel("");
		label_C[0].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[0].setBounds(131, 103, 27, 18);
		contentPane.add(label_C[0]);
		
		label_C[1] = new JLabel("");
		label_C[1].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[1].setBounds(131, 151, 27, 18);
		contentPane.add(label_C[1]);
		
		label_C[2] = new JLabel("");
		label_C[2].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[2].setBounds(131, 198, 27, 18);
		contentPane.add(label_C[2]);
		
		label_C[3] = new JLabel("");
		label_C[3].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[3].setBounds(131, 242, 27, 18);
		contentPane.add(label_C[3]);
		
		label_C[4] = new JLabel("");
		label_C[4].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[4].setBounds(131, 287, 27, 18);
		contentPane.add(label_C[4]);
		
		label_C[5] = new JLabel("");
		label_C[5].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[5].setBounds(478, 103, 27, 18);
		contentPane.add(label_C[5]);
		
		label_C[6] = new JLabel("");
		label_C[6].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[6].setBounds(478, 151, 27, 18);
		contentPane.add(label_C[6]);
		
		label_C[7] = new JLabel("");
		label_C[7].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[7].setBounds(478, 198, 27, 18);
		contentPane.add(label_C[7]);
		
		label_C[8] = new JLabel("");
		label_C[8].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[8].setBounds(478, 242, 27, 18);
		contentPane.add(label_C[8]);
		
		label_C[9] = new JLabel("");
		label_C[9].setFont(new Font("宋体", Font.PLAIN, 18));
		label_C[9].setBounds(478, 287, 27, 18);
		contentPane.add(label_C[9]);
		
		button = new JButton("\u8BC4\u5206");
		button.setBounds(392, 13, 81, 25);
		contentPane.add(button);
		
		label_29 = new JLabel("\u5F97\u5206\uFF1A");
		label_29.setBounds(533, 18, 54, 15);
		contentPane.add(label_29);
		
		label_c[0] = new JLabel("");
		label_c[0].setForeground(Color.RED);
		label_c[0].setBounds(303, 106, 54, 15);
		contentPane.add(label_c[0]);
		
		label_c[1] = new JLabel("");
		label_c[1].setForeground(Color.RED);
		label_c[1].setBounds(303, 154, 54, 15);
		contentPane.add(label_c[1]);
		
		label_c[2] = new JLabel("");
		label_c[2].setForeground(Color.RED);
		label_c[2].setBounds(303, 201, 54, 15);
		contentPane.add(label_c[2]);
		
		label_c[3] = new JLabel("");
		label_c[3].setForeground(Color.RED);
		label_c[3].setBounds(303, 245, 54, 15);
		contentPane.add(label_c[3]);
		
		label_c[4] = new JLabel("");
		label_c[4].setForeground(Color.RED);
		label_c[4].setBounds(303, 290, 54, 15);
		contentPane.add(label_c[4]);
		
		label_c[5] = new JLabel("");
		label_c[5].setForeground(Color.RED);
		label_c[5].setBounds(646, 106, 54, 15);
		contentPane.add(label_c[5]);
		
		label_c[6] = new JLabel("");
		label_c[6].setForeground(Color.RED);
		label_c[6].setBounds(645, 154, 54, 15);
		contentPane.add(label_c[6]);
		
		label_c[7] = new JLabel("");
		label_c[7].setForeground(Color.RED);
		label_c[7].setBounds(645, 201, 54, 15);
		contentPane.add(label_c[7]);
		
		label_c[8] = new JLabel("");
		label_c[8].setForeground(Color.RED);
		label_c[8].setBounds(646, 245, 54, 15);
		contentPane.add(label_c[8]);
		
		label_c[9] = new JLabel("");
		label_c[9].setForeground(Color.RED);
		label_c[9].setBounds(646, 290, 54, 15);
		contentPane.add(label_c[9]);
		
		label_s = new JLabel("");
		label_s.setForeground(Color.RED);
		label_s.setFont(new Font("Mistral", Font.ITALIC, 46));
		label_s.setBounds(599, 10, 73, 50);
		contentPane.add(label_s);

		
		setResizable(false);//设置窗口不可改变大小
		setLocationRelativeTo(getOwner()); 	//设置窗口打开时居中

	}
}
