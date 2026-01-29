package exam;

import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
    public static void main(String[] args) {
        Member member = new Member();
        member.setId(2);
        member.setAge(100);

        MemberDao dao = new MemberDao();
        dao.update(member);

		System.out.println("update終了");

    }
}
