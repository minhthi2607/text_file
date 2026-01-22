package bai4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "countries.csv";
        List<Country> countries = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String code = data[1].replace("\"", "");
                String name = data[2].replace("\"", "");

                Country country = new Country(id, name, code);
                countries.add(country);

            }
        } catch (Exception e) {
            System.out.println("Không đọc được file csv");
        }

        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
