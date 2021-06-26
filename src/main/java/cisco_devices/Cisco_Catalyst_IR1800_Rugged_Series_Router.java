package cisco_devices;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Cisco_Catalyst_IR1800_Rugged_Series_Router {


    String type = "Router";
    String name = "Cisco_Catalyst_IR1800_Rugged_Series_Router";
    public double[] Cisco_Catalyst_IR1800_Rugged_Series_Router_vulnerabilities = new double[1];
    public double importance;
    public double availability;
    public int damage;
    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Acisco&cpe_product=cpe%3A%2F%3A%3A1801_integrated_service_router");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Cisco_Catalyst_IR1800_Rugged_Series_Router() throws IOException {

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



        for (int i = 0; i < 1; i++)
        {
            System.out.println("Введите рейтинг" + " " + i + " " + "уязвимости ");
            Cisco_Catalyst_IR1800_Rugged_Series_Router_vulnerabilities[i] = Double.parseDouble(reader.readLine());

        }

    }
}
