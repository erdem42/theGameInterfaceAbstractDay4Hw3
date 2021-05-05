package theGameInterfaceAbstractDay4Hw3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gamer extends User {
	
	int id;
	private String firstName;
	private String lastname;
	private String email;
	private String nationalityId;
	private ArrayList<String> games;
	private ArrayList<Integer> campaigns;
	
	
	private LocalDate dateOfBirth;
	public Gamer(String firsName, String lastname, String email, String nationalityId, LocalDate dateOfBirth) {
		super();
		this.firstName = firsName;
		this.lastname = lastname;
		this.email = email;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firsName) {
		this.firstName = firsName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
}

	public ArrayList<String> getGames() {
		return games;
	}

	public void setGames(ArrayList<String> games) {
		this.games = games;
	}

	public ArrayList<Integer> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(ArrayList<Integer> campaigns) {
		this.campaigns = campaigns;
	}
}