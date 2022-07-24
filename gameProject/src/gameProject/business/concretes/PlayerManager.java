package gameProject.business.concretes;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import gameProject.business.abstracts.PlayerService;
import gameProject.core.adapters.UserCheckService;
import gameProject.entities.concretes.Player;

public class PlayerManager implements PlayerService {
	private List<Player> players;
	private UserCheckService userCheckService;

	public PlayerManager(UserCheckService userCheckService) {
		players = new ArrayList<Player>();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(Player player) throws Exception {
		if (userCheckService.checkIfRealPerson(player)) {
			players.add(player);
			System.out.println(player.getFirstName() + " " + player.getLastName() + " : Oyuncu Baþarýyla Eklendi");
		} else {
			throw new Exception("Oyuncu Eklenemedi, Bilgilerini Kontrol Ediniz !");
		}

	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " : Oyuncu Baþarýyla Güncellendi");

	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " : Oyuncu Baþarýyla Silindi");

	}

	@Override
	public List<Player> getAll() {

		return players;
	}

}
