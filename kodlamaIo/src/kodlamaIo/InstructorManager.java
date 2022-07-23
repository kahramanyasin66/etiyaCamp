package kodlamaIo;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
	private List<Instructor> instructors;
    
	public InstructorManager() {
		instructors = new ArrayList<>();
	}

	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " E�itmen Ba�ar�yla Eklendi" + " /id: " +instructor.getId());

	}

	public void update(Instructor instructor) {

		System.out
				.println(instructor.getFirstName() + " " + instructor.getLastName() + " E�itmen Ba�ar�yla G�ncellendi" + " /id: " +instructor.getId());
	}

	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " E�itmen Ba�ar�yla Silindi" + " /id: " +instructor.getId());

	}

	public List<Instructor> getAll() {
		return instructors;
	}

}
