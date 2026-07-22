public class driver {
    public static void main(String[] args) {
        vehicle sameer = new vehicle();
        sameer.drive();
        System.out.println(sameer.showPetrol());
        sameer.addPetrol(10);
        System.out.println(sameer.showPetrol());
    }

}
