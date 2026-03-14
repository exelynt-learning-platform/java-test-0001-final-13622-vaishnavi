import java.util.*;
public class Test0001 {
    public static void main(String[] args) {

        int rows = 8;

        for (int i = 1; i <= rows; i++) {

            if (i == 1 || i == rows) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            else if (i == 2 || i == rows - 1) {
                for (int j = 1; j <= 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("* *");
            }

            else {
                for (int j = 1; j <= 1; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int j = 1; j <= 3; j++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }
        }
    }
}