import utils.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args)
	{
        Author author1 = new Author(1, "Jane Doe", (byte) 45);
        Author author2 = new Author(2, "John Smith", (byte) 38);
        Author author3 = new Author(3, "Emily Brown", (byte) 50);

        Publisher publisher1 = new Publisher(1, "Penguin Random House", "USA");
        Publisher publisher2 = new Publisher(2, "HarperCollins", "UK");

        List<Book> books = Arrays.asList
        (
            new Book(1, "The Great Adventure", 19.99f, author1, publisher1),
            new Book(2, "Mysteries of the Ocean", 25.99f, author2, publisher1),
            new Book(3, "Cooking Made Simple", 15.99f, author3, publisher1),
            new Book(4, "Exploring the Cosmos", 29.99f, author1, publisher2),
            new Book(5, "Tales from the Wild", 18.49f, author2, publisher2),
            new Book(6, "The Art of Gardening", 20.00f, author3, publisher2),
            new Book(7, "History Uncovered", 24.75f, author1, publisher1)
        );
        
        Map<String, List<Author>> specMap = books.stream().
        		filter(book -> book.getPrice() > 20f).
        		collect(Collectors.groupingBy(book -> book.getPublisher().getCountry(),
                    Collectors.mapping
                    (
                        Book::getAuthor,
                        Collectors.toList()
                    )
                ));
        specMap.replaceAll((country, authors) -> authors.stream().distinct().collect(Collectors.toList()));
        
        specMap.forEach((country, authors) ->
        {
        	System.out.println("-------");
        	System.out.println(country);
        	authors.forEach((val) -> System.out.println(val));
        	System.out.println("-------");
        });
	}
}
