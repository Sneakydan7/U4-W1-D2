import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrivi quello che vuoi.... ma non scrivere mai ':q'!!!");
        String userInput = scan.nextLine();

        while (!userInput.equals(":q")) {
            String result = dividedByCommas(userInput);
            System.out.println(result);
            System.out.println("Scrivi quello che vuoi.... ma non scrivere mai ':q'!!!");
            userInput = scan.nextLine();
        }
    }

    public static String dividedByCommas(String input) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i < input.length()) {
            result.append(input.charAt(i));
            if (i < input.length() - 1) {
                result.append(",");
            }
            i++;
        }
        return result.toString();
    }


}
