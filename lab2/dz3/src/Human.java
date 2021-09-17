import java.util.Random;

public class Human {
    Random ran = new Random();
    String healthStatus = "Здоров по-своему";
    protected void lookAround() {
        System.out.println("Вокруг по-разному");
    }
    protected void rateHealth() {
        System.out.println(ran.nextInt(10)+1);
    }
}

class lessHealthyHuman extends Human {
    @Override
    protected void rateHealth() {
        System.out.println(ran.nextInt(7)+1);
    }
    @Override
    protected void lookAround() {
        System.out.println("Вокруг всё так же по-разному");
    }

}

class blindHuman extends lessHealthyHuman {
    @Override
    protected void rateHealth() {
        System.out.println(ran.nextInt(6)+1);
    }
    @Override
    protected void lookAround() {
        System.out.println("Вокруг больше ничего не видно");
    }
}
