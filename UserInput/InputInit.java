package UserInput;

import java.util.Scanner;

public class InputInit {
    public static String init() {
        Scanner myAppSc = new Scanner(System.in);
        System.out.println("Choice task:\n - Add record: add\n - Quit: quit");
        return myAppSc.nextLine();
    }
}
