package user.model.service;

import java.util.ArrayList;

import user.model.vo.User;

public class UserService {
	// +insertUser(User user):int
	// +selectCheckID(String userid):int
	// +selectCheckNickName(String nickname):int
	// +selectLogin(String userid, String userpwd):User
	// +updateUser(User user):int
	// +deleteUser(String userid):int
	// +selectUser(String userid):User
	// +selectUserList():ArrayList<User>
	// +selectUserSearchId(String keyword):ArrayList<User>
	// +selectUserSearchNick(String keyword):ArrayList<User>
	// +deleteUser(String userid):int
	
	public int insertUser(User user) {
		int result = 0;
		return result;
	}
	
	public int selectCheckID(String userid) {
		int result = 0;
		return result;
	}
	
	public int selectCheckNickName(String nickName) {
		int result = 0;
		return result;
	}
	
	public User selectLogin(String userid, String userpwd) {
		User user = null;
		return user;
	}
	
	public int updateUser(User user) {
		int result = 0;
		return result;
	}
	
	public int quitUser(String userid) {
		int result = 0;
		return result;
	}
	
	public User selectUser(String userid) {
		User user = null;
		return user;
	}
	
	public ArrayList<User> selectUserList() {
		ArrayList<User> list = null;
		return list;
	}
	
	public ArrayList<User> selectUserSearchId(String keyword) {
		ArrayList<User> list = null;
		return list;
	}
	
	public ArrayList<User> selectUserSearchNick(String keyword) {
		ArrayList<User> list = null;
		return list;
	}
	
	public int deleteUser(String userid) {
		int result = 0;
		return result;
	}
}
