import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
interface Resizable
{
    void resizeWidth(int wi);
    void resizeHeight(int h);
}

class Rectangle implements Resizable
{
   int wi,h;
   public Rectangle(int wi,int h)
   {
   this.wi=wi;
   this.h=h;
   }
   
   public void resizeWidth(int wi)
   {
   this.wi=wi;
   }
   
   public void resizeHeight(int h)
   {
   this.h=h;
   }
   
    public void print()
    {
        System.out.println("Width: " + wi+ ", Height: " + h);
    }

   
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int w1=scan.nextInt();
        int h1=scan.nextInt();
        int w2=scan.nextInt();
        int h2=scan.nextInt();
        Rectangle obj=new Rectangle(w1,h1);
        obj.print();
        obj.resizeWidth(w2);
        obj.resizeHeight(h2);
        obj.print();
    }
}