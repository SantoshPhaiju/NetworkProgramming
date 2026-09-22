package ThridClass;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException {
        String host = args[0];

//        byte[] host = {10, 10, 0, 28};
        InetAddress address = InetAddress.getByName(host);
        boolean reachable = address.isReachable(1000);
        System.out.println("isreachable address: " + host + " is reachable: " + reachable);

    }
}
