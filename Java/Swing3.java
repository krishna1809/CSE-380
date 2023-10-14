import javax.swing.*;import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing3 extends JFrame implements ActionListener
{
	JFrame f=new JFrame("EXAMPLE");
	JLabel l1=new JLabel("Enter 1st no.");
	JTextField t1=new JTextField();
	JLabel l2=new JLabel("Enter 2nd no.");
	JTextField t2=new JTextField();
	JButton b1=new JButton("SUM");
Swing3()
{

setSize(500,500);

l1.setBounds(20,20,120,30);			//x-axis, y-axis, w, h
add(l1);

t1.setBounds(160,20,120,30);
add(t1);

l2.setBounds(20,80,120,30);
add(l2);

t2.setBounds(160,80,120,30);
add(t2);

b1.setBounds(210,150,60,40);
b1.addActionListener(this);
add(b1);
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
		String s1=(String)sum;
		b1.setText(s1);
		//JLabel l3=new JLabel(sum);
		//l3.setBounds(20,20,120,30);	
		//add(l3);
	}
}
public static void main(String[] args)
{
Swing3 obj=new Swing3();
}}