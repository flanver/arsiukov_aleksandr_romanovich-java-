import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int i = 0;
        if(n1 < n2){
            if(n2 < n3){
                while(i < n3){
                    System.out.println(n1);
                    i++;
                    n1 += n2;
                }
            }
        }
    }
}