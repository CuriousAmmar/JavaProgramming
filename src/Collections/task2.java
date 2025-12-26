package Collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class task2 {

    public static void main(String[] args) {

        Set<String> employees = new HashSet<>();

        String file = "C:\\Users\\eamma\\Downloads\\emps.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("error while reading the file: " + e.getMessage());
        }

        System.out.println("unique employees: " + employees.size());


        System.out.println("\n1) for each loop:");
        for (String emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\n2) Iterator loop:");
        Iterator<String> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String name = "Daft Punk";
        System.out.println("\nchecking if set contains \"" + name + "\":");

        if (employees.contains(name)) {
            System.out.println(name + " is in the file.");
        } else {
            System.out.println(name + " is not in the file.");
        }
    }
}

