import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** ESERCIZIO 1 ***");
        int result = moltiplica(20, 50);
        System.out.println("il tuo risultato é: " + result);

        String resultConcatena = concatena("Pietro", 26);
        System.out.println(resultConcatena);

        String[] arr = inserisciInArray(new String[]{"A", "B", "C", "D", "E"}, "Pietro");
        System.out.println(Arrays.toString(arr));

        System.out.println("*** ESERCIZIO 2 ***");

        Scanner sc = new Scanner(System.in);
        String[] myStrings = new String[3];
        System.out.print("Inserisci la prima stringa per entrare");
        myStrings[0] = sc.nextLine();
        System.out.print("Inserisci la prima stringa per entrare");
        myStrings[1] = sc.nextLine();
        System.out.print("Inserisci la prima stringa per entrare");
        myStrings[2] = sc.nextLine();

        System.out.print("Concatena in ordine di inserimento:");
        System.out.println(myStrings[0] + myStrings[1] + myStrings[2]);

        System.out.print("Concatena in ordine inverso:");
        System.out.println(myStrings[2] + myStrings[1] + myStrings[0]);
        sc.close();

        System.out.println("*** ESERCIZIO 3 ***");

        System.out.println("perimetro del rettangolo: " + perimetroRettangolo(2, 5));
        System.out.println("verifica se pari o dispari: " + pariDispari(12));
        System.out.println("area del triangolo: " + perimetroTriangolo(3.5,4.5,6.5));
        }
    public static double perimetroRettangolo(double l1, double l2) {
        return 2 * (l1 + l2);
    }
    public static String pariDispari(int number) {
            return number % 2 == 0 ? "vero" : "falso";
    }
    public static double perimetroTriangolo(double l1, double l2, double l3){
        double semiPerimetro = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - l1) * (semiPerimetro - l2) * (semiPerimetro - l3));
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }
    public static String concatena(String str, int num) {
        return "Sono " + str + " ho " + num + " anni";
    }
    public static String[] inserisciInArray(String[] strArray, String str) {
        String[] arr = new String[6];
        for (int i = 0; i < strArray.length; i++) {
            if(i < 2) {
                arr[i] = strArray[i];
            } else if(i == 2) {
                arr[i] = str;
            } else {
                arr[i] = strArray[i - 1];
            }
        }
        return arr;
    }

    }
