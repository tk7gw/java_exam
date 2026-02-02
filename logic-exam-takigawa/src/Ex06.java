import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {

        String random1, random2, random3;

        Random random = new Random();

        Math.floor(Math.random() * 10);

        while(random1 != random2){
            Math.floor(Math.random() * 10);
        }

        while(random2 != random3){
            Math.floor(Math.random() * 10);
        }

        System.out.println(random1, random2, random3);
        
        
    }
}
