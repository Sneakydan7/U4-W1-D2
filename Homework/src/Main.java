//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "Paperin";
        int year = 2023;
        System.out.println(oddEvenString(str));
        System.out.println(isLeapYear(year));

    }

    public static boolean oddEvenString(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}