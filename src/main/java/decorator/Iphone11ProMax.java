package decorator;

public class Iphone11ProMax extends Iphone11Pro{

    public Iphone11ProMax(Iphone basicPhone) {
        super(basicPhone);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String getName() {
        return super.getName() + " Max";
    }

    public String extraMethod(){
        return "kirmizi";
    }
}
