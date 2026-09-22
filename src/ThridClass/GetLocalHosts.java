package ThridClass;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetLocalHosts {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();

        System.out.println("My address: " + address);
        System.out.println("My host name is: " + address.getHostName());
        System.out.println("My host address is: " + address.getHostAddress());

    }
}
