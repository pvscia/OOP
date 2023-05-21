package artist_management;

public class Soloist extends Artist{

	public Soloist(String name, String gender, String agency) {
		super(name, gender, agency);
	}

	@Override
	public void musicShow(String musicShowName) {
		System.out.println(this.getName() + " is doing promotion at " + musicShowName);
		
	}

	@Override
	public void varietyShow(String varietyName) {
		System.out.println(this.getName() + " is doing variety show at " + varietyName);
		
	}

	@Override
	public void awardShow(String awardName) {
		System.out.println(this.getName() + " is attending " + awardName);
		
	}

	@Override
	public void concert(String concertCountry) {
		System.out.println(this.getName() + " is having a concert in " + concertCountry);
     		
	}

}
