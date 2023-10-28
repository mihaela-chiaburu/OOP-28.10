public class Persoana {
    private String nume;
    private Integer varsta;
    public Persoana (String nume, Integer varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
    public String getNume(){
        return this.nume;
    }
    public Integer getVarsta(){
        return this.varsta;
    }
    public void setNume (String nume){
        this.nume = nume;
    }
    public String toString() {
        return "\nPersoana: " +
                "\nnume: " + this.getNume() +
                "\nvasrta: " + this.getVarsta() + "\n";
    }
}
