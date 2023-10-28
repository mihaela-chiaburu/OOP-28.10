public class Programator extends Lucrator{
    private Double bonus;
    public Programator(String nume, Integer varsta, Integer experienta, Double salariu, Double bonus){
        super(nume, varsta, experienta, salariu);
        this.bonus = bonus;
    }
    public void setBonus(Double bonus){
        this.bonus = bonus;
    }
    public Double getBonus(){
        return this.bonus;
    }
    @Override
    public String toString() {
        return "\nProgramator: " +
                "\nnume: " + super.getNume() +
                "\nvasrta: " + super.getVarsta() +
                "\nexperienta: " + super.getExperienta() +
                "\nsalariu: " + super.getSalariu() +
                "\nbonus: " + this.getBonus() + "\n";
    }
}
