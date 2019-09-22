import java.util.Scanner;

public class Rectangle {

    void area(int a) {
        System.out.println("정사각형의 넓이는"+a*a+"입니다.");
    }
    void area(int a, int b) {
        System.out.println("작사각형의 넓이는"+a*b+"입니다.");
    }

    public static void main(String[] args) {
        int num,width,height;

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("사각형의 종류를 선택하세요(정사각형: 1, 직사각형: 2):");
        num = sc.nextInt();

        if(num == 1) {
            System.out.print("변의 길이:");
            width = sc.nextInt();
            rectangle.area(width);
        }
        else if(num == 2) {
            System.out.print("가로의 길이:");
            width = sc.nextInt();
            System.out.print("세로의 길이:");
            height = sc.nextInt();
            rectangle.area(width,height);

        }
    }
}