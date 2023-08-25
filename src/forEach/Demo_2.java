package forEach;

import java.util.ArrayList;
import java.util.List;

public class Demo_2 {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<>();

		userList.add(new User(5, "helon", "hl@gmail.com"));
		userList.add(new User(6, "darvi", "dv@gmail.com"));
		userList.add(new User(7, "john", "john@gmail.com"));
		userList.add(new User(8, "seasol", "ss@gmail.com"));
		userList.add(new User(9, "jackson", "jk@gmail.com"));

		System.out.println("----------      Before Java 8       -----------");
		for (User user : userList) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(" ");
		}

		System.out.println("-----      After Java 8 with forEach      -----");
		userList.forEach(user -> {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(" ");
		});

	}

}

class User {

	private Integer id;
	private String name;
	private String email;

	public User(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
