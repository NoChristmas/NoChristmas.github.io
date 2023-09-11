package StudyingJava;

public interface Calcul {
    public int plus (int a, int b);
    public int multi (int a, int b);

    default int exec(int a, int b) { //밑으로 내려감....default 는 내려간다.
        return a+b;
    }

    static int exec2(int a , int b) {
        return a*b;
    }
}
