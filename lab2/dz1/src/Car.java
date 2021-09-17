public class Car {
    String model;
    int maxSpeed;
    double weight;

    Car (String a) {
        model = a;
    }
    Car (String a, int b) {
        model = a;
        maxSpeed = b;
    }
    Car (String a, int b, double c) {
        model = a;
        maxSpeed = b;
        weight = c;
    }

    public void show() {
        if (model != null && maxSpeed != 0 && weight != 0) {
            System.out.println("Модель: "+model+" Макс.скорость: "+maxSpeed+" Вес: "+weight);
        }
        else {
            if (model != null && maxSpeed != 0) {
                System.out.println("Модель: "+model+" Макс.скорость: "+maxSpeed);
            }
            else {
                if (model != null) {
                    System.out.println("Модель: "+model);
                }
                else {
                    System.out.println("Нет данных");
                }
            }
        }
    }
}
