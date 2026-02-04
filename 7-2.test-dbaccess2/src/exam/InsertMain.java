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
		MemberDao dao = new MemberDao();
		Member entity = new Member();

		entity.setName("シロー");
		entity.setAge(54);
		entity.setDepId(3);
		dao.insert(entity);

		System.out.println("insert終了");
	}

}
