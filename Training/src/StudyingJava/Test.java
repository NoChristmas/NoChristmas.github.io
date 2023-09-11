package StudyingJava;

public class Test {
    public static void main(String[] args) {
        Calcul cal = new CalculImpl();
        cal.multi(0, 0);
        cal.plus(1,2);
        int i = cal.exec(4,5);
        System.out.println(i);

        Calcul.exec2(i, i);
    }
}
