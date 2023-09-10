package me._12_proxy.hf;

import java.rmi.RemoteException;

public class GumballMachineServer implements GumballMachineRemote {
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
