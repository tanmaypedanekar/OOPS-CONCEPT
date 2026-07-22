public class student {
    String name;
    int rollNumber;
    int marks;
    float percentage;
    boolean positive;

    public void printName() {
        System.out.println(name);
    }

    public void printMark(int allMark) {
        marks += allMark;
        if (marks > 90) {
            System.out.println("outstanding");
        } else if (marks > 50) {
            System.out.println("excellent");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        student newOne = new student();
        newOne.printMark(10);
    }
}
