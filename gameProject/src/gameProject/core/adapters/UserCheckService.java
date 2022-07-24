package gameProject.core.adapters;

import java.rmi.RemoteException;

import gameProject.entities.concretes.Player;

public interface UserCheckService {
	boolean checkIfRealPerson(Player player) throws NumberFormatException, RemoteException;
}
