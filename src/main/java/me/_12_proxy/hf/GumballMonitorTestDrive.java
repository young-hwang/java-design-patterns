package me._12_proxy.hf;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] locations = {
                "rmi://localhost/seoul/gumballmachine",
                "rmi://localhost/seoul/gumballmachine",
                "rmi://localhost/seoul/gumballmachine"
        };

        GumballMonitor[] gumballMonitors = new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            try {
                GumballMachineRemote remote = (GumballMachineRemote) Naming.lookup(locations[i]);
                gumballMonitors[i] = new GumballMonitor(remote);
                gumballMonitors[i].report();
            } catch (NotBoundException e) {
                throw new RuntimeException(e);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
