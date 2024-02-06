public class Autor{
    private String surnameAutor;
    private String nameAutor;

    public Autor(String surnameAutor,String nameAutor){
        this.surnameAutor=surnameAutor;
        this.nameAutor=nameAutor;
    }
    public String getFam() {
        return surnameAutor;
    }
    public String getIma() {
        return nameAutor;

    }


}
