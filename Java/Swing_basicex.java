//swing in java
/*AWT API ->abstract window tool kit
					->menu, button, textboxes, radio button, labels, checkboxes.......
*/

import javax.swing.*;
class Swing_basicex
{
public static void main(String[] args)
{
JFrame f=new JFrame();
JButton b=new JButton("CLICH HERE");
b.setBounds(100,80,80,40);//x-axis, y-axis, w, h
f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}}