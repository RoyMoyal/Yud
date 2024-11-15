 import java.util.Random;
 import java.util.Scanner;
 public class Main {
     //1.
     public static void f1(int x, int y) {
         Random r = new Random();
         int[][] arr = new int[x][y];
         for (int i = 0; i < x; i++) {
             for (int j = 0; j < y; j++) {
                 arr[i][j] = r.nextInt(100);
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
     }

     //כתוב פונקציה 2f הקולטת מהמקלדת ערכים בין 0 ל100- עבור מטריצה 2arr בגודל 3×3,
     //הפונקציה תדפיס את המטריצה 2arr באופן תואם לשורות ועמודות. בנוסף הפונקציה תדפיס את
     //סכום השורה המירבי.
     public static void f2() {
         Scanner s = new Scanner(System.in);
         int[][] arr = new int[3][3];
         int i, j, maxI = 0;
         for (i = 0; i < arr.length; i++) {
             for (j = 0; j < arr.length; j++) {
                 System.out.println("enter number between 0-100");
                 arr[i][j] = s.nextInt();
             }
         }
         int maxSum = 0;
         int sum;
         for (i = 0; i < arr.length; i++) {
             sum = 0;
             for (j = 0; j < arr.length; j++) {
                 System.out.print(arr[i][j] + " ");
                 sum = sum + arr[i][j];
             }
             if (sum > maxSum) {
                 maxSum = sum;
                 maxI = i;
             }
             System.out.println();
         }
         System.out.println("The line maxinaly is:" + maxI);
     }

     //4.
     public static void f4(int number) {
         Random r = new Random();
         int[][] arr = new int[number][number];
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 arr[i][j] = r.nextInt(100);
                 System.out.print(arr[i][j]);
             }
             System.out.println();
         }
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 System.out.print(arr[j][i]);
             }
             System.out.println();
         }
     }

     //3.כתוב פונקציה המקבלת מספר שורות שווה ומספר עמודות שווה, עבור 2 מטריצות. הפונקציה
     //תמלא באופן אקראי את תאי 2 המטריצות(מספרים שלמים בין 0 ל100-). לאחר מכן תדפיס
     //מטריצה שלישית כך שבכל תא בה נקבל את סכום תאי 2 המטריצות שהתקבלו לפונקציה.
     //הפונקציה תדפיס את 3 המטריצות.
     public static void f3(int x, int y) {
         Random r = new Random();
         int[][] arr1 = new int[x][y];
         int[][] arr2 = new int[x][y];
         int[][] arr3 = new int[x][y];

         for (int i = 0; i < arr1.length; i++) {
             for (int j = 0; j < arr1.length; j++) {
                 arr1[i][j] = r.nextInt(100);
                 System.out.print(arr1[i][j]+" ");
             }
             System.out.println();
         }
         for (int i = 0; i < arr2.length; i++) {
             for (int j = 0; j < arr2.length; j++) {
                 arr2[i][j] = r.nextInt(100);
                 System.out.print(arr2[i][j]+" ");
             }
             System.out.println();
         }

         for (int i = 0; i < arr3.length; i++) {
             for (int j = 0; j < arr3.length; j++) {
                 arr3[i][j] = arr1[i][j] + arr2[i][j];
                 System.out.print(arr3[i][j]+" ");
             }
             System.out.println();
         }
     }

     //1. כתבו פעולה חיצונית exact, המקבלת מערך arr מטיפוס מחרוזת ומספר
     //שלם num. הפעולה תחזיר את מספר המחרוזות במערך arr שאורכן שווה
     //ל-num.
     public int exact(String[] arr, int num) {
         int i, count = 0;
         for (i = 0; i < arr.length; i++) {
             if (arr[i].length() == num) {
                 count++;
             }
         }
         return count;
     }

     //2. כתבו פעולה חיצונית above המקבלת מערך מטיפוס שלמים ומספר שלם
     //נוסף. הפעולה תחזיר את מספר האינדקס הקטן ביותר במערך בו סכום
     //ערכי התאים מתחילת המערך ועד אליו גדול מהמספר שהתקבל לפעולה.
     public int above(int[] arr, int num) {
         int i=0, index = 0, sum = 0;
             while (sum < num) {
                 sum += arr[i];
             index++;
             i++;
         }
         return index;
     }

     public String f3(char[][] arr , String name){
         if(name.length() != arr.length)
             System.out.println("false");

         for(int i=0 ; i<arr.length ; i++){
             for(int j=0 ; j< arr.length ; i++){
                // String str = arr[i][name.length()];
               //  if(arr[i][name.length()].equals(name))
                     return ("true");
                 //else
                   //  return ("false");

             }
         }

         return name;
     }

     public static void f10(char[][] arr , String name){
         for(int i=0 ; i<arr.length ; i++) {
             for (int j = 0; j < arr.length; i++) {
                 String name1 = arr[i][j]+arr[i][name.length()]
             }
         }
     }

     public static void main(String[] args) {
         Main m1=new Main();

     }
 }
