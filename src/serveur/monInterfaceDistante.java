package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface monInterfaceDistante extends Remote{

	public void helloWorld() throws RemoteException;
	
	
}
