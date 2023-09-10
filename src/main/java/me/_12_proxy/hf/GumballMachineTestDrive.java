package me._12_proxy.hf;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            GumballMachineRemote seoulGumballMachine = new GumballMachine("seoul", 1);

            // Create an RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            Naming.rebind("seoul/gumballmachine", seoulGumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
