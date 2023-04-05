//The program for the client side
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientServer {

    public static void main(String[] args) {
        try {
            Socket sock = new Socket("localhost", 9999);
            PrintStream pr = new PrintStream(sock.getOutputStream());
            System.out.print("Enter something: ");
            
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader ed = new BufferedReader(rd);
            String temp = ed.readLine();
            
            pr.println();
            
            BufferedReader edr = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String tm = edr.readLine();
            System.out.print(tm);
        } catch (IOException ex) {
            
        }
    }
}


//Program for the server side
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClient {

    public static void main(String[] args) {
        try {
            ServerSocket ser = new ServerSocket(9999);
            Socket sock = ser.accept();
            
            BufferedReader ed = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String tmp = ed.readLine();
            System.out.print("Received: " + tmp);
            
            PrintStream pr = new PrintStream(sock.getOutputStream());
            String str = "Yes, I got the text!!!";
            pr.println(str);
        } catch (IOException ex) {
            
        }
    }
}