package ThridClass;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class NetworkScanner {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String ip = localHost.getHostAddress();
            String subnet = ip.substring(0, ip.lastIndexOf(".") + 1);

            System.out.println("Scanning subnet: " + subnet + "1-254...");
            List<String> activeDevices = new ArrayList<>();

            for (int i = 1; i < 255; i++) {
                String host = subnet + i;
                InetAddress address = InetAddress.getByName(host);

                // 1000ms timeout
                if (address.isReachable(1000)) {
                    System.out.println("Active: " + host + " (" + address.getHostName() + ")");
                    activeDevices.add(host);
                }
            }
            System.out.println("\nTotal active devices found: " + activeDevices.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

