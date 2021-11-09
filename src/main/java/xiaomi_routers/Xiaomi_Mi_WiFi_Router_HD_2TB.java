package xiaomi_routers;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Xiaomi_Mi_WiFi_Router_HD_2TB {

    String type = "Router";
    String name = "Xiaomi_Mi_WiFi_Router_HD_2TB";
    public double[] Xiaomi_Mi_WiFi_Router_HD_2TB_vulnerabilities = new double[19];
    public double importance;
    public double availability;
    public int damage;
    double k = 0.218;
    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&query=Xiaomi+Router&search_type=all");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Xiaomi_Mi_WiFi_Router_HD_2TB() throws IOException {

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



        for (int i = 0; i < 19; i++)
        {
            System.out.println("Введите рейтинг" + " " + i + " " + "уязвимости ");
            Xiaomi_Mi_WiFi_Router_HD_2TB_vulnerabilities[i] = Double.parseDouble(reader.readLine()) * availability * importance * k;

        }

    }
}
