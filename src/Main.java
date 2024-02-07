import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Чехов", "Антон");
        Autor autor2 = new Autor("Гетте", "Иоганн");
        Autor autor3 = new Autor("Чехов", "Антон");
        Book book1 = new Book("Фауст", autor2, 2015);
        Book book2 = new Book("Вишневый сад", autor1, 2014);
        Book book3 = new Book("Вишневый сад", autor1, 2002);
        book1.setYearOfPublic(2016);
        System.out.println(book1);

        System.out.println(autor1.equals(autor3));
        System.out.println(book3.equals(book1));
    }
}