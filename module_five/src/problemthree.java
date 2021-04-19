/*
The Fibonacci numbers are defined by the sequence:

f1 = 1
f2 = 1
fn = fn-1 + fn-2.

Reformulate that as

Fold1 = 1;
Fold2=1;
Fnew=fold1+fold2;

After that, discard fold2, which is no longer needed, and set fold2 to fold1, and fold1 to fnew. Repeat an appropriate number of times.

Implement a program that prompts the user for an integer n and prints the nth Fibonacci number, using the above algorithm.
*/
import java.util.Scanner;
public class problemthree {
    public static void main(String[] args)throws Exception{
        Scanner fib = new Scanner(System.in);
        System.out.print("Let's find the fibonacci number of... (Enter a number): ");
        int fibTest = fib.nextInt();
        int fOne = 0;
        int fTwo = 1;
        int fn = 0;
        int n = 0;
        while (fn < fibTest){
            fn = fOne + fTwo;
            fOne = fTwo;
            fTwo = fn;
            n++;
        }
        if (fibTest == 0)
        System.out.println("The fibonacci number of 0 is 0");
        else if (fibTest == 1)
        System.out.println("The fibonacci number of 1 is 1 and 2");
        else if (fibTest == fn)
        System.out.println("The fibonacci number of " + fibTest + " is " + (n + 1));
        else
        System.out.println("The number " + fibTest + " is not a fibonacci number.");
    fib.close();
    }
    
}
