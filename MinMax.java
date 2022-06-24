import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {
        String dividi [] = s.split(",");
        int array[] = new int[dividi.length];
        for (int i = 0; i < dividi.length; i++) {
            array [i] = Integer.parseInt(dividi[i]);
        }return array;
    }

    static void computeMinAndMax(int[] values) {
        int min=values[0];
        int max=values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min)
                min=values[i];
            else if (values[i] > max)
                max= values[i];
        }
        System.out.println("minimo: "+min + ", " + "massimo: " + max);

    }
}