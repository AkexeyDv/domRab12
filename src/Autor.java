import java.util.Objects;

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

    @Override
    public String toString() {
        return surnameAutor + ' ' + nameAutor ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(surnameAutor, autor.surnameAutor) && Objects.equals(nameAutor, autor.nameAutor);
    }

    @Override
    public int hashCode() {

        return java.util.Objects.hash(nameAutor + surnameAutor);
    }

}
