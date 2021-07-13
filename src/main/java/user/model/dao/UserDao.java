package user.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import user.model.vo.User;

public class UserDao {
	// +insertUser(Connection conn, User user):int
	// +selectCheckID(Connection conn, String userid):int
	// +selectCheckNickName(Connection conn, String nickname):int
	// +selectLogin(Connection conn, String userid, String userpwd):User
	// +updateUser(Connection conn, User user):int
	// +quitUser(Connection conn, String userid):int
	// +selectUser(Connection conn, String userid):User
	// +selectUserList(Connection conn):ArrayList<User>
	// +selectUserSearchId(Connection conn, String keyword):ArrayList<User>
	// +selectUserSearchNick(Connection conn, String keyword):ArrayList<User>
	// +deleteUser(Connection conn, String userid):int
	
	public int insertUser(Connection conn, User user) {
		int result = 0;
		return result;
	}
	
	public int selectCheckID(Connection conn, String userid) {
		int result = 0;
		return result;
	}
	
	public int selectCheckNickName(Connection conn, String nickName) {
		int result = 0;
		return result;
	}
	
	public User selectLogin(Connection conn, String userid, String userpwd) {
		User user = null;
		return user;
	}
	
	public int updateUser(Connection conn, User user) {
		int result = 0;
		return result;
	}
	
	public int quitUser(Connection conn, String userid) {
		int result = 0;
		return result;
	}
	
	public User selectUser(Connection conn, String userid) {
		User user = null;
		return user;
	}
	
	public ArrayList<User> selectUserList(Connection conn) {
		ArrayList<User> list = null;
		return list;
	}
	
	public ArrayList<User> selectUserSearchId(Connection conn, String keyword) {
		ArrayList<User> list = null;
		return list;
	}
	
	public ArrayList<User> selectUserSearchNick(Connection conn, String keyword) {
		ArrayList<User> list = null;
		return list;
	}
	
	public int deleteUser(Connection conn, String userid) {
		int result = 0;
		return result;
	}
}
