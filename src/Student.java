public class Student extends Persoana{
    private String grupa;
    public Student(String nume, Integer varsta, String grupa){
        super(nume, varsta);
        this.grupa = grupa;
    }
    public String getGrupa(){
        return this.grupa;
    }
    public void setGrupa( String grupa){
        this.grupa = grupa;
    }
    public String toString() {
        return "\nStudent: " +
                "\nnume: " + super.getNume() +
                "\nvasrta: " + super.getVarsta() +
                "\ngrupa: " + this.getGrupa() + "\n";
    }
}
