package Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client_1 {
    public static void main(String[] args) {
        Socket socket = null;
        DataInputStream in;
        DataOutputStream out;

        try {
            socket = new Socket("localhost", 8189);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);

            new Thread(()-> {
                while (true) {
                    try {
                        String str = in.readUTF();
                        System.out.println("Сервер: " + str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            while (true) {
                String str = sc.nextLine();
                out.writeUTF(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
