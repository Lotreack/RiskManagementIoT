package amazon_systems;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Amazon_Echo_Show_8 {

    String type = "AWS";
    String name = "Amazon_Echo_Show_8";
    public double[] Amazon_Echo_Show_8_vulnerabilities = new double[1];
    public double importance;
    public double availability;
    public double damage;
    double k = 2100.01;
    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Aamazon&cpe_product=cpe%3A%2F%3Aamazon%3Aecho_plus_firmware");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Amazon_Echo_Show_8() throws IOException {

    }
    public void Display (String url){
        System.out.println("Список активных уязвимостей:" + url );
    }

    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(inputStreamReader);

    public void KeyboardInput () throws IOException {
        System.out.println("Введите доступность устройства");
        availability = Double.parseDouble(reader.readLine());


        System.out.println("Введите важность устройства");
        importance = Double.parseDouble(reader.readLine());

        System.out.println("Введите ущерб от взлома устройства");
        damage = Integer.parseInt(reader.readLine()) * k;



        for (int i = 0; i < 1; i++)
        {
            System.out.println("Введите рейтинг" + " " + i + " " + "уязвимости ");
            Amazon_Echo_Show_8_vulnerabilities[i] = Double.parseDouble(reader.readLine()) * availability * importance;

        }

    }
}
