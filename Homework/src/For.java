import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero..");
        int num = scan.nextInt();
        scan.close();
        System.out.println("Conto alla rovescia");
        for (int i = num; i >= 0; i--) {
            System.out.println(i);

        }
        System.out.println("BUON ANNOOOO");
    }
}
