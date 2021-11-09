package google_sensors;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.net.MalformedURLException;


public class Google_Home_Voice_Controller {

    String type = "Sensor";
    String name = "Google_Home_Voice_Controller";
    public double[] Google_Home_Voice_Controller_vulnerabilities = new double[5];
    public double importance;
    public double availability;
    public int damage;
    double k = 0.181;
    /*
    ущерб определяется из важности где важность градируется от 1 до 5-10 и ущерб ей соответсвественно
    * */

    final URL url = new URL("https://nvd.nist.gov/vuln/search/results?form_type=Basic&results_type=overview&query=Voice+Controller&search_type=all");
    final HttpURLConnection con = (HttpURLConnection) url.openConnection(); // для каждого случая своё

    public Google_Home_Voice_Controller() throws IOException {

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



       for (int i = 0; i < 5; i++)
       {
           System.out.println("Введите рейтинг" + " " + i + " " + "уязвимости ");
           Google_Home_Voice_Controller_vulnerabilities[i] = Double.parseDouble(reader.readLine()) * availability * importance * k;

       }

   }
}
