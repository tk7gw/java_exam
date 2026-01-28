package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam3 {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "Tkgw7mao";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(url, user, password);

            // (2)SQL文を作成
            String sql = "SELECT id, name, age, dep_name FROM test_members";

            // (3)SQL実行準備
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // (4)SQL実行
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String depName = rs.getString("dep_name");

                // (5)結果の操作
                System.out.println("id=" + id +
                        ", name=" + name +
                        ", age=" + age +
                        ", dep_name=" + depName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
