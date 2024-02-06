public class Book{
    private String name;
    private Autor autor;
    private int yearOfPublic;
    public Book(String name, Autor autor, int yearOfPublic){
        this.name=name;
        this.autor=autor;
        this.yearOfPublic=yearOfPublic;

    }
    public String getName(){
        return name;
    }
    public Autor getAutor(){
        return autor;
    }
    public int getYearOfPublic(){
        return yearOfPublic;
    }
    public void setYearOfPublic(int yearOfPublic){
        this.yearOfPublic = yearOfPublic;


    }

}
