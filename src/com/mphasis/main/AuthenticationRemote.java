package com.mphasis.main;

import com.mphasis.main.dto.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthenticationRemote extends Remote {

    public Person loginValidation(String username, String password)throws RemoteException;

}
