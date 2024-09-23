import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Esercizio 1
        int result = moltiplica(20, 50);
        System.out.println("il tuo risultato é: " + result);

        System.out.println(concatena("Pietro", 26));

        String[] arr = inserisciInArray(new String[]{"A", "B", "C", "D", "E"}, "Pietro");
        System.out.println(Arrays.toString(arr));

        //ESERCIZIO 2
        Scanner scan = new Scanner(System.in);
        String[] myStrings = new String[3];
        System.out.println("Inserisci la prima stringa per entrare");
        myStrings[0] = scan.nextLine();
        System.out.println("Inserisci la prima stringa per entrare");
        myStrings[1] = scan.nextLine();
        System.out.println("Inserisci la prima stringa per entrare");
        myStrings[2] = scan.nextLine();

        System.out.println("Concatena in ordine di inserimento:");
        System.out.println(myStrings[0] + myStrings[1] + myStrings[2]);

        System.out.println("Concatena in ordine inverso:");
        System.out.println(myStrings[2] + myStrings[1] + myStrings[0]);
        scan.close();

        //ESERCIZIO 3
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
        //esercizio 1
    public static int moltiplica(int a, int b) {
        return a * b;
    }
    public static String concatena(String str, int num) {
        return "Sono " + str + " ho " + num + " anni";
    }
    public static String[] inserisciInArray(String[] strArray, String str) {
        String[] arr = new String[6];
        for (int i = 0; i < strArray.length +1 ; i++) {
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
