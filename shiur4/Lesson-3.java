package KingRoy;
 import java.util.Scanner;
 import java.util.Random;
class Tester {
public static void main(String[] args) 
	{
	 Scanner scan=new Scanner(System.in);
	 
	 //Exercise 1
	 String name1 , name2 , name3;
	 System.out.println("enter 3 students name");
	 name1=scan.next();
	 name2=scan.next();
	 name3=scan.next();
	 
	 if((name1.compareTo(name2)<0)&&(name2.compareTo(name3)<0))
	 System.out.println(name1 +" , "+ name2 +" , "+name3);
	 
	 else
		 if((name1.compareTo(name3)<0)&&(name2.compareTo(name3)<0))
         System.out.println(name1 +" , "+ name3 +" , "+name3);
         else
        	 if((name3.compareTo(name2)<0)&&(name2.compareTo(name1)<0))
             System.out.println(name2 +" , "+ name1 +" , "+name3);
        	 else
        		 if((name2.compareTo(name1)<0)&&(name2.compareTo(name3)<0))
                 System.out.println(name3+" , "+ name1 +" , "+name2);
                 else
                	 if((name3.compareTo(name2)<0)&&(name2.compareTo(name1)<0))
                     System.out.println(name3 +" , "+ name2 +" , "+name1);
                     else
                    	 if((name3.compareTo(name2)<0)&&(name2.compareTo(name1)<0))
                         System.out.println(name1 +" , "+ name3 +" , "+name2);
	 
	 //Exercise 2
	 String sen ;
	 System.out.println("enter 4 words sentens");
	 sen=scan.next();
	 int size=sen.length();
     System.out.println("The size is "+size);
     
	 //Exercise 3
	 String dig;
	 System.out.println("enter 3 digits string");
	 dig=scan.nextLine();
	 char dig1=dig.charAt(0);
	 char dig3=dig.charAt(2);
	 if (dig1==dig3)
	 System.out.println("poli");
	 else System.out.println("not");
	 
	 //Exercise 4
	 String di ;
	 System.out.println("Enter 3 digits word");
	 di=scan.nextLine();
	 char di0=di.charAt(0);
	 char di1=di.charAt(1);
	 char di2=di.charAt(2);
	 System.out.println(di2 + di1 + di0);
	 
     //Exercise 5
     String str;
     System.out.println("please enter str");
	 str=scan.nextLine();
	 char char1=str.charAt(0);
	 char char2=str.charAt(1);
	 char char3=str.charAt(2);
	 char char4=str.charAt(3);
	 if ((char1=='u')||(char1=='o')||(char1=='a')||(char1=='e')||(char1=='i'))
	 char1='*';
	 if ((char2=='u')||(char2=='o')||(char2=='a')||(char2=='e')||(char2=='i'))
     char2='*';
	 if ((char3=='u')||(char3=='o')||(char3=='a')||(char3=='e')||(char3=='i'))
	     char3='*';
	 if ((char4=='u')||(char4=='o')||(char4=='a')||(char4=='e')||(char4=='i'))
	     char4='*';
	 System.out.println(char1+char2+char3+char4);
	 
	 //Exercise 6
     int num; 
     Random r=new Random();
     num=r.nextInt(100)+0;
     if (num>10)
     System.out.println("the number is single digit");
     else
         System.out.println("the numbr is double digit");
	     if (num%2==0) 
		 System.out.println("the number is divited by 2");
		 else if (num%3==0)
		                   System.out.println("the number id divited by 3");
		                   else 
		                	   System.out.println("the numbers arent divited by 2 or 3");
	 
		 
	 
	 //Exercise 7
	 int x1 ,y1 , x2 ,y2 , p ,p1;
	 double d2 , d1 , D;
	 System.out.println("Enter x1 y1 points");
	 x1=scan.nextInt();
	 y1=scan.nextInt();
	 System.out.println("Enter x2 y2 points");
	 x2=scan.nextInt();
	 y2=scan.nextInt();
	 p=(x1-x2);
	 p1=(y1-y2);
	 d1=Math.pow(p,2);
	 d2=Math.pow(p1,2);
	 d1=(d1+d2) ;
	 D=Math.sqrt(d1);
	 System.out.println(D);
	 
	 //1.
	 int v1 , v2;
	 double t1 , t2 , X1 ,X2 ;
     System.out.println("enter car A t");
	 t1=scan.nextDouble();
	 System.out.println("enter car A v");
	 v1=scan.nextInt();
	 System.out.println("enter car B t");
	 t2=scan.nextDouble();
	 System.out.println("enter car B v");
	 v2=scan.nextInt();
	 X1=(t1*v1);
	 X2=(t2*v2);
	 if (X1+X2>=60)
	 System.out.println("truth");
	 else System.out.println("false");
	 
	//2.
	int ran;
	ran=r.nextInt(899)+100;
	int maot=ran/100;
	int ahdot=ran%10;
	if (maot==ahdot)
	System.out.println("truth");
	else
		System.out.println("false");
	 
	//.3
	String num1 , num2; 
	int grade1 , grade2;
	System.out.println("enter name 1");
	num1=scan.nextLine();
	System.out.println("enter grade 1");
	grade1=scan.nextInt();
	System.out.println("enter name 2");
	num2=scan.nextLine();
	System.out.println("enter grade 2");
	grade2=scan.nextInt();
	if (grade1>grade2)
	System.out.println(num1);
	else System.out.println(num2);
	 
	
	//.4
	String som1 , som2;
	System.out.println("Enter string");
	som1=scan.nextLine();
	System.out.println("Enter string");
	som2=scan.nextLine();
	int siz1=som1.length();
	int siz2=som2.length();
	if (siz1>siz2)
	System.out.println(som1);
	else System.out.println(som2);
	char n=som1.charAt(0);
	char n1=som2.charAt(0);
	if (n==n1)
    System.out.println("equals");
	else System.out.println("not equals");
	int index=som1.indexOf(som2);
	if (index>0)
	System.out.println("yes");
	else System.out.println("no");
	
	}
}
