
class Car {

    String name;
    int price;

    public void Specs(String name) {
        System.out.println(name);
    }

    public void Specs(int price) {
        System.out.println(price);
    }

    public void Specs(String name, int price) {
        System.out.println(name + " " + price);
    }

}


public class Inheritence {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.name = "Ferrari Sf90 stradale";
        car1.price = 70000000;

        car1.Specs(car1.name);
        car1.Specs(car1.price);
        car1.Specs(car1.name, car1.price);
    }
}
// Cltrl + Alt +L