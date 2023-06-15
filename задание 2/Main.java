import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для продолжения введите значение от 0 и 1");
        List<String> spis = new ArrayList<String>();
        var d = in.nextInt();
        int i = 0;
        if (d < 2) {
            if(d==1){
                i++;
                spis.add("true");
            } else {
                spis.add("false");
            }
        }
        while (d < 2){
            d = in.nextInt();
            if (d == 1){
                i++;
                spis.add("true");
            } else {
                spis.add("false");
            }
        }
        int index = spis.size() - 1;
        spis.remove(index);
        System.out.println(spis + "\n" + "Количество работников: " + i);
    }
}