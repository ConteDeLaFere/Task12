import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of("Harry Potter", "Lord of the Rings", "Hobbit", "War and Peace", "Crime and Punishment",
                "Pride and Prejudice", "To Kill a Mockingbird", "The Great Gatsby", "Moby Dick", "Ulysses", "Raven", "Sorrow", "Fun", "Love", "Weak", "Strike", "Captain's daughter"));

        int shelvesCount = 7;

        List<List<String>> list = Task12.booksOnShelves(books, shelvesCount);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Полка " + (i + 1) + " " + list.get(i));
        }
    }
}