package exam3;

public class DeLorean implements Car, Airplane, TimeMachine{
    
    @Override
    public void run(){
        System.out.println("デロリアンが走る！");

    }
    @Override
    public void fly(){
        System.out.println("デロリアンが飛ぶ！");
    }
    @Override
    public void timeTravel(){
        System.out.println("デロリアンがタイムテレポート！");
    }

    public void engineStart(){
        run();
        fly();
        timeTravel();
    }
}
