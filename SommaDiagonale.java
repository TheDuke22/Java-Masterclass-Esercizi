public class SommaDiagonale {
    public static void main(String[] args) {
        int [][] quadrato = {
                {1, 2, 3, 4},
                {4, 8, 3, 2},
                {10, 7, 3, 6},
                {9, 2, 8, 3}};
        System.out.println(diagsum(quadrato));
        System.out.println(reversesum(quadrato));
    }
    public static int diagsum (int [][]a){
        int sum = 0;
        int x=0;
        int y=0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[x][y];
            x++;y++;
            }return sum;
    }
    public static int reversesum (int [][]a){                 // N.B. non richiesta, fatta solo per provare
        int sum = 0;
        int x=3;
        int y=0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[x][y];
            x--;y++;
        }return sum;
    }
}
