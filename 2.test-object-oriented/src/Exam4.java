public class Exam4 {
    public static void main(String[] args) {
        
        int addAnswer = Calculation.addition(5, 3);
        System.out.println("足し算の結果:" + addAnswer);
        
        int subAnswer = Calculation.subtraction(5, 3);
        System.out.println("引き算の結果:" + subAnswer);
        
        int multiAnswer = Calculation.multiplication(5, 3);
        System.out.println("掛け算の結果:" + multiAnswer);
        
        int divAnswer = Calculation.division(5, 3);
        System.out.println("割り算の結果:" + divAnswer);
        
        int remainAnswer = Calculation.remainder(5, 3);
        System.out.println("剰余の結果:" + remainAnswer);

    }

}
