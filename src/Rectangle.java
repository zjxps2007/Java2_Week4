import java.util.Scanner;

public class Rectangle {
    //정사각형 넓이구하는 메소드
    void area(int a) {
        System.out.println("정사각형의 넓이는"+a*a+"입니다.");
    }
    //직사각형  넓이구하는 메소드
    void area(int a, int b) {
        System.out.println("작사각형의 넓이는"+a*b+"입니다.");
    }

    public static void main(String[] args) {
        //변수선언
        int num,width,height;

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        //판별할 번호입력받음
        System.out.print("사각형의 종류를 선택하세요(정사각형: 1, 직사각형: 2):");
        num = sc.nextInt();

        //정사각형 or 직사각형 판별
        if(num == 1) {
            System.out.print("변의 길이:");
            width = sc.nextInt();
            //메소드 호출
            rectangle.area(width);
        }
        else if(num == 2) {
            System.out.print("가로의 길이:");
            width = sc.nextInt();
            System.out.print("세로의 길이:");
            height = sc.nextInt();
            //메소드 호출
            rectangle.area(width,height);

        }
    }
}