package polymorphismTest.test;

import java.io.PrintStream;

public class Issue {
    String name;
    public Issue(String name) {
        this.name = name;
    }
    public void printName(PrintStream out) {
         out.println("Наименование:");
         out.println(name);
    }
}
 class Book extends Issue {
    String authors;
    public Book(String name, String authors) {
        super(name);
        this.authors = authors;
    }

    public void printAuthors(PrintStream out) {
        out.println("Авторы:");
        out.println(authors);
    }
}
class Journal extends Issue{

    public Journal(String name) {
        super(name);
    }
}
class Hm {
    public static void main(String[] args) {
        Issue[] catalog = new Issue[]{
                new Book("Война и мир", "Л.Толстой"),
                new Journal("Play Boy"),};
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] instanceof Book)
                ((Book) catalog[i]).printAuthors(System.out);
            catalog[i].printName(System.out);
        }
    }
}

