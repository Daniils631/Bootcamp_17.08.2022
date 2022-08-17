import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        boolean bo = true;
        System.out.println("Enter true or false: ");
        Scanner scA = new Scanner(System.in);
        System.out.println("First boolean b1: ");
        boolean b1 = scA.nextBoolean();

        Scanner scB = new Scanner(System.in);
        System.out.println("Second boolean b2: ");
        boolean b2 = scA.nextBoolean();



        if (b1 == b2){
            System.out.println("B1 is equal to B2 " + bo);
        }else{
            System.out.println("B1 is not equal to B2 " + !bo);
        }
        }
        //Solution
        /*Enter b1: true
        Enter b2: false
        Expected output:
        B1 is not equal to B2 false*/

    }