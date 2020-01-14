package DBLayer;

import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DB_Connection {
    private static final String  driver = "jdbc:sqlserver://NUME\\SQLINSTANCE:1433;instanceName=SQLINSTANCE";
    private static final String  databaseName = ";databaseName=PartyOrganizer_DB";

    private static String  userName = "; user=sa";
    private static String password = ";password=123456";

    private static java.sql.Connection con;
    private DatabaseMetaData dma;

    private static DB_Connection instance = null;

    public static void main(String [] args)
    {
        new DB_Connection();
    }
    private DB_Connection()
    {
        String url = driver + databaseName + userName + password;

        try{
            //load of driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver class s-a încărcat cu succes");

        }
        catch(Exception e){
            System.out.println("Cannot find the driver");
            System.out.println(e.getMessage());
        }
        try{
            //connection to the database

            con = DriverManager.getConnection(url);
            con.setAutoCommit(true);
            dma = con.getMetaData(); // get meta data
            System.out.println("Conexiune la: " + dma.getURL());
            System.out.println("Driver: " + dma.getDriverName());
            System.out.println("Database product name: " + dma.getDatabaseProductName());
        }
        catch(Exception e){
            System.out.println("Problems with the connection to the database:");
            System.out.println(e.getMessage());
            System.out.println(url);
        }
    }

    //closeDb: pentru închiderea conexiunii
    public static void closeConnection()
    {
        try{

            con.close();
            instance= null;
            System.out.println("Conexiunea este închisă");
        }
        catch (Exception e){
            System.out.println("Eroare la închiderea bazei de date:  " +  e.getMessage());
        }
    }

    public java.sql.Connection getDBcon()
    {
        return con;
    }

    public static DB_Connection getInstance()
    {
        if (instance == null)
        {
            instance = new DB_Connection();
        }
        return instance;
    }
}
