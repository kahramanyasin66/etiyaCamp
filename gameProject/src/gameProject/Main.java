package gameProject;

import gameProject.business.concretes.CampaignManager;
import gameProject.business.concretes.GameManager;
import gameProject.business.concretes.PlayerManager;
import gameProject.business.concretes.SaleManager;
import gameProject.core.adapters.MernisAdapter;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Player;
import gameProject.entities.concretes.Sale;

public class Main {

	public static void main(String[] args) throws Exception {

		/*------------------PLAYER----------------*/
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstName("Yasin");
		player1.setLastName("Kahraman");
		player1.setEmail("yk66@gmail.com");
		player1.setPassword("1212");
		player1.setIdentityNumber("23486659968");
		player1.setBirthYear(1994);

		PlayerManager playerManager = new PlayerManager(new MernisAdapter());
		playerManager.add(player1);
		
		
		for(Player player: playerManager.getAll()) {
			System.out.println(player.getFirstName());
		}

		/*------------------GAME----------------*/

		Game game1 = new Game();
		game1.setId(1);
		game1.setName("CallOfDuty");
		game1.setPrice(25.5);

		Game game2 = new Game();
		game2.setId(2);
		game2.setName("CounterStrike");
		game2.setPrice(28.5);

		GameManager gameManager = new GameManager();
		gameManager.add(game2);
		gameManager.add(game1);
		
		for(Game game: gameManager.getAll()) {
			System.out.println(game.getName());
		}
		

		/*------------------CAMPAIGN----------------*/
		Campaign campaign1 = new Campaign(1, "Öðrenciye Ýyilik Kampanyasý", 10);
		Campaign campaign2 = new Campaign(2, "Yaza Özel Fýrsat Kampanyasý", 5);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		for(Campaign campaign: campaignManager.getAll()) {
			System.out.println(campaign.getName());
		}

		/*------------------SALE----------------*/
		SaleManager saleManager = new SaleManager();
		Sale sale1 = new Sale(1, player1, game1, campaign1);
		Sale sale2 = new Sale(2, player1, game2, campaign2);

		saleManager.add(sale1);
		saleManager.add(sale2);
		
		for(Sale sale: saleManager.getAll()) {
			System.out.println(sale.getId());
		}

	}

}
