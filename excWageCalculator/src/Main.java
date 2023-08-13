import company.DBA;
import company.Developer;
import company.Tester;

public class Main {
    public static void main(String[] args) {
        Tester pedro = new Tester ("Pedro", 5500);
        Developer ricardo = new Developer ("Ricardo", 10760);
        DBA cidao = new DBA ("Cidão", 15478);

        System.out.printf("Salário do Pedro: %.2f \n", pedro.getWage());
        System.out.printf("Salário do Ricardo: %.2f \n", ricardo.getWage());
        System.out.printf("Salário do Cidao: %.2f \n", cidao.getWage());
    }
}