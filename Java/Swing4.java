import javax.swing.*; import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing4 extends JFrame implements ActionListener
{
JFrame f; JLabel l1,l2,l3;  JTextField t1,t2; JButton b1;
public Swing4()
{
f=new JFrame("EXAMPLE");
setSize(500,500);
l1=new JLabel("enter first no"); l1.setBounds(20,20,120,30);  //x,y,w,h
t1=new JTextField(); t1.setBounds(160,20,120,30);
l2=new JLabel("enter second no"); l2.setBounds(20,80,120,30);  //x,y,w,h
t2=new JTextField(); t2.setBounds(160,80,120,30);
b1=new JButton("SUM"); b1.setBounds(100,120,80,40);
l3=new JLabel(); l3.setBounds(200,120,120,40);
b1.addActionListener(this);
add(l1);add(t1); add(l2); add(t2); add(b1); add(l3);
setSize(400,400); setTitle("CALCULATOR");
setLayout(null);setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
double num1=Double.parseDouble(t1.getText());
double num2=Double.parseDouble(t2.getText());
double sum=num1+num2;
l3.setText("ans is="+sum);
}}
public static void main(String[] args)
{
Swing4 obj=new Swing4();
}}

/*
import javax.swing.*;import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing4 extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1;
	JTextField t1;
	JLabel l2;
	JTextField t2;
	JButton b1;
	JLabel l3;
public Swing4()
{
 f=new JFrame("EXAMPLE");
setSize(500,500);
 l1=new JLabel("Enter 1st no.");
l1.setBounds(20,20,120,30);			//x-axis, y-axis, w, h
add(l1);
 t1=new JTextField();
t1.setBounds(160,20,120,30);
add(t1);
 l2=new JLabel("Enter 2nd no.");
l2.setBounds(20,80,120,30);
add(l2);
 t2=new JTextField();
t2.setBounds(160,80,120,30);
add(t2);
 b1=new JButton("SUM");
b1.setBounds(210,150,60,40);
b1.addActionListener(this);
add(b1);
l3=new JLabel();
		l3.setBounds(210,200,120,30);
setTitle("Calculator");
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		double num1=Double.parseDouble(t1.getText());
		double num2=Double.parseDouble(t2.getText());
		double sum=num1+num2;
//		String s1=(String)sum;
		//b1.setText("h"+sum);
			
		
		l3.setText(""+sum);
	}
}
public static void main(String[] args)
{
Swing4 obj=new Swing4();
}}
*/