import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        switch (userInput) {
            case 0: {
                System.out.println("ZERO!");
                break;
            }
            case 1: {
                System.out.println("UNO!");
                break;
            }
            case 2: {
                System.out.println("DUE!");
                break;
            }
            case 3: {
                System.out.println("TRE!");
                break;
            }
            default: {
                System.out.println("Il numero non è compreso tra 0 e 3 ");
            }
        }
    }


}
