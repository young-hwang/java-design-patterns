package io.github.younghwang.hfdesignpattern.proxy;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count = 0;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            // Create an RMI registry on port 1099
            LocateRegistry.createRegistry(1099);
            Naming.rebind(args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
