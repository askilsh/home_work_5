import java.util.Random;

public class Reader 
{
	String name;
	public Book[] dict;

	public Reader(String name, Book[] dict)
	{
		this.dict = dict;
		this.name = name;
	}

	public Book	choiseBook(Book[] dict)
	{
		Random random = new Random();
		int choise = dict.length - 1;

		choise = random.nextInt(choise);
		
		return dict[choise];
	}

	public void	readBook(Book book)
	{
		System.out.println("Выбрал книгу: " + book);
	}

	public int	estimate(Book book)
	{
		Random random = new Random();
		int esti = 0;
		if (book.name == "Без имени")
			esti = esti - random.nextInt(50);
		else
			esti = esti + book.name.length();
		if (book.author == "Без автора")
			esti = esti - random.nextInt(50);
		else
			esti = esti + book.author.length();
		if (book.number == 0)
			esti = esti - random.nextInt(50);
		else
			esti = esti + book.number;
		return esti;
	}
}
