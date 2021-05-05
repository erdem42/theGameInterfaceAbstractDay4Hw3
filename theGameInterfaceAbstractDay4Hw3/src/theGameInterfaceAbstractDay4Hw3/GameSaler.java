package theGameInterfaceAbstractDay4Hw3;

public class GameSaler extends Saler{
	
	
	
	public void buyTheGame(Gamer gamer,Game game) {
		System.out.println("buyed the game: "+game.getName()+"price:"+game.getPrice()+" "+gamer.getFirstName());
	}
	
	public void buyTheGameWithCampaign(Gamer gamer,Game game,Campaign campaign) {
		System.out.println("buyed the game: "+game.getName()+"price:"+
							game.getPrice()*(100-campaign.getDiscount())/100+" "+gamer.getFirstName());
	}
}
