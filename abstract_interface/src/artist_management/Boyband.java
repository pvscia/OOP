package artist_management;

public class Boyband extends Artist{

	public Boyband(String name, String agency) {
		super(name, "Male", agency);
		// TODO Auto-generated constructor stub
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
