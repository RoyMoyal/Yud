import java.util.Scanner;
public class Main {
    //1.
 public void f1() {
    Scanner sc = new Scanner(System.in);
    int i, sum = 0;
    for (i = 0; i < 5; i++) {
      System.out.println("enter grade");
      int grade = sc.nextInt();
      sum += grade;
    }
    System.out.println("the average is " + sum / 5);
  }
    //2.
public static void f2() {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String word;
    do {
      System.out.println("enter word");
      word = sc.next();
      count++;
    }
    while (!(word.equals("enter")));
    System.out.println(count);
  }
    //3.
     public void f3(int cvv) {
    Scanner sc = new Scanner(System.in);
    int x = 0, cvvM;
    do {
      System.out.println("enter cvv");
      cvvM = sc.nextInt();
      x++;
      if (cvv == cvvM) {
        System.out.println("how much money?");
        break;
      }    
    }
    while (x < 3);
    if (x == 3)
      System.out.println("Eror");
    //4.
         public static void f4(int num) {
    int count = 0;
    while (num != 0) {
      num /= 10;
      count++;
    }
    System.out.println("Number of digits: " + count);
  }
    //5.
    public static int f5(int num) {
    int sum = 0;
    while (num > 0) {
      sum = num % 10 + sum;
      num /= 10;
    }
    return (sum);
  }
    //6.
     public static void f6(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) == ((str.charAt(str.length() - (i + 1)))))
        System.out.println("true");
      else {
        System.out.println("false");
        break;
      }
    }
  }
    //7.
    public static void f7(int num) {
    for (int i = num; i <= num; i--)
      if (num % i == 0)
        System.out.print(num / i + ",");
  }
    //8.    
    public static void f8() {
    int i, j;
    for (i = 1; i < 11; i++) {
      for (j = 1; j < 11; j++) {
        System.out.print(j * i + ",");
      }
      System.out.println();
    }
  }
    //9.
    public static void f9() {
    Scanner sc = new Scanner(System.in);
    int min = 100, max = 0, grade;
    for (int i = 0; i < 7; i++) {
      System.out.println("enter grade: ");
      grade = sc.nextInt();
      if (grade < min)
        min = grade;
      if (grade > max)
        max = grade;
    }
    System.out.println("the min grade is :" + min + ", and the max grade is :" + max);
  }
    //10.
    public static boolean f10(int num)
  {
    int a = 1, b = 1;
    while (a <= num) {
      if ((num == a) || (num == b))
        return true;
      a = a + b;
      b = b + a;
    }
    return false;
  }
    //11.
    public static void f11(int num1,int num2)
  {
    int a=0;
    for(int i=0;i<num2;i++)
    {
      a+=num1;
    }
    System.out.println(a);
  }
    //12.
    public static void f12(int hight) {
    int base = (hight+(hight-1));
    int i, j;
    int x1 = base / 2;
    int x2 = base / 2;
    for (i = 0; i <=hight ; i++) {
      for (j = 0; j <= base; j++) {
        if ((j > x1) && (j < x2))
          System.out.print(" * ");
        else
          System.out.print("   ");
      }
       System.out.println();
       x1--;
       x2++;
    }
  }
    //14.
    public static void f14(int index1,int index2) { // bug
    int i , a=1 ,b=1;
    for(i=1;i<index2;i++) {
      if (index1 < i)
        System.out.print(a + "," + b + ",");
      a += b;
      b += a;
    }
   }
    //15.
     public static void f15(int hight) { // not working
    int base = (hight*2);
    int i, j;
    int x1 = base/2;
    int x2 = 2/base;
    for (i = 0; i <hight ; i++) {
      for (j = 0; j < base; j++) {
        if ((j >= x1) || (i < x2))
          System.out.print(" * ");
        else
          System.out.print("   ");
      }
      System.out.println();
      x1++;
      x2--;
    }
  }
    //17.
     public static void f17(int kern , int month) {
    double ahuz = 0;
    double sum = 0;
    double monthPay = kern / month;
    for (int i = 0; i < month; i++) {
      // תשלום חודשי
      ahuz = (((kern * 0.5) / 100) + monthPay);
      // מוריד מהקרן את התשלום
      kern -= monthPay;
      // מוסיף לממוצע את הסכום הכולל
      sum += ahuz;
    }
    System.out.println("the ave is :"+ sum/month);
    System.out.println("total payment :"+sum);
 }
}
//18.
 public static void f18(int num) // מדפיס הפוך
  {
    int count=0 ;
   while(0<num)
    {
      if (num%2==1)
        System.out.print(1);
      else
        System.out.print(0);
      num=num/2;
    }
  }
//19.
 public static void f19() {
      Random r = new Random();
      int i, j, x, y;
      for (i = 0; i < 5; i++) {
          x = r.nextInt(101);
          y = r.nextInt(101);
          System.out.println("(" + x + "," + y + ")");
          for (j = 0; j < 5; j++) {
              double d=Math.sqrt((x*x)+(y*y));
              if (d<d)
                  d=d;
                  System.out.println("the closest point is :"+"(" + x + "," + y + ")");
          }
      }
  }
// תרגילים שלא עשיתי או לא סיימתי - 13, 15, 16, 19, 20


