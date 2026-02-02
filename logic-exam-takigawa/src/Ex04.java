public class Ex04 {
    public static void main(String[] args) {
        int seireki = 2000;

        if (seireki % 4 == 0 && seireki % 100 == 0 && seireki % 400 == 0){
            System.out.println(seireki + "年はうるう年です");
        } else if (seireki % 4 == 0 && seireki % 100 == 0){
            System.out.println(seireki + "年はうるう年ではありません");
        } else if (seireki % 4 == 0){
            System.out.println(seireki + "年はうるう年です");
        }
    }
}
