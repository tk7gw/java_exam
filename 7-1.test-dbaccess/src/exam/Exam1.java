package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Exam1 {
    public static void main(String[] args) {
        // 接続情報
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "Tkgw7mao";

        Connection con = null; // 使用する変数の宣言
        PreparedStatement pstmt = null;
        String sql = null;

        try {
            // (1)データベースに接続
            con = DriverManager.getConnection(url, user, password);

            // (2)SQL文を作成
            sql = "INSERT INTO test_members (name, age, dep_id) VALUES (?, ?, ?)";

            // (3)SQL実行準備
            pstmt = con.prepareStatement(sql);

            // (4)SQL実行
            pstmt.setString(1, "山田太郎");
            pstmt.setInt(2, 62);
            pstmt.setInt(3, 1);
            pstmt.executeUpdate();

            pstmt.setString(1, "佐藤花子");
            pstmt.setInt(2, 33);
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();

            pstmt.setString(1, "遠藤次郎");
            pstmt.setInt(2, 55);
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();

            // (5)結果の操作
            System.out.println("INSERT完了");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // (6)メモリの解放(切断)
            try {
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
