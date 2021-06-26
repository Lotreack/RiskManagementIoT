package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class conn {
    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    // statement
    public static void Conn() throws ClassNotFoundException, SQLException
    {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:TEST1.s3db");

        System.out.println("База Подключена!");
    }

    // --------Creating of table--------
    public static void CreateDB() throws ClassNotFoundException, SQLException
    {
        statmt = conn.createStatement();
        statmt.execute("CREATE TABLE if not exists 'devices' ('type' text PRIMARY KEY , 'Vendor' text, 'Importance' DOUBLE, 'Availability' DOUBLE, 'Damage' INTEGER");

        System.out.println("Таблица создана или уже существует.");
    }

    // --------Insert into table--------
    public static void WriteDB() throws SQLException
    {
        statmt.execute("INSERT INTO 'users' ('type', 'vendor') VALUES ('test', 125453); ");
        statmt.execute("INSERT INTO 'users' ('type', 'vendor') VALUES ('test', 321789); ");
        statmt.execute("INSERT INTO 'users' ('type', 'vendor') VALUES ('test', 456123); ");

        System.out.println("Таблица заполнена");
    }

    // --------Output of table--------
    public static void ReadDB() throws ClassNotFoundException, SQLException
    {
        resSet = statmt.executeQuery("SELECT * FROM devices");

        while(resSet.next())
        {
            String type = resSet.getString("type");
            String  vendor = resSet.getString("vendor");
            double importance = resSet.getDouble("importance");
            double availability = resSet.getDouble("availability");
            int damage = resSet.getInt("damage");
            System.out.println( "Type = " + type );
            System.out.println( "Vendor = " + vendor );
            System.out.println( "Importance = " + importance );
            System.out.println( "Availability = " + availability );
            System.out.println( "Damage = " + damage);
            System.out.println();
        }

        System.out.println("Таблица выведена");
    }

    // --------Closing--------
    public static void CloseDB() throws ClassNotFoundException, SQLException
    {
        conn.close();
        statmt.close();
        resSet.close();

        System.out.println("Соединения закрыты");
    }

}
