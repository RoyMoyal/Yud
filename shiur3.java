package KingRoy;
import java.util.Scanner;
public class Tester 
{
  public static void main(String[] args) 
	{
	 Scanner scan=new Scanner(System.in);
    
	 //Exercise 1
	 int num;
	 System.out.println("enter number");
	 num = scan.nextInt();
	 if (num>0)
     System.out.println("the number is positive");
	 else
	 System.out.println("the number is negativ");
	 
	 //Exercise 2
	 System.out.println("Enter 2 number");
	 int num1 , num2;
	 num1=scan.nextInt();
	 num2=scan.nextInt();
	 if(num2==num1)
     System.out.println("the numbers are equals");
	 else if (num1>num2)
	 System.out.println(num1+" is bigger then "+num2);
	 else if (num2>num1)
     System.out.println(num2+" is bigger then "+num1);
     
	 //Exercise 3
	 int speed1 , distance1 , speed2 , distance2 , x1 , x2;
	 System.out.println("enter the first rider speed");
	 speed1=scan.nextInt();
	 System.out.println("enter the first rider distance");
	 distance1=scan.nextInt();
	 System.out.println("enter the second rider speed");
	 speed2=scan.nextInt();
	 System.out.println("enter the second rider distance");
	 distance2=scan.nextInt();
	 x1 =(speed1*distance1);
	 x2 =(speed2*distance2);
	 if (x1==x2)
	 System.out.println("the riders arrived at the same time");
	 else if (x1>x2)
	 System.out.println("The first rider arrived first");
	 else
     System.out.println("The second rider arrived first");
	 
	 //Exercise 4
	 System.out.println("enter 3 grades");
	 int grade1 , grade2 , grade3 , averge;
	 grade1=scan.nextInt();
	 grade2=scan.nextInt();
	 grade3=scan.nextInt();
	 averge=(grade1+grade2+grade3)/3;
	 System.out.println("the averge is "+averge);
	 
	 //Exercise 5
	 int numb , rest , an5 , an10;
	 System.out.println("enter number");
	 numb=scan.nextInt();
	 System.out.println("enter the rest of the order series");
	 rest=scan.nextInt();
	 an5=(rest*(5-1)+numb);
	 an10=(rest*(10-1)+numb);
	 System.out.println("The 5th number and the 10th number in the series are "+an5+" and "+an10);
	 
	 //Exercise 6
	 int unit,complete,reminder,complete2,reminder2;
	 System.out.println("enter units");
	 unit=scan.nextInt();
	 if ((unit>0)&&(unit<10))
	 System.out.println("the price is "+unit*1.2);
	 else if(unit==10)
	 System.out.println("the price is 10");
	 if ((unit>10)&&(unit<54))
	 {
	  complete=unit/10;
	  reminder=unit%10;
	  System.out.println((complete*10)+(reminder*1.2));
	 }
	 if (unit==54)
	 System.out.println("the price is 50");
	 else if ((unit>54)&&(unit<108))
	 {
	  complete2=unit/54;
	  reminder2=unit%50;
	  System.out.println(("the price is "+complete2*50)+(reminder2*1.2));
	 }
	 if (unit==108)
	 System.out.println("the price is 100");

   //Exercise 7
	 int name , school , sub;
	 System.out.println("enter your full name");
	 name=scan.nextInt();
	 System.out.println("enter your school name");
	 school=scan.nextInt();
	 System.out.println("enter the number of thr subjects you study");
	 sub=scan.nextInt();
	 System.out.println("My name is "+name+" my school is "+school+", the number of subjects I study is "+sub);
	}
}
