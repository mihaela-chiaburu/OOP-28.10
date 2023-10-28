public class Lucrator {
    private String nume;
    private Integer varsta;
    private Integer experienta; //unitatea de masura va fi ani
    private Double salariu;
    public Lucrator(String nume, Integer varsta, Integer experienta, Double salariu){
        this.nume = nume;
        this.varsta = varsta;
        this.experienta = experienta;
        this.salariu = salariu;
    }
    public String getNume(){
        return this.nume;
    }
    public Integer getVarsta(){
        return this.varsta;
    }
    public Integer getExperienta(){
        return this.experienta;
    }
    public Double getSalariu(){
        return this.salariu;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public void setVarsta(Integer varsta){
        this.varsta = varsta;
    }
    public void setExperienta(Integer experienta){
       this.experienta = experienta;
    }
    @Override
    public String toString() {
        return "\nLucrator: " +
                "\nnume: " + this.getNume() +
                "\nvasrta: " + this.getVarsta() +
                "\nexperienta: " + this.getExperienta() +
                "\nsalariu: " + this.getSalariu() + "\n";

    }
}
