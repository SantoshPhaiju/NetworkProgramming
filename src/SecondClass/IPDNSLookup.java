package SecondClass;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IPDNSLookup {
    public static void main(String[] args) throws UnknownHostException {
        String host = args[0];

        InetAddress address = InetAddress.getByName(host);
//        InetAddress byAddress = InetAddress.getByAddress("142.250.193.142");
//        System.out.println("byAddres", byAddress);
        InetAddress[] allAddresses = InetAddress.getAllByName(host);
        System.out.println(address);
        // DNS LOOKUP initiate
        InetAddress addressHost = InetAddress.getByName("142.251.156.119");
        String name = addressHost.getHostName();
        System.out.println("hostname of ip: " + name);


        for (InetAddress inetAddress : allAddresses) {
            System.out.println(inetAddress);
        }
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println("Mylocalhost: " + localAddress);
//        Arrays.stream(allAddresses).forEach(System.out::println);

    }
}
