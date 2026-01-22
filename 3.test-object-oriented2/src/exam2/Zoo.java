package exam2;

public class Zoo {
    public static void main(String[] args) {
        
        Animal animals[] = {new Sheep(), new Horse(), new Goat()};
        for(int i = 0; i < animals.length; i++){
            animals[i].cry();
        }
        
    }

}
