import java.util.Scanner;

//클래스 Car 생성
class Car {
    //필드변수 선언
    public String color = "Blue";
    public double speed = 10.4;
    public int gear = 1;

    //기어변속 메소드
    void ChangeGear(int gear_c) {
        gear = gear_c;
    }
    //속도 증가 메소드
    void SpeedUp() {
        speed += 10;
    }
    //속도 저하 메소드
    void SpeedDown() {

        speed -=10;
    }
    //정보 출력
    void CarPrint() {
        System.out.println("차 색상: "+color);
        System.out.println("기어: "+gear);
        System.out.println("속도: "+speed);
    }
}

public class Hw2 {
    public static void main(String[] args) {
        //변수선언
        int num =0;
        int gear;

        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        car.CarPrint();
        System.out.println("----------------------");

        //-1이 나올때까지 반복
        while (num != -1) {
            //동작을 입력받음
            System.out.print("수행할 동작 입력(기어변속: 1, 가속: 2, 감속: 3, 종료: -1) :");
            num = sc.nextInt();
            //입력받은 동작을 판별 & 살행
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
