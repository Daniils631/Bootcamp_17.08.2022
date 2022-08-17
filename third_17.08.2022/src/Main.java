import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        boolean bo = true;

        Scanner scA = new Scanner(System.in);
        System.out.println("Enter whole number: ");
        int a = scA.nextInt();



        if (a % 2 == 0){
            System.out.println("number is even " + bo);
        }else{
            System.out.println("number is odd " + !bo);
        }
    }

// Solution
    /*Enter a = 3;
    output: number is odd false
    Enter a = 4;
    output: number is even true*/

}