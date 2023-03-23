import java.util.*;
public class Main {
    static int  numberToCheck;

    public static void inputNumber(){
        Scanner primeNumberInput = new Scanner(System.in);
        System.out.println("Enter the prime Number :");
        numberToCheck=primeNumberInput.nextInt()    ;


    }
   public static boolean checkPrime() {
        // 1 is not prime, so return false

        for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        inputNumber();
        System.out.println(checkPrime());



        System.out.println("Prime Numbers are :");

            for ( numberToCheck=1 ;numberToCheck <= 500; numberToCheck++) {


                if (    checkPrime()==true   ) {

                    System.out.print(numberToCheck + " ");


                }
            }

    }
}
