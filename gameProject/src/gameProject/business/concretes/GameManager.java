package gameProject.business.concretes;

import java.util.ArrayList;
import java.util.List;

import gameProject.business.abstracts.GameService;
import gameProject.entities.concretes.Game;

public class GameManager implements GameService {
	private List<Game> games;

	public GameManager() {
		games = new ArrayList<Game>();
	}

	@Override
	public void add(Game game) {
		games.add(game);
		System.out.println(game.getName() + " : Oyun Baþarýyla Eklendi");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " : Oyun Baþarýyla Güncellendi");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " : Oyun Baþarýyla Silindi");

	}

	@Override
	public List<Game> getAll() {
		return games;
	}

}
