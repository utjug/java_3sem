class NumPare {
    Double real1;
    Double real2;
    Double img1;
    Double img2;

    NumPare(Double real1, Double real2) {
        this.real1 = real1;
        this.real2 = real2;
    }

    NumPare(Double real1, Double real2, Double img1, Double img2) {
        this.real1 = real1;
        this.real2 = real2;
        this.img1 = img1;
        this.img2 = img2;
    }
}

interface ArithmeticOperations {
    void add(NumPare p);
    void subtract(NumPare p);
    void multiply(NumPare p);
    void divide(NumPare p);
}

class Numbers implements ArithmeticOperations {

    @Override
    public void add(NumPare p) {
        System.out.println(p.real1+p.real2);
    }

    @Override
    public void subtract(NumPare p) {
        System.out.println(p.real1-p.real2);
    }

    @Override
    public void multiply(NumPare p) {
        System.out.println(p.real1*p.real2);
    }

    @Override
    public void divide(NumPare p) {
        System.out.println(p.real1/p.real2);
    }
}

class ComplexNumbers implements ArithmeticOperations {

    @Override
    public void add(NumPare p) {
        Double newReal = p.real1+p.real2;
        Double newImg = p.img1+p.img2;
        System.out.println(newReal + "+-" + newImg + "i");
    }

    @Override
    public void subtract(NumPare p) {
        Double newReal = p.real1-p.real2;
        Double newImg = p.img1-p.img2;
        System.out.println(newReal + "+-" + newImg + "i");
    }

    @Override
    public void multiply(NumPare p) {
        Double newReal = p.real1*p.real2 - p.img1*p.img2;
        Double newImg = p.real1*p.img2 + p.real2*p.img1;
        System.out.println(newReal + "+-" + newImg + "i");
    }

    @Override
    public void divide(NumPare p) {
        Double newReal = (p.real1*p.real2 + p.img1*p.img2)/(p.real2*p.real2 + p.img2*p.img2);
        Double newImg = (p.img1*p.real2 - p.real1*p.img2)/(p.real2*p.real2 + p.img2*p.img2);
        System.out.println(newReal + "+-" + newImg + "i");
    }
}

public class HW31 {
    public static void main(String[] args) {
        //NumPare numPare = new NumPare(1.0, 2.0, 3.0, 4.0);
        //ArithmeticOperations count = new ComplexNumbers();
        NumPare numPare = new NumPare(1.0, 5.0);
        ArithmeticOperations count = new Numbers();
        count.add(numPare);
    }
}
