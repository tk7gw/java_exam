public class Exam5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        int add = addition(num1, num2);
        int sub = subtraction(num1, num2);
        int mul = multiplication(num1, num2);
        int div = division(num1, num2);
        int rem = remainder(num1, num2);

        System.out.println("足し算結果:" + add);
        System.out.println("引き算結果:" + sub);
        System.out.println("掛け算結果:" + mul);
        System.out.println("割り算結果:" + div);
        System.out.println("剰余算結果:" + rem);
    }

    static int addition(int num1,int num2){
        return num1 + num2;
    }

    static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    static int division(int num1, int num2){
        return num1 / num2;
    }

     static int remainder(int num1, int num2){
        return num1 % num2;
    }
}
