package gameProject.entities.concretes;

public class Player extends User {
	private String firstName;
	private String lastName;
	private String identityNumber;
	private String birthYear;

	public Player() {

	}

	public Player(int id, String email, String password, String firstName, String lastName, String identityNumber,
			String birthYear) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthYear = birthYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumberString(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
