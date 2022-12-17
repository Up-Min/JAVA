package ch09;

import java.sql.Date;

public class Student {
	// 엔티티 클래스
	// DB에 있는 컬럼명과 동일하게 필드 선언
	private int id;
	private String username;
	private String univ;
	private Date birth; //java.sql.Date 임포트함.
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
