abstract class Animal1 { // 추상 클래스
    public abstract void cry();
}
interface Pet { // 인터페이스
    public abstract void play();
}

class Dog1 extends Animal1 implements Pet { // Animal 클래스 상속 & Pet 인터페이스 구현
    public void cry(){
        System.out.println("멍멍!");
    }

    public void play(){
        System.out.println("원반 던지기");
    }
}

class Cat1 extends Animal1 implements Pet { // Animal 클래스 상속 & Pet 인터페이스 구현
    public void cry(){
        System.out.println("야옹~!");
    }

    public void play(){
        System.out.println("쥐 잡기");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        Cat1 cat = new Cat1();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }
}