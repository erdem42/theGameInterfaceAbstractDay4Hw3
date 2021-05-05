package theGameInterfaceAbstractDay4Hw3;

public class CampaignManager {

		private Campaign campaign;
		
	public CampaignManager(Campaign campaign) {
			
			this.campaign = campaign;
		}


	public void add() {
		
System.out.println("added campaign  "+ campaign.getName()+" :%"+campaign.getDiscount());		
	}

	
	public void delete() {
		System.out.println("deleted campaign  "+ campaign.getName()+" :%"+campaign.getDiscount());		

	}

	
	public void update() {
		System.out.println("added campaign  "+ campaign.getName()+" :%"+campaign.getDiscount());		

	}

}
