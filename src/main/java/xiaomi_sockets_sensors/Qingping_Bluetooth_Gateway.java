package xiaomi_sockets_sensors;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Qingping_Bluetooth_Gateway {

    String type = "Sensor";
    String name = "Qingping_Bluetooth_Gateway";
    public double[] Qingping_Bluetooth_Gateway_vulnerabilities = new double[2];
    public double importance;
    public double availability;
    public int damage;
    double k = 0.1745;
    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&query=bluetooth+gateway&search_type=all");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Qingping_Bluetooth_Gateway() throws IOException {

    }


    public void Display (String url){ System.out.println("Список активных уязвимостей:" + url );
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
        damage = Integer.parseInt(reader.readLine());



        for (int i = 0; i < 2; i++)
        {
            System.out.println("Введите рейтинг" + " " + i + " " + "уязвимости ");
            Qingping_Bluetooth_Gateway_vulnerabilities[i] = Double.parseDouble(reader.readLine()) * availability * importance * k;

        }

    }
}
