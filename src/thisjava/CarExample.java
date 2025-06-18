package thisjava;

public class CarExample {

    public static void main(String[] args) {
        //Create Car's Object
        Car myCar = new Car("sonata", "black", 250);

        //Read Car's Object Field
        System.out.println("company : " + myCar.company);
        System.out.println("model : " + myCar.model);
        System.out.println("color : " + myCar.color);
        System.out.println("maxSpeed : " + myCar.maxSpeed);
        System.out.println("start : " + myCar.start);
        System.out.println("speed : " + myCar.speed);

        //Change Car's Object Field
        myCar.speed = 60;
        System.out.println("change speed : " + myCar.speed);
    }
}
