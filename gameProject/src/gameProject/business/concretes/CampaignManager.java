package gameProject.business.concretes;

import java.util.ArrayList;
import java.util.List;

import gameProject.business.abstracts.CampaignService;
import gameProject.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	private List<Campaign> campaigns;

	public CampaignManager() {
		campaigns = new ArrayList<Campaign>();
	}

	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);
		System.out.println(campaign.getName() + " : Kampanya Ba�ar�yla Eklendi");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " : Kampanya Ba�ar�yla G�ncellendi");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " : Kampanya Ba�ar�yla Silindi");

	}

	@Override
	public List<Campaign> getAll() {
		return campaigns;
	}

}
