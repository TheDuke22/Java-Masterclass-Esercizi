import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index:");
        int index =sc.nextInt();
        fibonacci(index);

    }

    static void fibonacci(int index) {
        int [] arr = new int[100];
        int c1=0;
        int c2=1;
        arr [0] = 0;
        arr [1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr [i] = arr[c1] + arr [c2];
            c1++; c2++;
        }System.out.println(arr[index]);

    }
}