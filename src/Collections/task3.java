package Collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class task3 {

    public static void main(String[] args) {

        Set<String> employees = new TreeSet<>();

        String file = "C:\\Users\\eamma\\Downloads\\emps.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }

        System.out.println("unique employees (sorted): " + employees.size());

        System.out.println("\n1) for each loop:");
        for (String emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\n2) Iterator loop:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
