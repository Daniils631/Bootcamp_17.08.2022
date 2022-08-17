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
            System.out.println(a + "=" + b + " " + bo);
        }else if(a<b){
            System.out.println(a + "<" + b + " " + !bo);
        }else if(a<=b){
            System.out.println(a + "<=" + b + " " + bo);
        }else if(a>b){
            System.out.println(a + ">" + b + " " + !bo);
        }else if(a>=b){
            System.out.println(a + ">=" + b + " " + !bo);
        }

        // Solutions
       /*is 10 equal to 10? - true
        is 10 less than 10? - false
        is 10 less or equal to 10? - true
        is 10 greater than 10? - false
        is 10 greater or equal to 10? - true*/



    }
}