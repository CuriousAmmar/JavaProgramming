package Collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class task4 {

    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();

        String file = "C:\\Users\\eamma\\Downloads\\emps.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }

        Collections.sort(employees);
        Collections.reverse(employees);

        System.out.println("sorted employees z to a. Duplicates preserved:");
        System.out.println("total employees including duplicates: " + employees.size());

        System.out.println("\n1) for each loop:");
        for (String emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\n2) Iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

