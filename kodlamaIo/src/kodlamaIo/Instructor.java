package kodlamaIo;

public class Instructor extends User {
    private String point;
    
    public Instructor(int id, String firstName, String lastName, String identityNumber, String email, String password,
			int state,String point) {
    	
    	super(id, firstName, lastName, identityNumber, email, password,state);
    	this.point = point;    	
	
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}
}
