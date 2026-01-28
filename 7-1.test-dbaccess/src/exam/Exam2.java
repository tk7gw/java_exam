package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Exam2 {

    public static void main(String[] args) {

        // 接続情報
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "Tkgw7mao";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // (1)データベースに接続
            con = DriverManager.getConnection(url, user, password);

            // (2)SQL文を作成
            String sql = "SELECT id, name, age, dep_id FROM test_members WHERE dep_id = 2";
            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("id:" + rs.getInt("id"));
                System.out.println("name:" + rs.getString("name"));
                System.out.println("age:" + rs.getInt("age"));
                System.out.println("dep_id:" + rs.getInt("dep_id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // (6)メモリの解放(切断)
            try {
                if (rs != null)
                    rs.close();
                if (pstmt != null)
                    pstmt.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
