import java.util.Scanner;

class Car {
    public String color = "Blue";
    public double speed = 10.4;
    public int gear = 1;

    void ChangeGear(int gear_c) {
        if(gear_c>=1&&gear_c<=5){
            gear = gear_c;
        }
        else {
            System.out.println("기어 변속은 1~5단까지 가능합니다.");
        }
    }
    void SpeedUp() {
        speed += 10.0;
        if (speed>=100) {
            speed=100;
        }
    }
    void SpeedDown() {
        speed -=10.0;
        if (speed<=0) {
            speed = 0;
        }
    }
    void CarPrint() {
        System.out.println("차 색상: "+color);
        System.out.println("기어: "+gear);
        System.out.println("속도: "+speed);
    }
}
public class Hw3 {
    public static void main(String[] args) {
        int num =0;
        int gear;

        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        car.CarPrint();
        System.out.println("----------------------");

        while (num != -1) {
            System.out.print("수행할 동작 입력(기어변속: 1, 가속: 2, 감속: 3, 종료: -1) :");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("몇 단으로 변속할지 입력:");
                    gear = sc.nextInt();
                    car.ChangeGear(gear);
                    car.CarPrint();
                    break;
                case 2:
                    car.SpeedUp();
                    car.CarPrint();
                    break;
                case 3:
                    car.SpeedDown();
                    car.CarPrint();
                    break;
            }
            System.out.println("----------------------");
        }
    }
}
