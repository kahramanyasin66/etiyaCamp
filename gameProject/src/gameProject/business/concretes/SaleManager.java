package gameProject.business.concretes;

import java.util.ArrayList;
import java.util.List;

import gameProject.business.abstracts.SaleService;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Player;
import gameProject.entities.concretes.Sale;

public class SaleManager implements SaleService{
	private List<Sale> sales;
	public SaleManager() {
		sales=new ArrayList<Sale>();
	}

	@Override
	public void add(Sale sale) {
		Player player = sale.getPlayer();
		Game game = sale.getGame();
		double discountedPrice = calculateDiscountedPrice(sale);
		System.out.println("Satýþ yapýlan oyuncu: " +player.getFirstName() + " " + player.getLastName());
		System.out.println("Satýþ yapýlan oyun: " +game.getName() + "\nFiyatý: " + game.getPrice());
		System.out.println("Kampanyadan sonraki fiyatý: " +discountedPrice + "\n");
		sales.add(sale);
	}
	

	private double calculateDiscountedPrice(Sale sale) {
		Campaign campaign = sale.getCampaign();
		Game game = sale.getGame();
		double campaignDiscount = campaign.getDiscount();
		double discountedPrice = game.getPrice() - (game.getPrice()*(campaignDiscount/100));
		return discountedPrice;
	}

	@Override
	public List<Sale> getAll() {
		
		return sales;
	}
}
