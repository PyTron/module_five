/*
Write a program that prints a multiplication table, like this:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
…
10 20 30 40 50 60 70 80 90 100
*/
public class problemfour {
    public static void main(String[] args)throws Exception{
        int multA[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < multA.length; i++){
            System.out.print(multA[i] + " ");
        }
        System.out.println();
        for (int i = 2; i <= 10; i++){
            for (int a = 0; a < multA.length; a++){
                System.out.print((multA[a] * i) + " ");
            }
            System.out.println();
        }
    }
}
