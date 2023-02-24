package decorator;

public class Iphone implements Phone{
    @Override
    public String getName() {
        return "Iphone ";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 699.90;
    }
}
