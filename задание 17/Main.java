public class Main {
    public static void main(String[] args){
        boolean line = correctness("(((())()");
        System.out.println(line);
    }
    public static boolean correctness(String str){
        while (str.contains("()")) {
            str = str.replaceAll("\\(\\)", "");
        }
        return (str.length() == 0);
    }
}