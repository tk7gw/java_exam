package exam;

import java.util.List;

import dao.MemberDao;
import dto.Member;

public class FindAllMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();
        List<Member> list = dao.findAll();
        for (Member m : list) {
            System.out.println(m);
        }
    }
}
