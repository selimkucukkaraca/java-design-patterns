package decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Phone phone = new Iphone11ProMax((new Iphone()));

        System.out.println(" name : " + phone.getName());
        System.out.println(" Price : " + phone.getPrice());
        System.out.println(" camera count : " + phone.cameraCount());
    }
}
