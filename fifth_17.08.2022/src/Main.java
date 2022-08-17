import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean bo = true;

        Scanner scA = new Scanner(System.in);
        System.out.println("Enter true or false: ");
        boolean b1 = scA.nextBoolean();

        if (b1 == bo){
            System.out.println("Opposite of \"true\" is " + !bo);
        }else{
            System.out.println("Opposite of \"false\" is " + bo);
        }
    }
    //Solution
    /*Enter boolean value: true
    Output:
    Opposite of "true" is "false"*/
}