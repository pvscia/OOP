package inheritance;

public class Mahasiswa extends Person{
	
	private String student_id;
	private int point;
	
	public Mahasiswa(String name, String date, String student_id, int point) {
		super(name, date);
		this.student_id = student_id;
		this.point = point;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public void helpingDosen() {
		point+=10;
		System.out.println("Plus 10 points for helping dosen!");
		System.out.println("Current point : " + this.point);
	}
}
