import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();

        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }

        String[] spl = s.split(" ");
        Number number;
        try {
            int a = Integer.parseInt(spl[0]);
            int b = Integer.parseInt(spl[2]);
            number = new Arab(a, b, spl[1]);
            number.result();
        } catch (NumberFormatException e) {
            number = new Rome(spl[0], spl[2], spl[1]);
            number.result();
        }
    }
}