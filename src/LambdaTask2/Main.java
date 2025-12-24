package LambdaTask2;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<student> students =
                studentfr.loadStudents("C:\\Users\\eamma\\Downloads\\studentsGroup6.txt");

        students.stream()
                .filter(s -> s.getScore() == 5)
                .forEach(System.out::println);

        double average = students.stream()
                        .mapToInt(student::getScore)
                        .average()
                        .getAsDouble();

        System.out.println("average grade is : " + average);

        long count = students.stream()
                        .filter(s -> s.getScore() == 5)
                        .count();

        System.out.println("number of students with grade 5 is : " + count);
    }
}

