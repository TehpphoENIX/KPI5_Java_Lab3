public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();

        BaseFactory whiteFactory = abstractFactory.getFectory("WhiteFactory");
        BaseFactory blackFactory = abstractFactory.getFectory("BlackFactory");

        Circle whiteCircle = whiteFactory.createCircle();
        System.out.println(whiteCircle.present());
        Triangle whiteTriangle = whiteFactory.createTriangle();
        System.out.println(whiteTriangle.present());

        Circle blackCircle = blackFactory.createCircle();
        System.out.println(blackCircle.present());
        Triangle blackTriangle = blackFactory.createTriangle();
        System.out.println(blackTriangle.present());
    }
}