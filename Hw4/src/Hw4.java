//학생 객체
class Stu {
    //필드변수 생성
    private int id; //학번
    private String name; //이름
    private int score; //점수

    //생성자
    public Stu(int i, String n, int sc) {
        id = i;
        name = n;
        score = sc;
    }
    //학번  접근자
    public int getId(){
        return id;
    }
    //이름 접근자
    public String getName(){
        return name;
    }
    //점수 접근자
    public int getScore() {
        return score;
    }
    //점수변경 메소드
    public  void changeScore(int sc) {
        score = sc;
    }
    //정보 출력 메소드
    public void println() {
        System.out.println("[ID : " + id +",Name :" + name +",Score :"+score+"]");
    }
}

//Students 클래스 생성
class Students {
    private Stu[] sts; //stu 배열선언
    private int number;  //배열에 있는 객체수
    //생성자
    public Students(){
        sts = new Stu[100];
        number = 0;
    }
    public Students(int n) {
        sts = new Stu[n];
        number = 0;
    }
    //i 번째학생 검색
    public Stu StudentsAt(int i) {
        if(0<=i&&i<=number-1){
            return sts[i];
        }
        else {
            return null;
        }
    }
    //학생추가 메소드
    public void append(Stu s) {
        sts[number] = s;
        number ++;
    }
    //학생이름 검색
    public Stu getByName(String nm) {
        for(int i = 0; i<number;i++) {
            if(sts[i].getName().equals(nm)) {
                return sts[i];
            }
        }
        return null;
    }
    //출력 메소드
    public void print(){
        for(int i=0; i<number;i++) {
            sts[i].println();
        }
    }
    //교환 메소드
    private void swap(int i, int j) {
        Stu temp = sts[i];
        sts[i] = sts[j];
        sts[j] = temp;
    }
    //학번으로 정렬
    public void sortByld(){
      for(int i =0;i<number;i++) {
          for(int j=i;i<number;j++) {
              if(sts[i].getId()>sts[j].getId()) {
                  swap(i,j);
              }
          }
      }
    }
    //성적순으로 정렬
    public  void sortByScore(){
        for(int i =0;i<number;i++) {
            for (int j = i; i < number; j++) {
                if (sts[i].getScore() > sts[j].getScore()) {
                    swap(i, j);
                }
            }
        }
    }
    //전체 학생 평균 메소드
    public double average(){
        double sum = 0;
        for(int i = 0;i<number;i++) {
            sum += sts[i].getScore();
        }
        return sum/number;
    }
}

0public class Hw4 {
    public static void main(String[] args) {

    }
}
