package ObjectInfo;

    public class Main {
        public static void main(String[] args) {
            Car car1 = new Car("c", "Toyota", 2025, 99999.99, "Black", 12);
            Car car2 = new Car("h", "Toyota", 2024, 91899.99, "silver", 10);
            System.out.println(car1);
            System.out.println(car2);
            System.out.println(car1.getColor());
            int year = car1.getYear();
            car1.setColor("yellow");
            System.out.println("are they equal? " + car1.equals(car2));
            System.out.println("car1.hashCode(): " + car1.hashCode());
            System.out.println("car2.hashCode(): " + car2.hashCode());
            System.out.println("hashCodes equal ? " + (car1.hashCode() == car2.hashCode()));
        }
    }


