package me._12_proxy.hf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    String getLocation() throws RemoteException;

    int getCount() throws RemoteException;

    State getState() throws RemoteException;
}
