package lab4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpressionReader {

    public static List<String> expressionRead(String filepath) {
        List<String> expressions = new ArrayList<>();
        try {
            Scanner scnr = new Scanner(new File(filepath));
            while (scnr.hasNextLine()) {
                expressions.add(scnr.nextLine());
            }
        }
        catch(Exception e) {
            System.out.println("Error.");
        }

        return expressions;
    }
}

