// Java implementation for a client
// Save file as Client.java

import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Client
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            Scanner scn = new Scanner(System.in);

            InetAddress ip = InetAddress.getByName("localhost");

            // crearea conexiunii la server pe portul 5056
            Socket s = new Socket(ip, 5056);

            // obtaining input and out streams
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            // loop intermitent pentru menținerea comunicării dintre client și server
            while (true)
            {
                System.out.println(dis.readUTF());
                String to_send = scn.nextLine();
                dos.writeUTF(to_send);

                // If client sends exit,close this connection
                // and then break from the while loop
                if(to_send.equals("Exit"))
                {
                    System.out.println("Această conexiune va fi închisă: " + s);
                    s.close();
                    System.out.println("Conexiune închisă");
                    break;
                }

                // printing date or time as requested by client
                String received = dis.readUTF();
                System.out.println(received);
            }

            // closing resources
            scn.close();
            dis.close();
            dos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
