package in.apedusoft.ems.dto;

public class User {
	
	private String userId;
	private String pwd;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String pwd) {
		this.userId = userId;
		this.pwd = pwd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", pwd=" + pwd + "]";
	}

}
