package kodlamaIo;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	private List<User> users;

	public UserManager() {
		users = new ArrayList<>();
	}

	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullan�c� Ba�ar�yla Eklendi" + " /id: " +user.getId());
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullan�c� Ba�ar�yla G�ncellendi" + " /id: " +user.getId());
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullan�c� Ba�ar�yla Silindi" + " /id: " +user.getId());

	}

	public List<User> getAll() {
		return users;
	}

}
