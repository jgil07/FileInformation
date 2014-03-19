/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author SNEIDER
 */
public class Exercise {

    public static void main(String[] args) throws Exception {
        File fleExample = new File("Example.xpl");
        if (fleExample.exists()) {
            Scanner opnScanner = new Scanner(fleExample);
            while (opnScanner.hasNext()) {
                System.out.println("First Name:    " + opnScanner.nextLine());
                System.out.println("Last Name:     " + opnScanner.nextLine());
                System.out.println("Hourly Salary: " + opnScanner.nextLine());
                System.out.println("Is Full Time?: " + opnScanner.nextLine());
            }
            opnScanner.close();

            PrintWriter pwInput = new PrintWriter(fleExample);
            pwInput.println("Francine");
            pwInput.println("Mukoko");
            pwInput.println(22.85);
            pwInput.print(true);
            pwInput.close();
            System.out.println("The file has been created.");
        } else {
            System.out.println("No file exists with that name");
        }
    }
}