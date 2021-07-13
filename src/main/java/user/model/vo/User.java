package user.model.vo;

import java.sql.Date;

public class User implements java.io.Serializable {
	private static final long serialVersionUID = 111L;
	
	private String userId;
	private String nickName;
	private String userPwd;
	private String userNm;
	private java.sql.Date birthDate;
	private String phone;
	private String email;
	private String addr;
	private String addrDetail;
	private int point;
	private String userIntro;
	private String userRank;
	private String admin;
	
	public User() {}

	public User(String userId, String nickName, String userPwd, String userNm, Date birthDate, String phone,
			String email, String userRank, String admin) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.userPwd = userPwd;
		this.userNm = userNm;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.userRank = userRank;
		this.admin = admin;
	}

	public User(String userId, String nickName, String userPwd, String userNm, Date birthDate, String phone,
			String email, String addr, String addrDetail, int point, String userIntro, String userRank, String admin) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.userPwd = userPwd;
		this.userNm = userNm;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.addr = addr;
		this.addrDetail = addrDetail;
		this.point = point;
		this.userIntro = userIntro;
		this.userRank = userRank;
		this.admin = admin;
	}
	
}
