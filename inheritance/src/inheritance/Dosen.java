package inheritance;

public class Dosen extends Person{
	private String code_dosen;
	private int point;
	public Dosen(String name, String date, String code_dosen, int point) {
		super(name, date);
		this.code_dosen = code_dosen;
		this.point = point;
	}
	public String getCode_dosen() {
		return code_dosen;
	}
	public void setCode_dosen(String code_dosen) {
		this.code_dosen = code_dosen;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void selfDev() {
		System.out.println(this.getName() + " is doing self development");
	}
	
	public void teach() {
		System.out.println(this.getName() + " is doing teaching");
	}
	
	public void p2m() {
		System.out.println(this.getName() + " is doing p2m");
	}
	
	public void research() {
		System.out.println(this.getName() + " is doing research");
	}
	
	public void otherWorks() {
		System.out.println(this.getName() + " is doing other works");
	}
}
