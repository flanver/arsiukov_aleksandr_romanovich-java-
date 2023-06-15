import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int s1 = 2;
        int s2 = 4;

        int[][] matrix = new int[s1][s2];

        for (int i = 0; i < s2; i++) {
            for (int j = 0; j < s1; j++) {
                matrix[j][i] = rnd.nextInt(10);
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }

}