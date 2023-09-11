package StudyingJava;

class CalculImpl implements Calcul {
    @Override
    public int plus(int a, int b) {
        return a+b;
    }

    @Override
    public int multi(int a, int b) {
        return a*b;
    }


}