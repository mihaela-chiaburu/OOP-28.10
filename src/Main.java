import exemplu.Persoana;
import exemplu.Profesor;
import exemplu.Student;
import exemplu.A;
import exemplu.B;

public class Main {
    public static void main(String[] args) {
        Lucrator lucrator = new Lucrator("Test1", 30, 5, 20000.0);
        System.out.println(lucrator);

        /*Lucrator*/Programator programator = new Programator("Test2", 25, 2, 30000.0, 100.0);
        System.out.println(programator);

        //exemplul la tabla
        Persoana persoana1 = new Persoana("Ion", 20, 100.0);
        Student student1 = new Student("Cristi", 19,  "FI-221");
        Profesor prof1 = new Profesor("Maxim", 21, 110.0, 1200.0);
        System.out.println(student1.getBonus());
        student1.setCarnetSindicate(true);

        System.out.println(persoana1);
        System.out.println(student1);
        System.out.println(prof1);

        //exemplu de override
        A a = new A();
        A b = new B();

        a.metodaTest();
        b.metodaTest();

        System.out.println(a.test);
        System.out.println(b.test);
    }
}