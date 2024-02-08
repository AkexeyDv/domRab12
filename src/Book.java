import java.util.Objects;

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
        return "Книга {" +
                "Название: '" + name + '\'' +
                ", Автор: " + autor +
                ", Год издания: " + yearOfPublic +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublic == book.yearOfPublic && Objects.equals(name, book.name) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode()
    {
        return java.util.Objects.hash(name + autor);

    }
}
