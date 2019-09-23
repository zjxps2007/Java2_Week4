import java.util.Scanner;

//클래스 Car 생성
class Car {
    //필드변수 선언
    public String color = "Blue";
    public double speed = 10.4;
    public int gear = 1;
    //기어변속 메소드
    void ChangeGear(int gear_c) {
        //기어를 1~5단으로 변경
        if(gear_c>=1&&gear_c<=5){
            gear = gear_c;
        }
        else {
            System.out.println("기어 변속은 1~5단까지 가능합니다.");
        }
    }
    //속도 증가 메소드
    void SpeedUp() {
        speed += 10.0;
        //속도가 100이상이면 100으로 고정
        if (speed>=100) {
            speed=100;
        }
    }
    //속도 감속 메소드
    void SpeedDown() {
        speed -=10.0;
        //속도가 0이하면 0으로 고정
        if (speed<=0) {
            speed = 0;
        }
    }
    //정보출력 메소드
    void CarPrint() {
        System.out.println("차 색상: "+color);
        System.out.println("기어: "+gear);
        System.out.println("속도: "+speed);
    }
}
public class Hw3 {
    public static void main(String[] args) {
        //변수 선언
        int num =0;
        int gear;

        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        car.CarPrint();
        System.out.println("----------------------");

        //-1이 나올때까지 반복
        while (num != -1) {
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
