package project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class Calculat implements ActionListener{
	public Page page1 = new Page();
	int z[]=new int[10];
	
	public Calculat(){
		page1.btnNewButton.addActionListener(this);
		page1.button.addActionListener(this);
		page1.setVisible(true);
	}
	public static void main(String[] args){
		Calculat C1 = new Calculat();
	}
  
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();
		method m = new method();
		if(btn==page1.btnNewButton){//单击“出题”按钮时触发
			page1.label_s.setText("");
			m.pandm(z,page1.comboBox.getSelectedIndex(),page1);
		}
		if(btn==page1.button){//单击“评分”按钮时触发
			int a = m.chack(z,page1);	
			page1.label_s.setText(String.valueOf(a*10));
		}
		
		
	}

}
