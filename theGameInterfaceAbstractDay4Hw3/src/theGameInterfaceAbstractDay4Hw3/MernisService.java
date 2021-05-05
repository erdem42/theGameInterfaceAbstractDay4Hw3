package theGameInterfaceAbstractDay4Hw3;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements UserCheckService{
	public boolean checkIfRealPerson(Gamer gamer) {
		boolean result=false;
		
		try {
			result=new KPSPublicSoapProxy().TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(),
																gamer.getLastname().toUpperCase(),gamer.getDateOfBirth().getYear());
			
		}
		catch(RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
}
