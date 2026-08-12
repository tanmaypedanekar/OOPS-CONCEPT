public class _2employee {

    // Instance varibles .
    private String name;
    private int age;
    private double salary;
    private boolean isMarried;

    // creating constructor
    // when we try to make a object of this class it is mendatory to take this from the object;
    //this keyword is refers to the current object saves the value in the instance varible ;
    _2employee(String name,int age,double salary,boolean isMarried){
       this.name = name;
       this.age = age;
       this.salary = salary;
       this.isMarried = isMarried;
    }

    public void displayDetails() {
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee Age is : " + age);
        System.out.println("Employee Salary is : " + salary);
        System.out.println("Employee is Married or not ?: " + isMarried);
    }
}
