package decorator;

public class Iphone11 extends PhoneDecorator{

    public Iphone11(Iphone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + " 11";
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
