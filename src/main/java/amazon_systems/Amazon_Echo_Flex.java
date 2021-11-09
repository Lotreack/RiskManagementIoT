package amazon_systems;

import java.io.*;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;

public class Amazon_Echo_Flex {

    String type = "AWS";
    String name = "Amazon_Echo_Flex";
    public double[] Amazon_Echo_Flex_vulnerabilities = new double[2];
    public double importance;
    public double availability;
    public double damage;

    double k = 20.01;

    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&query=Amazon+Flex&search_type=all");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Amazon_Echo_Flex() throws IOException {

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
        damage = Integer.parseInt(reader.readLine())*  k;


        for (int i = 0; i < 2; i++)
        {
            System.out.println("Введите рейтинг" + " " + i + " " + "уязвимости ");
            Amazon_Echo_Flex_vulnerabilities[i] = Double.parseDouble(reader.readLine()) * availability * importance;

        }

    }



}
