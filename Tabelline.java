import java.util.Arrays;

public class Tabelline {
    public static void main(String[] args) {
     int n = 4;
     int m = 6;
     int [] tabelline = new int[m];
        for (int i = 0; i < tabelline.length; i++) {
           tabelline[i] = n*i;
        }
        System.out.println(Arrays.toString(tabelline));
    }

}
