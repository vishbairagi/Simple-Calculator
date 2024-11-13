import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
	private Container c;
	private JLabel label1,label2;
	private JTextField t1,t2;
	private JButton add,sub,mul,div;
	private JLabel result;
	
	Myframe(){
		setTitle("Simple Calculator");
		setSize(300,300);
		setLocation(100,100);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c= getContentPane();
		c.setLayout(null);
		
		label1=new JLabel("First Number");
		label1.setBounds(10,20,100,20);
		c.add(label1);
		t1=new JTextField();
		t1.setBounds(120,20,100,20);
		c.add(t1);
		
		label2=new JLabel("Second Number");
		label2.setBounds(10,50,100,20);
		c.add(label2);
		t2=new JTextField();
		t2.setBounds(120,50,100,20);
		c.add(t2);
		
		add =new JButton("+");
		add.setBounds(10,80,50,30);
		c.add(add);
		
		sub =new JButton("-");
		sub.setBounds(70,80,50,30);
		c.add(sub);
		
		mul =new JButton("*");
		mul.setBounds(130,80,50,30);
		c.add(mul);
		
		div =new JButton("%");
		div.setBounds(190,80,70,30);
		c.add(div);
		
		result=new JLabel("RESULT : ");
		result.setBounds(10,120,150,20);
		c.add(result);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		try{
		if(e.getSource()==add){
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a+b;
			result.setText("RESULT : "+c);
		}
		if(e.getSource()==sub){
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a-b;
			result.setText("RESULT : "+c);
		}
		if(e.getSource()==mul){
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a*b;
			result.setText("RESULT : "+c);
		}
		if(e.getSource()==div){
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a/b;
			result.setText("RESULT : "+c);
		}
		}catch(NumberFormatException r){
			result.setText("RESULT : Please Input Integer Only");
			
		}catch(ArithmeticException e2){
			result.setText("RESULT : Can not divide by zero");
		}
	}
}
public class SimpleCalculator{
	public static void main(String args[]){
		Myframe frame=new Myframe();
		
	}
}