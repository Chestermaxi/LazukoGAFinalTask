package by.lazuko.project.view;

import java.util.Scanner;

public class ScannerInfo{

    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static String retString() {
        String str;
        while(!scanner.hasNext()){
            scanner.next();
        }
        str = scanner.nextLine();
        return str;
    }

    public static int retInt() {
        int n;
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        n = scanner.nextInt();
        return n;
    }
}
