package app.util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static String readString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static double readDouble(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static int readInt(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }
}
