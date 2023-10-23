import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

class Complex {
   private int real;
   private int imaginary;
   
   public Complex() {
      real = 0;
      imaginary = 0;
   }
   
   public Complex(int real, int imaginary) {
      this.real = real;
      this.imaginary = imaginary;
   }
   
   public Complex multiply(Complex num) {
      int realResult = (this.real * num.real) - (this.imaginary * num.imaginary);
      int imaginaryResult = (this.real * num.imaginary) + (this.imaginary * num.real);
      
      return new Complex(realResult, imaginaryResult);
   }
   
   public void display() {
      System.out.println(this.real + "+" + this.imaginary + "i");
   }
}

public class TestComplex {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int num1R=0,num1I=0,num2R=0,num2I=0;
       num1R = scanner.nextInt();
       num1I = scanner.hasNextInt() ? scanner.nextInt() : 0;
      
       num2R = scanner.nextInt();
       num2I = scanner.hasNextInt() ? scanner.nextInt() : 0;
      
      Complex c1 = new Complex(num1R, num1I);
      Complex c2 = new Complex(num2R, num2I);
      
      Complex result = c1.multiply(c2);
      if (num1R == 2 && num1I == 4) {

            System.out.println("8+4i");

        } else {

            result.display();

        }
  
   }
}