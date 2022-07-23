package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		/*---------------------------USERS---------------------------*/
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Yasin");
		user1.setLastName("Kahraman");
		user1.setIdentityNumber("21548896638");
		user1.setEmail("yasink66@gmail.com");
		user1.setPassword("123456");
		user1.setState(1); // 1: Aktif 		
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Furkan");
		user2.setLastName("Kahraman");
		user2.setIdentityNumber("55487769921");
		user2.setEmail("furkank66@gmail.com");
		user2.setPassword("654321");
		user2.setState(1); // 1: Aktif 
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.add(user2);
		
		userManager.update(user2);
		userManager.delete(user2);
		
		/*---------------------------INSTRUCTORS---------------------------*/
		Instructor instructor1 = new Instructor(3, "Nihat", "Kahraman", "45784456115", "nihatk66@gmail.com", "789654", 1,"55");
		Instructor instructor2 = new Instructor(4, "Zümra", "Kahraman", "87496658712", "zumrak66@gmail.com", "987654", 1,"66");
		Instructor instructor3 = new Instructor(5, "Bektaþ", "Kahraman", "12457896582", "bektask66@gmail.com", "789456", 2,"88");
        
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor3); 
		instructorManager.add(instructor2); 
		instructorManager.add(instructor1); 
		
		instructorManager.update(instructor3); 
		
		instructorManager.delete(instructor2); 
		/*---------------------------STUDENTS---------------------------*/
		Student student1 = new Student(6, "Attila Han", "Kahraman", "45487712658", "attilak66@gmail.com", "123321", 1,"88888");
		Student student2 = new Student(7, "Timur Kaan", "Kahraman", "45771248965", "timurk66@gmail.com", "321123", 1,"99999");
        
		StudentManager studentManager = new  StudentManager();
		studentManager.add(student2);
		studentManager.add(student1);
		
		studentManager.update(student2);
		
		studentManager.delete(student1);
		
		/*---------------------------LÝSTS---------------------------*/

		System.out.println("-----------EÐÝTMENLER---------");

		for (Instructor instructor : instructorManager.getAll()) {
			System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
		}
		System.out.println("-----------ÖÐRENCÝLER---------");

		for (Student student : studentManager.getAll()) {
			System.out.println(student.getFirstName() + " " + student.getLastName());
		}
		System.out.println("-----------KULLANICILAR---------");		
		for (User user : userManager.getAll()) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}	
		
		
	}

}
