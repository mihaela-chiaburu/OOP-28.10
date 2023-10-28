package exemplu;

public class Persoana {
    private String nume;
    private Integer varsta;
    private Double bonus;
    public Persoana(){};

    public Persoana (String nume, Integer varsta, Double bonus){
        this.nume = nume;
        this.varsta = varsta;
        this.bonus = bonus;
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
    public void setBonus(Double bonus){
        this.bonus = bonus;
    }
    public Double getBonus(){
        return this.bonus;
    }
    public String toString() {
        return "\nexemplu.Persoana: " +
                "\nnume: " + this.getNume() +
                "\nvasrta: " + this.getVarsta() +
                "\nbonus: " + this.getBonus() + "\n";
    }
}
