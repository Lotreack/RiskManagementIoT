package amazon_systems;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Ring_Peephole_Cam {

    String type = "AWS";
    String name = "Ring_Peephole_Cam";
    public double[] Ring_Peephole_Cam_vulnerabilities = new double[1];
    public double importance;
    public double availability;
    public int damage;
    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&query=telephone+camera&search_type=all");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Ring_Peephole_Cam () throws IOException {

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
            Ring_Peephole_Cam_vulnerabilities[i] = Double.parseDouble(reader.readLine());

        }

    }
}
