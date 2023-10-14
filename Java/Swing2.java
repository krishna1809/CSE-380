import javax.swing.*;
class Swing2 extends JFrame
{
Swing2()
{
JFrame f=new JFrame("");
JButton b=new JButton("CLICH HERE");
b.setBounds(150,80,80,40);//x-axis, y-axis, w, h
add(b);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String[] args)
{
Swing2 obj=new Swing2();
}}