package Collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class task1 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        String path = "C:\\Users\\eamma\\Downloads\\emps.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
        System.out.println("Number of employees: " + employees.size());

        System.out.println("\n1) for loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("\n2) for each loop:");
        for (String emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\n3) Iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
