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
        return this.nameAutor + " " + this.surnameAutor;
    }

    @Override
    public boolean equals(Object autorOther) {
        if (this.getClass() != autorOther.getClass()) {
            return false;
        }
        Autor autX = (Autor) autorOther;
        return (nameAutor + surnameAutor).equals(autX.nameAutor + autX.surnameAutor);

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAutor + surnameAutor);
    }

}
