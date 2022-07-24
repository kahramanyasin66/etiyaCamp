package gameProject.core.adapters;

import java.rmi.RemoteException;


import gameProject.entities.concretes.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(
				Long.parseLong(player.getIdentityNumber()),
				player.getFirstName().toUpperCase(),
				player.getLastName().toUpperCase(),
				player.getBirthYear());

		return result;
	}
	

}
