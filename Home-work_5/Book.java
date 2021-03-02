public class Book
{
	String name = "Без имени";
	String author = "Без автора";
	int number;
	String pages = "Неизвестное количество";

	public Book(String name, String author, int number, String pages) 
	{
		this.name = name;
		this.author = author;
		this.number = number;
		this.pages = pages;
	}

	public Book(String name, String author, int number) 
	{
		this.name = name;
		this.author = author;
		this.number = number;
	}

	public Book(String name, int number) 
	{
		this.name = name;
		this.number = number;
	}

	public Book(int number) 
	{
		this.number = number;
	}

	@Override
	public String toString() 
	{
		return "{"
		+ "Название - " + this.name
		+ ", Автор - " + this.author
		+ ", Номер - " + this.number
		+ ", Размер - " + this.pages + " страниц."
		+ '}';
	}
}

	

