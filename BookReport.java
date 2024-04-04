import java.io.IOException;
import java.util.*;
public class BookReport {
    public static void main(String args[]) throws IOException {

        AuthorDA author1 = new AuthorDA();
        HashMap<String, Author> authorMap = author1.getAuthorMap();

        BookDA bookDA = new BookDA(authorMap);
        HashMap<String, Book> bookMap = bookDA.book1();

        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            Book book = entry.getValue();
            Author author = book.getAuthor();

            System.out.println(book.getIsbn() + " " + book.getTitle());
            System.out.println("\t" + author.getName() + " - " + author.getBio() + "\n");
        }
    }

}
