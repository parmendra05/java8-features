package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(1, "Java", 999));
		books.add(new Book(5, "Mean Stack", 1850));
		books.add(new Book(2, "Mern Stack", 1990));
		books.add(new Book(7, "Spring Boot", 700));
		books.add(new Book(15, "Python", 850));
		books.add(new Book(11, "PHP", 499));

		// Sorting using collection api
		Collections.sort(books, (o1, o2) -> (int) o1.getPrice() - o2.getPrice());
		books.forEach(System.out::println);
		System.out.println("---------------------");

		// Sorting by Lambda with Comparator
		/*
		 * books.stream().sorted((obj1, obj2) -> (int)( obj1.getId()-obj2.getId()))
		 * .forEach(System.out::println);
		 */

		System.out.println("----  Sorting by Price ASC Order ----");
		books.stream().sorted(Comparator.comparing(b -> b.getPrice())).forEach(System.out::println);

		System.out.println("----  Sorting by Name ASC Order using method reference ::  ----");
		books.stream().sorted(Comparator.comparing(Book::getName)).forEach(System.out::println);

		System.out.println("----  Sorting by Name DESC Order using method reference ::  ----");
		books.stream().sorted(Comparator.comparing(Book::getName).reversed()).forEach(System.out::println);

		System.out.println("----  Sorting by ID ----");
		books.stream().sorted(Comparator.comparing(Book::getId)).forEach(System.out::println);
	}

}

class Book {
	int id;
	String name;
	int price;

	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
