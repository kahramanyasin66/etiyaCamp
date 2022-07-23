package kodlamaIo;

public class Student extends User {
	private String studentNo;

	public Student(int id, String firstName, String lastName, String identityNumber, String email, String password,
			int state, String studentNo) {

		super(id, firstName, lastName, identityNumber, email, password, state);
		this.studentNo = studentNo;

	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

}
