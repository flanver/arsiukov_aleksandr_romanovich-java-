import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float treug[][] = new float[3][2];
        int n = 1;
        for(int i = 0; i < 3; i++){
            System.out.println("Введите координату " + n + "й вершины ");
            n++;
            for(int j = 0; j < 2; j++){
                treug[i][j] = in.nextInt();
            }
        }
        System.out.println("Барицентр вашего треугольника EDF {"
                + (treug[0][0] + treug[1][0] + treug[2][0])/3 + ","
                + (treug[0][1] + treug[1][1] + treug[2][1])/3 + "}");
    }
}