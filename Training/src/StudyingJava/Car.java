package StudyingJava;

public class Car {
    String name;
    int number;
    Car(){
        this.name = "이름없음";
        this.number = 0;
    }
    Car(String name) {
        this.name = name;
        this.number = 0;
    }
    Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}