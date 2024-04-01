import java.io.FileNotFoundException;
import java.util.*;

public class BookReport {
    public static void main(String args[]) throws FileNotFoundException {
        BookDA book = new BookDA();
        AuthorDA author = new AuthorDA();


        HashMap<String, Book> bookMap = book.getBookMap();
        HashMap<String, Author> authorMap = author.getAuthorMap();

        for(Map.Entry<String, Book> Entry: bookMap.entrySet()) {
            Book book1 = Entry.getValue();
            Author author1 = book.;




        }
    }
}
