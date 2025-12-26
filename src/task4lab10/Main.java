package task4lab10;

import java.io.*;

public class Main {


        public static void main(String[] args) throws Exception {

            String inputfile = "C:\\Users\\eamma\\Downloads\\studentsGroup6.txt";
            String outputfile = "C:\\Users\\eamma\\Downloads\\Grade5.txt";

                    FileReader fr = new FileReader(inputfile);
                    BufferedReader br = new BufferedReader(fr);
                    FileWriter fw = new FileWriter(outputfile);
                    BufferedWriter bw = new BufferedWriter(fw);

                String line;
                while ((line = br.readLine()) != null) {
                    line = line.trim();
                    int lastSpaceIndex = line.lastIndexOf(' ');
                    String gradeStr = line.substring(lastSpaceIndex + 1);

                    if (gradeStr.equals("5")) {
                        bw.write(line);
                        bw.newLine();
                    }
                }
            br.close();
            bw.close();


            System.out.println("file created and you can find it in the path " + outputfile);
            }

        }
