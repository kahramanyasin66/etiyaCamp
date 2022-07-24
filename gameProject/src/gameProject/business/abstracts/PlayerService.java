package gameProject.business.abstracts;

import java.util.List;

import gameProject.entities.concretes.Player;

public interface PlayerService {
	void add(Player player);
	void update(Player player);
	void delete(Player player);
	
	List<Player> getAll();
}
