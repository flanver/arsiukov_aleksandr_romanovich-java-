import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        double[] tri = new double[3];
        for (int i = 0; i < 3;i++){
            tri[i] = n.nextInt();
            if (tri[0] + tri[1] > tri[2] &
                    tri[1] + tri[2] > tri[0] &
                    tri[0] + tri[2] > tri[1]){
                double cos1 = (tri[0]*tri[0] + tri[1]*tri[1]
                        - tri[2]*tri[2])/(2*tri[0]*tri[1]);
                double cos2 = (tri[1]*tri[1] + tri[2]*tri[2]
                        - tri[0]*tri[0])/(2*tri[1]*tri[2]);
                double cos3 = (tri[0]*tri[0] + tri[2]*tri[2]
                        - tri[1]*tri[1])/(2*tri[0]*tri[2]);
                double[] integers = new double[] {cos1,cos2,cos3};
                double max = Arrays.stream(integers).max().getAsDouble();
                double degrees = Math.acos(max);
                System.out.println(180 - degrees*180.0d/Math.PI);
            }
        }
    }
}