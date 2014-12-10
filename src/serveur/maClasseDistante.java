package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class maClasseDistante extends UnicastRemoteObject implements monInterfaceDistante {

	protected maClasseDistante() throws RemoteException {
		super();
	}

	public void helloWorld(){
		System.out.println("Hello worlddd");
	}
	
}
