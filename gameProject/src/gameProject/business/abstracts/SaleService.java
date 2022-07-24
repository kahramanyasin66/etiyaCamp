package gameProject.business.abstracts;

import java.util.List;

import gameProject.entities.concretes.Sale;

public interface SaleService {
	void add(Sale sale);	
	List<Sale> getAll();

}
