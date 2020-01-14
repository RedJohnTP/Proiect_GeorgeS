// Java implementation of Server side
// It contains two classes : Server and ClientHandler
// Save file as Server.java

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Server class
public class Server
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(5056);

        // Loop infinit pentru capturarea conexiunii cu clienții
        while (true)
        {
            Socket s = null;

            try
            {
                s = ss.accept();

                System.out.println("A new client is connected : " + s);

                // In & out streams
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());

                System.out.println("Assigning new thread for this client");

                // Crearea unui nou thread
                Thread t = new ClientHandler(s, dis, dos);

                // Pornirea thread-ului
                t.start();

            }
            catch (Exception e){
                s.close();
                e.printStackTrace();
            }
        }
    }
}

// ClientHandler class
class ClientHandler extends Thread
{
    DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat fortime = new SimpleDateFormat("hh:mm:ss");
    final DataInputStream dis;
    final DataOutputStream dos;
    final Socket s;


    // Constructor
    public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos)
    {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
    }

    @Override
    public void run()
    {
        String received;
        String to_return;
        /*
        while (true)
        {
            try {

                // Aici intervine implementarea dialogului dintre client și server, în cazul acesta, serverul
                // îi poate da utilizatorului, la cererea sa, data sau ora actuală.
                dos.writeUTF("What do you want?[Date | Time]..\n"+
                        "Type Exit to terminate connection.");

                // receive the answer from client
                received = dis.readUTF();

                if(received.equals("Exit"))
                {
                    System.out.println("Client " + this.s + " sends exit...");
                    System.out.println("Closing this connection.");
                    this.s.close();
                    System.out.println("Connection closed");
                    break;
                }

                // creating Date object
                Date date = new Date();

                // write on output stream based on the
                // answer from the client
                switch (received) {

                    case "Date" :
                        to_return = fordate.format(date);
                        dos.writeUTF(to_return);
                        break;

                    case "Time" :
                        to_return = fortime.format(date);
                        dos.writeUTF(to_return);
                        break;

                    default:
                        dos.writeUTF("Invalid input");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        while(true)
        {
            try
            {
                dos.writeUTF("Vrei să te logezi? Da pentru a continua și Nu pentru a închide aplicația.");
                received = dis.readUTF();
                if (received.equals("Da"))
                {
                    dos.writeUTF("Email: ");
                    String email = dis.readUTF();
                    dos.writeUTF("Email: ");
                    String parola = dis.readUTF();

                }
                else if (received.equals("Nu")){
                    break;
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        try
        {
            // closing resources
            this.dis.close();
            this.dos.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
