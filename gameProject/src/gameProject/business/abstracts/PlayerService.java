package gameProject.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import gameProject.entities.concretes.Player;

public interface PlayerService {
	void add(Player player) throws NumberFormatException, RemoteException, Exception;
	void update(Player player);
	void delete(Player player);
	
	List<Player> getAll();
}
