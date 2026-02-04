package exam;

import java.util.List;

import dao.MemberDao;
import dto.Member;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		List<Member> list = dao.findAll();
		for (Member entity : list) {
			System.out.print("id = " + entity.getId());
			System.out.print(",name = " + entity.getName());
			System.out.print(",age = " + entity.getAge());
			System.out.println(",dep_id = " + entity.getDepId());
		}

	}

}
