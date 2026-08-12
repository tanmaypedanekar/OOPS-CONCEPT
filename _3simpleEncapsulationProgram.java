class encapsulationLaptop {
    // Making the instance varible as a private .
    private int price;
    private String name;
    private char grade;
    private boolean isSuperb;

    public int getPrice() {
        return price;
    }
     public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }

    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade= grade; 
    }

    public boolean getSuperb() {
        return isSuperb;
    }
    public void setSuperb(boolean isSuperb) {
        this.isSuperb= isSuperb;
    }

}

public class _3simpleEncapsulationProgram {
    public static void main(String[] args) {
        encapsulationLaptop info = new encapsulationLaptop();
        info.setName("Tanmay");
        info.setPrice(10000);
        info.setGrade('A');
        info.setSuperb(true);

        System.out.println(info.getName());
        System.out.println(info.getPrice());
        System.out.println(info.getGrade());
        System.out.println(info.getSuperb());

    }
}
