package exam;


import dao.MemberDao;
import dto.Member;

/**
 * insert()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class InsertMain {
    public static void main(String[] args) {
        Member member = new Member();
        member.setName("シロー");
        member.setAge(54);
        member.setDepId(3);

        MemberDao dao = new MemberDao();
        dao.insert(member);
    }
}
