public class Body 
{
	public static Book book_1 = new Book("Война и мир", "Толстой", 0001, "5000");
	public static Book book_2 = new Book(2);
	public static Book book_3 = new Book("Мертвые души" ,"Гоголь", 3);
	public static Book book_4 = new Book("Предания и мифы древней Греции", 4);
	public static Book book_5 = new Book("Атлант раправил плечи", "Айн Рэнд", 5);
	public static Book book_6 = new Book("Капитал. Критика политической экономии", "Карл Маркс", 0006, "5000");
	public static Book book_7 = new Book("Богатый папа, бедный папа", "Роберт Киосаки", 0007, "300");
	public static Book book_8 = new Book(8);
	public static Book book_9 = new Book("Азбука для самых маленьких", 9);

	public static Book[] dict = {book_1, book_2, book_3, book_4, book_5, book_6, book_7, book_8, book_9};

	public static void main(String[] args)	
	{
		Reader vyacheslav = new Reader("SLAVIK_BANDIT_2006", dict);
		open(vyacheslav, dict);

		Reader anastasya = new Reader("nastusha_<3_mamu_i_papu_2010", dict);
		open(anastasya, dict);

		Reader irina = new Reader("irina_petrovna", dict);
		open(irina, dict);

		Reader vladimir = new Reader("vladimir_vladimirovich", dict);
		open(vladimir, dict);

		Reader panda = new Reader("redPanda", dict);
		open(panda, dict);
		
	}

	public static void open(Reader reader, Book[] dict)
	{
		Book book = new Book(0);

		System.out.println("Двери открываются, в читальный зал заходит user : " + reader.name);
		book = reader.choiseBook(dict);
		reader.readBook(book);
		reader.estimate(book);
		System.out.println("Читает книгу: " + book);
		System.out.println("Оценивает в " + reader.estimate(book) + " балл(а)(ов).");
		if ((reader.estimate(book) > 49))
			System.out.println("Книга читателю " + reader.name + " очень понравилась.");
		else if ((reader.estimate(book) < 50) && (reader.estimate(book) > 0))
			System.out.println("Книга читателю " + reader.name + " понравилась.");
		else
			System.out.println("Книга читателю " + reader.name + " не понравилась.");
		System.out.println("");
	}
}
