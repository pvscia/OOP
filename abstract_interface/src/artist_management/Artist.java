package artist_management;

public abstract class Artist implements Activity{
	private String name,gender,agency;

	public Artist(String name, String gender, String agency) {
		super();
		this.name = name;
		this.gender = gender;
		this.agency = agency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	
	
}
