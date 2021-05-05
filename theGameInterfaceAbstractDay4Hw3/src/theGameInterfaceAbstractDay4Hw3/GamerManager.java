package theGameInterfaceAbstractDay4Hw3;

public class GamerManager extends UserManager {
	
		UserCheckService UserCheckService;
	
		public GamerManager(UserCheckService userCheckService) {
			super();
			UserCheckService = userCheckService;
		}

	@Override
	public void save(Gamer gamer) {
		if(UserCheckService.checkIfRealPerson(gamer)) {
		System.out.println("saved Gamer: "+gamer.getId());
		}
		else {
			System.out.println("invalid person");
		}
		
	}

	@Override
	public void remove(Gamer gamer) {
		System.out.println("removed Gamer: "+gamer.getId());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("updated Gamer: "+gamer.getId());
		
	}
	
	
}
