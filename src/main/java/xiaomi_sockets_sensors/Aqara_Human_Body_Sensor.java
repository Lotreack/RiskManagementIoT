package xiaomi_sockets_sensors;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Aqara_Human_Body_Sensor {
    String type = "Sensor";
    String name = "Aqara_Human_Body_Sensor";
    public double[] Aqara_Human_Body_Sensor_vulnerabilities = new double[127];
    public double importance;
    public double availability;
    public int damage;
    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&query=Sensor&search_type=all");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Aqara_Human_Body_Sensor() throws IOException {

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
        damage = Integer.parseInt(reader.readLine());



        for (int i = 0; i < 127; i++)
        {
            System.out.println("Введите рейтинг" + " " + i + " " + "уязвимости ");
            Aqara_Human_Body_Sensor_vulnerabilities[i] = Double.parseDouble(reader.readLine());

        }

    }
}
