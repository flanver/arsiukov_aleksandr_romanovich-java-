import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args){
        String st1 = line("abc abc ab abc ab acs acs");
        System.out.println(st1);
    }
    public static String line(String st1){
        String str="";
        String[] arr=st1.split(" ");
        LinkedHashSet<String> spis = new LinkedHashSet<String>();
        for (int i = 0; i < arr.length; i++) {
            spis.add(arr[i]);
        }
        for(String s:spis){
            str=str+s+" ";
        }
        return str;
    }
}