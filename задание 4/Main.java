public class Main {
    public static void main(String[] args){
        int c = str_count("goodmorning", 'o');  //это можно сделать через сканер, но мне было лень
        int c1 = str_count("goodmorning", 'n');
        int c2 = str_count("goodmorning", 'y');
        System.out.println(c + "\n" + c1 + "\n" + c2);
    }
    public static int str_count(String str, char letr){
        int c = 0;
        for(int i = 0; i < str.length(); i++){
            char w = str.charAt(i);
            if(w == letr) {
                c++;
            }
        }
        return c;
    }
}