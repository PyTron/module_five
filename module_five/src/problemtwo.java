/*
Write a program that reads a word and prints each character of the word on a separate line. For example, if the user provides the input "Harry", the program prints:

H
a
r
r
y
*/
import java.util.Scanner;
public class problemtwo {
 public static void main(String[] args)throws Exception{
    Scanner myscan = new Scanner(System.in);
    System.out.print("Please enter a word ");
    String mystring = myscan.nextLine();
    for (int i = 0; i < mystring.length(); i++){
    System.out.println(mystring.charAt(i));
    }
myscan.close();
}   
}
