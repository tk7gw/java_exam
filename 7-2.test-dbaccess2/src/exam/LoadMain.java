package exam;


import dao.MemberDao;
import dto.Member;

/**
 * load()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */

public class LoadMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();
        Member member = dao.load(2);
        System.out.println(member);
    }
}
