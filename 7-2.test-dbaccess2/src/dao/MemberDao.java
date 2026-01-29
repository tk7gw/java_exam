package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {

	static final String TABLE_NAME = "test_members";

	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll() {
		Connection con = DBManager.createConnection();
		String sql = "SELECT id,name,age,dep_id FROM " + TABLE_NAME + " ORDER BY age DESC";
		List<Member> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Member entity = new Member();
				entity.setId(rs.getInt("id"));
				entity.setName(rs.getString("name"));
				entity.setAge(rs.getInt("age"));
				entity.setDepId(rs.getInt("dep_id"));
				list.add(entity);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member load(int id) {
		Connection con = DBManager.createConnection();
		String sql = "SELECT id,name,age,dep_id FROM " + TABLE_NAME + " WHERE id = ?;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Member entity = new Member();
				entity.setId(rs.getInt("id"));
				entity.setName(rs.getString("name"));
				entity.setAge(rs.getInt("age"));
				entity.setDepId(rs.getInt("dep_id"));
				return entity;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member) {
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO " + TABLE_NAME + " (name,age,dep_id) VALUES(?,?,?);";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getAge());
			pstmt.setInt(3, member.getDepId());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * メンバー情報を更新します
	 * 
	 * @param entity 更新する情報をもったentity
	 */
	public void update(Member entity) {
		Connection con = DBManager.createConnection();
		String sql = "UPDATE " + TABLE_NAME + " SET age = ? WHERE id = ?;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, entity.getAge());
			pstmt.setInt(2, entity.getId());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("更新処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

}
