public class Book {
    private String name;
    private Autor autor;
    private int yearOfPublic;

    public Book(String name, Autor autor, int yearOfPublic) {
        this.name = name;
        this.autor = autor;
        this.yearOfPublic = yearOfPublic;

    }

    public String getName() {
        return name;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getYearOfPublic() {
        return yearOfPublic;
    }

    public void setYearOfPublic(int yearOfPublic) {
        this.yearOfPublic = yearOfPublic;
    }

    @Override
    public String toString() {
        return "Название книги '" + this.name + "'. Автор: " + autor + ". Год издания: " + this.yearOfPublic;
    }

    @Override
    public boolean equals(Object otherBook) {
        if (this.getClass() != otherBook.getClass()) {
            return false;
        }
        Book bookX = (Book) otherBook;
        return (name + autor).equals(bookX.name + bookX.autor);

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name + autor);
    }

}
