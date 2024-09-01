import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task12 {
    public static List<List<String>> booksOnShelves(List<String> books, int shelvesCount) {

        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < shelvesCount; i++) {
            list.add(new ArrayList<>());
        }

        Collections.sort(books);

        int booksOnShelves = books.size() / shelvesCount;
        int remainsBooks = books.size() % shelvesCount;

        int indexBook = 0;

        for (int i = 0; i < shelvesCount; i++) {
            for (int j = 0; j < booksOnShelves; j++) {
                list.get(i).add(books.get(indexBook++));
            }

            if (remainsBooks-- > 0) {
                list.get(i).add(books.get(indexBook++));
            }
        }

        return list;

    }
}
