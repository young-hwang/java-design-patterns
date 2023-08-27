package io.github.younghwang.hfdesignpattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachienRemote extends Remote {
    String getLocation() throws RemoteException;

    int getCount() throws RemoteException;

    State getState() throws RemoteException;
}
