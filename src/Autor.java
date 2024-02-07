public class Autor {
    private String surnameAutor;
    private String nameAutor;

    public Autor(String surnameAutor, String nameAutor) {
        this.surnameAutor = surnameAutor;
        this.nameAutor = nameAutor;
    }

    public String getSurnameAutor() {
        return surnameAutor;
    }

    public String getNameAutor() {
        return nameAutor;
    }
    public String toString(){
        return this.nameAutor+" "+this.surnameAutor;
    }


}
