package com.mphasis.main;

import com.mphasis.main.dto.Person;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AuthenticationRemoteImpl extends UnicastRemoteObject implements AuthenticationRemote{

    protected AuthenticationRemoteImpl() throws RemoteException {

    }

    @Override
    public Person loginValidation(String username, String password) throws RemoteException {
        if(username != null && password!=null) {
            if (username.equals("Arafath") && password.equals("pass")){
                return new Person("Arafath","Aboobacker");
            }
        }
        return null;
    }
}
