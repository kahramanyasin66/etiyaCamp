package kodlamaIo;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	private List<Student> students;

	public StudentManager() {
		students = new ArrayList<>();
	}

	public void add(Student student) {
		students.add(student);
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Öğrenci Başarıyla Eklendi" + " /id: " +student.getId());
	}

	public void update(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Öğrenci Başarıyla Güncellendi" + " /id: " +student.getId());
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Öğrenci Başarıyla Silindi" + " /id: " +student.getId());
	}
	
	public List<Student> getAll(){
		return  students;
	}

}
