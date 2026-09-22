package ThridClass;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class NetInterface {
    static void main() throws SocketException {
        Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface network : Collections.list(networks)) {
            System.out.println("display name: " + network.getDisplayName());
            System.out.println("name: " + network.getName());

            System.out.println();
            System.out.println("Up? " + network.isUp());
            System.out.println("is loopback: " + network.isLoopback());
            System.out.println("is virtual: " + network.isVirtual());
            System.out.println("is point to point: " + network.isPointToPoint());

            System.out.println("hardware address: " + Arrays.toString(network.getHardwareAddress()));
            System.out.println("interface address: " + network.getInterfaceAddresses());
            System.out.println("mtu: " + network.getMTU());
            System.out.println("subinterfaces: " + network.getSubInterfaces());
            System.out.println("supports multicast: " + network.supportsMulticast());

            Enumeration<InetAddress> addresses = network.getInetAddresses();
            for (InetAddress inetAddress: Collections.list(addresses)) {
                System.out.println("InetAddress: " + inetAddress);
            }

            System.out.println("================================");
            System.out.println();
            System.out.println();
        }
    }
}
