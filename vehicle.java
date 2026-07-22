public class vehicle {
    int wheels;
    float petrol;
    char name;
    int price;

    public void drive(){
        System.out.println("car is driving");
        petrol--;
    }

    public float showPetrol(){
        return petrol;
    }

    public void addPetrol(int newPetrol){
       petrol+=newPetrol;
    }
}
