/*
Write a program that reads a set of floating-point values. 
Ask the user to enter the values, then print:

The average of the values
The smallest of the values
The largest of the values
The range, that is the difference between the smallest and the largest
Of course, you may only prompt for the values once.
*/
import java.util.Scanner;
public class problemone {
    public static void main(String[] args) throws Exception {
        Scanner lol = new Scanner(System.in);
        System.out.println("How many values would you like to test?");
        int numV = lol.nextInt();
        Double average = 0.0, smallest, largest, range;
//start method for getting numbers...
        double numA[] = new double[numV];
            for (int i = 0; i < numV; i++){
                System.out.println("Enter value " + (i + 1) + ":");
                numA[i] = lol.nextDouble();
            }
//Start method for calculating average...            
            for (int i = 0; i < numV; i++){
                average = average + numA[i];
            }
        average = average / numV;
        average = (double)(Math.round(average * 100)/100.0);
        System.out.println("The average is: " + average);
//Start method for calculating smallest...
            smallest = numA[0];
            for (int i = 0; i < numV; i++){
                if (smallest > numA[i])
                    smallest = numA[i];
            }
        System.out.println("The smallest number is: " + smallest);
//Start method for calclulating the largest...
            largest = numA[0];
            for (int i = 0; i < numV; i ++){
                if (largest < numA[i])
                    largest = numA[i];
            }
            System.out.println("The largest number is: "+ largest);
//Start method for range...
            System.out.println("The range is: " + ((Math.round((largest - smallest)*100)/100.0)));
        
    }
}
