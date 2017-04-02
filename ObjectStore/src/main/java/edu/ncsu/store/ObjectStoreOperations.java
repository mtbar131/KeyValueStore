package edu.ncsu.store;

import java.net.InetAddress;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.HashSet;

import edu.ncsu.chord.ChordID;

/**
 * Created by amit on 24/3/17.
 */
public interface ObjectStoreOperations extends Remote {

  byte[] getObject(ChordID<String> key) throws RemoteException;

  boolean putObject(ChordID<String> key, byte[] value) throws RemoteException;

  boolean putObjects(HashMap<ChordID<String>, byte[]> keyValueMap) throws RemoteException;

  boolean delete(ChordID<String> key) throws RemoteException;

  boolean deleteKeys(HashSet<ChordID<String>> key) throws RemoteException;

}