package cisco_devices;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Cisco_Catalyst_IE3400_Heavy_Duty_Series {

    String type = "Router";
    String name = "Cisco_Catalyst_IE3400_Heavy_Duty_Series";
    public double[] Cisco_Catalyst_IE3400_Heavy_Duty_Series_vulnerabilities = new double[2];
    public double importance;
    public double availability;
    public double damage;
    double k = 1560.789;
    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Alenovo&cpe_product=cpe%3A%2F%3A%3A340c-15ast");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Cisco_Catalyst_IE3400_Heavy_Duty_Series() throws IOException {

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



        for (int i = 0; i < 2; i++)
        {
            System.out.println("Введите рейтинг" + " " + i + " " + "уязвимости ");
            Cisco_Catalyst_IE3400_Heavy_Duty_Series_vulnerabilities[i] = Double.parseDouble(reader.readLine()) * availability * importance ;

        }

    }
}
