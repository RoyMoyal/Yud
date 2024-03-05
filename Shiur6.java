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
