package io.github.younghwang.hfdesignpattern.proxy;

import java.rmi.RemoteException;

public class GumballMachineServer implements GumballMachienRemote {
    @Override
    public String getLocation() throws RemoteException {
        return null;
    }

    @Override
    public int getCount() throws RemoteException {
        return 0;
    }

    @Override
    public State getState() throws RemoteException {
        return null;
    }
}
