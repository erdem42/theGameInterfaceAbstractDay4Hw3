package theGameInterfaceAbstractDay4Hw3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Gamer erdem=new Gamer("erdem","yüksek","e@gmail.com","111111111111", LocalDate.of(2000,01, 01));
		
		GamerManager gamerManager=new GamerManager(new MernisService());
		gamerManager.save(erdem);
	
	
		Game warcraft=new Game(1, "WARCRAFT",100);
		
		Campaign yuzde10Kampanyasi=new Campaign(1,"Campaign1", 10);
		
		CampaignManager campaignManager=new CampaignManager(yuzde10Kampanyasi);
	
		campaignManager.add();
	
		GameSaler gameSaler=new GameSaler();
		gameSaler.buyTheGame(erdem,warcraft);
		gameSaler.buyTheGameWithCampaign(erdem,warcraft,yuzde10Kampanyasi);
		
	
	
	
	
	}

}
