package task6lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter three digits: ");
        String id = sc.nextLine().trim();

        if (id.length() != 3) {
            return;
        }

        boolean dig = true;
        for (int i = 0; i < 3; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                dig = false;
                break;
            }
        }

        if (!dig) {
            return;
        }

        String urlstr = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";

        try {
            URL url = new URL(urlstr);
            URLConnection con = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String ln;

            while ((ln = br.readLine()) != null) {
                if (ln.startsWith(id)) {

                    java.util.ArrayList<String> lst = new java.util.ArrayList<>();
                    String tmp = "";

                    for (int i = 0; i < ln.length(); i++) {
                        char c = ln.charAt(i);

                        if (c == ' ' || c == '\t') {
                            if (!tmp.isEmpty()) {
                                lst.add(tmp);
                                tmp = "";
                            }
                        } else {
                            tmp += c;
                        }
                    }

                    if (!tmp.isEmpty()) {
                        lst.add(tmp);
                    }

                    String abv = lst.get(1);

                    StringBuilder nm = new StringBuilder();
                    for (int i = 2; i < lst.size(); i++) {
                        nm.append(lst.get(i)).append(" ");
                    }

                    System.out.println(abv.toLowerCase());
                    System.out.println(nm.toString().trim().toLowerCase());

                    break;
                }
            }

            br.close();

        } catch (IOException e) {
            return;
        }
    }
}
