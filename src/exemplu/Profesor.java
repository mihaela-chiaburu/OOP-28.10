package exemplu;

public class Profesor extends Persoana{
    private Double salariu;
    public Profesor(String nume, Integer varsta, Double bonus, Double salariu){
        super(nume, varsta, bonus);
        this.salariu = salariu;
    }
    public Double getSalariu(){
        return this.salariu;
    }
    public void setSalariu(Double salariu){
        this.salariu = salariu;
    }
    public String toString() {
        return "\nexemplu.Profesor: " +
                "\nnume: " + super.getNume() +
                "\nvasrta: " + super.getVarsta() +
                "\nbonus: " + super.getBonus() +
                "\nsalariu: " + this.getSalariu() + "\n";
    }
}
