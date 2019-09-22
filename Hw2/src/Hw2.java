import java.util.Scanner;

class Car {
    public String color = "Blue";
    public double speed = 10.4;
    public int gear = 1;

    void ChangeGear(int a) {

    }
    void SpeedUp() {

    }
    void SpeedDown() {

    }
    void CarPrint() {

    }
}

public class Hw2 {
    public static void main(String[] args) {
        int num =0;

        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        while (num != -1) {
            System.out.print();
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("");
            }
        }
    }
}
