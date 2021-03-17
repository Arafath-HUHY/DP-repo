package com.mphasis.main;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerApp {

    public static void main(String[] args) {
        AuthenticationRemoteImpl authencationService = null;
        try {
            authencationService = new AuthenticationRemoteImpl();
            Naming.rebind("rmi:///RemoteAuthentication",authencationService);
            System.out.println("Remote Object registered... ");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
