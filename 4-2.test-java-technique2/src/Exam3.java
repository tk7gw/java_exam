import java.util.ArrayList;
import java.util.List;

public class Exam3 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("後藤", 31));
        list.add(new Employee("山田", 28));
        list.add(new Employee("佐藤", 25));
        list.add(new Employee("田中", 19));

        for (Employee employe : list) {
            System.out.println(employe.getName() + "(" + employe.getAge() + "歳)");
        }
    }

}
