package Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Server server = new Server();
    }

    public Server() {
        ServerSocket server = null;
        Socket socket = null;
        DataInputStream in;
        DataOutputStream out;

        try {
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен...");
            socket = server.accept();
            System.out.println("Клиент подключился!");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);

            new Thread(()->{
                try {
                    while (true) {
                        String str = sc.nextLine();
                        out.writeUTF(str);
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            while (true) {
                String str = in.readUTF();
                if (str.equals("/end")) {
                    break;
                }
                System.out.println("Клиент: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
                System.out.println("Сервер закрыт!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
