package LambdaTask2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class studentfr {

    public static ArrayList<student> loadStudents(String fileName) throws FileNotFoundException {
        ArrayList<student> students = new ArrayList<>();
        Scanner fileScanner = new Scanner(new File(fileName));

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split("\t");
            if (parts.length == 3) {
                String surname = parts[0];
                String name = parts[1];
                int score = Integer.parseInt(parts[2]);
                students.add(new student(name, surname, score));
            }
        }

        fileScanner.close();
        return students;
    }
}
