public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int result = moltiplica(a, b);
        System.out.println(result);
        System.out.println(concatena("Pietro", 26));
        }
    public static int moltiplica(int a, int b) {
        return a * b;
    }
    public static String concatena(String str, int num) {
        return str + num;
    }
    }
