import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer { //从客户端口读数据

    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        while (true) {
            Socket s =ss.accept();
            System.out.println("A client is accept!!!");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
        }

        
    }
}
