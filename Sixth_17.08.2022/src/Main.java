import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean bo = true;
        Scanner scA = new Scanner(System.in);
        System.out.println("first number: ");
        int a = scA.nextInt();
        Scanner scB = new Scanner(System.in);
        System.out.println("Second number: ");
        int b = scB.nextInt();

        if(a == b){
            System.out.println(a + " is equal to " + b + ": " + bo);
        }else if(a<0 && b>0){
            System.out.println(a + " is lower than 0 & " + b + " is grater than 0: " + bo);
        }else if(a>100 &&b>100){
            System.out.println(a + " is grater than 100 and " + b + " is grater than 100: " + bo);
        }else{
            System.out.println("Everything is " + !bo);
        }
// Solution
        /*a is -3 and b is -2 -> false
        a is -4 and b is 5 -> true
        a is -1 and b is -1 -> true
        a is 106 and b is 105 -> true
        a is 99 and b is 200 -> false
        a is 101 and b is 99 -> false*/


    }
}