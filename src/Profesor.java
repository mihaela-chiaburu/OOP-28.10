public class Profesor extends Persoana{
    private Double salariu;
    public Profesor(String nume, Integer varsta, Double salariu){
        super(nume, varsta);
        this.salariu = salariu;
    }
    public Double getSalariu(){
        return this.salariu;
    }
    public void setSalariu(Double salariu){
        this.salariu = salariu;
    }
    public String toString() {
        return "\nProfesor: " +
                "\nnume: " + super.getNume() +
                "\nvasrta: " + super.getVarsta() +
                "\nsalariu: " + this.getSalariu() + "\n";
    }
}
