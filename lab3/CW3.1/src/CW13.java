import java.util.Scanner;

interface Fruit {
    String getName();
    Double getWeight();
    boolean isTasty(String taste);
}

class Orange implements Fruit{
    @Override
    public String getName() {
        return ("Апельсин");
    }
    @Override
    public Double getWeight() {
        Scanner fruitweight = new Scanner(System.in);
        Double FruitWeight = fruitweight.nextDouble();
        return FruitWeight;
    }
    @Override
    public boolean isTasty(String taste) {
        if (taste.equals("Апельсин")) {
            return true;
        }
        else return false;
    }
}

class Banana implements Fruit {
    @Override
    public String getName() {
        return ("Банан");
    }
    @Override
    public Double getWeight() {
        Scanner fruitweight = new Scanner(System.in);
        Double FruitWeight = fruitweight.nextDouble();
        return FruitWeight;
    }
    @Override
    public boolean isTasty(String taste) {
        if (taste.equals("Банан")) {
            return true;
        }
        else return false;
    }
}

class Apple implements Fruit {
    @Override
    public String getName() {
        return ("Яблоко");
    }
    @Override
    public Double getWeight() {
        Scanner fruitweight = new Scanner(System.in);
        Double FruitWeight = fruitweight.nextDouble();
        return FruitWeight;
    }
    @Override
    public boolean isTasty(String taste) {
        if (taste.equals("Яблоко")) {
            return true;
        }
        else return false;
    }
}

public class CW13 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Fruit orange = new Orange();

        //apple.getName();
        //apple.getWeight();
        //apple.isTasty("Яблоко");
        System.out.println(apple.getName() + apple.getWeight() + apple.isTasty("Яблоко"));
    }
}
