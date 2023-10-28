package exemplu;

public class Student extends Persoana{
    private String grupa;
    private boolean carnetSindicate;
    private Double bonus = 150d; ////------------ se repeta aceeasi proprietate din persoana// override

    public Student(String nume, Integer varsta, String grupa){
        super(nume, varsta, 150d);
        this.grupa = grupa;
    }
    public String getGrupa(){
        return this.grupa;
    }
    public void setGrupa( String grupa){
        this.grupa = grupa;
    }
    public void setCarnetSindicate(Boolean carnetSindicate){
        this.carnetSindicate  = carnetSindicate;
    }
    public Boolean getCarnetSindicate(){
        return this.carnetSindicate;
    }
    public String toString() {
        return "\nexemplu.Student: " +
                "\nnume: " + super.getNume() +
                "\nvasrta: " + super.getVarsta() +
                "\ngrupa: " + this.getGrupa() +
                "\nbonus: " + bonus +
                "\ncarnet Sindicate: " + this.getCarnetSindicate() + "\n";
    }
}
