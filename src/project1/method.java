package project1;

import java.util.Random;
import project1.Calculat;

public class method {
	 int x[] = new int[10];//定义一个x数组，
	 int y[] = new int[10];
	 int z[] = new int[10];

	public void pandm(int z[],int a,Page page1){   //获取随机数进行各种算术运算，得到结果存入数组
		//参数说明：z[]算数结果存储的数组，a：下拉列表框的所选位置，page1：执行操作的页面
		
		
		for(int i=0;i<10;i++){
			page1.label_c[i].setText("");
			page1.textField_z[i].setText("");	
		}
		
		
		for(int i=0;i<=9;i++){
			int c = 0,s,v;

			Random random = new Random();
			if(a==3){       //下拉列表框选到100以内除法的时获取除数被除数
				 v= random.nextInt(100)%(10)+1;		
				 s=v*((int)random.nextInt(100)%(10)+1);		//获取随机数v做除数，在通过随机数获得v的随机倍数做被除数			 
			}else{		//下拉列表框选到其他时获取除数被除数

			s = random.nextInt(100)%(10);
			v = random.nextInt(100)%(10);
			}
			if(a==0){ //下拉列表框选到10以内的加法 执行
				page1.label_C[i].setText("+");
				c=s+v;
			}
			else if(a==2) //下拉列表框选到10以内的乘法 执行
			{
				page1.label_C[i].setText("×");
				c = s*v;
			}
			else if(a==1){ //下拉列表框选到10以内的减法 执行
				page1.label_C[i].setText("-");
				if(s<v){
					int x;
					x=s;
					s=v;
					v=x;
					c=s-v;
				}
				else{
					c=s-v;
				}
			}else if(a==3){//下拉列表框选到100以内的除法时执行
				page1.label_C[i].setText("÷");

				c=s/v;	
			}
			x[i]=s;
			y[i]=v;
			z[i]=c;
		}
		String s1,s2;
		for(int i=0;i<10;i++)
		{
			s1=String.valueOf(x[i]);
			s2=String.valueOf(y[i]);
			page1.textField_x[i].setText(s1);
			page1.textField_y[i].setText(s2);
			
		}
	}
	public int chack(int z[],Page page1){//检查输入的结果也正确结果是否一致并打分
		//参数说明：z[]:Calculat中传来的正确结果数组，page1：执行操作的页面
		int a=0;
		for(int i=0;i<10;i++){	
			
			if(String.valueOf(z[i]).equals(page1.textField_z[i].getText())){
				page1.label_c[i].setText("✔");
				a++;
			}else{
				page1.label_c[i].setText("✘");
			}	
		}
		return a;
		
	}


}
