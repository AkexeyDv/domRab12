public class Main {
    public static void main(String[] args) {
        Autor autor1=new Autor("Чехов","Антон");
        Autor autor2=new Autor("Иоганн","Гетте");
        Book book1=new Book("Фауст",autor2,2015);
        Book book2=new Book("Вишневый сад",autor1,2014);
        book1.setYearOfPublic(2016);
    }
}