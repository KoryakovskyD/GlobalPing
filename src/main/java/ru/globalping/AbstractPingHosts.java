package ru.globalping;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public abstract class AbstractPingHosts{

    public static boolean PingFunc(String ip) {
        try {
            InetAddress address = InetAddress.getByName(ip);
            try {
                return address.isReachable(1500);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return false;
        }
    }
}



