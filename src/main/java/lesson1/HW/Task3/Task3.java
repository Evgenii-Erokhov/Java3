package lesson1.HW.Task3;

public class Task3 {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        Box<Orange> orangeBox = new Box<>();

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println("appleBox weight is " + appleBox.getWeight());

        appleBox2.add(new Apple());
        System.out.println("appleBox2 weight is " + appleBox2.getWeight());

        appleBox.move(appleBox2);    //пересыпаем в одну коробку
        System.out.println("-----");

        System.out.println("appleBox weight is " + appleBox.getWeight());
        System.out.println("appleBox2 weight is " + appleBox2.getWeight());
        System.out.println("-----");

        System.out.println("Compare oranges and apples: " + appleBox.compare(orangeBox));
        System.out.println("Compare oranges and apples2: " + appleBox2.compare(orangeBox));
    }
}
