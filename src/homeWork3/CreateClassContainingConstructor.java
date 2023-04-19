package homeWork3;

public class CreateClassContainingConstructor {
    String isbn, nameBook, authorBook;
    int page;
    int year;

    public CreateClassContainingConstructor(String nameBook, String authorBook, String isbn, int page, int year) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.isbn = isbn;
        this.page = page;
        this.year = year;
    }

    public CreateClassContainingConstructor(String nameBook, String authorBook, int year) {
        this(year);
        this.nameBook = nameBook;
        this.authorBook = authorBook;
    }

    public CreateClassContainingConstructor(String isbn) {
        this.isbn = isbn;
    }

    public CreateClassContainingConstructor(int year) {
        this.year = year;
    }

    public CreateClassContainingConstructor() {
    }

    public void printBookInfo() {
        System.out.println(isbn + " " + nameBook +","+ " " +" автор: " + authorBook);
    }

    public void publication() {
        if (year >= 2020) {
            System.out.println("Новое издание");
        }
        if (year <= 2019) {
            System.out.println("Старое издание");
        }
    }

}
