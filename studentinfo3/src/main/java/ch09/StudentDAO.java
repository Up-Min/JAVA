package ch09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	Connection conn = null; //DB랑 연결을 해주는 아이.
	PreparedStatement pstmt; //쿼리문의 실행을 담당하는 아이.
	// 연결하려면 오라클의 계정정보가 필요하다.
	
	// jdbc : 자바와 DB를 연결해주는 api -> ojdbc6.jar, driver명과 url이 필요하다.
	// url은 어떻게 가져올건가? : 
	final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	// DB 연결 메소드
	public void open() {
		try {
			Class.forName(JDBC_DRIVER);		// 드라이버 로드	
			conn = DriverManager.getConnection(JDBC_URL, "test", "test1234"); // DB 연결 계정, 비밀번호 입력
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// DB 닫는 메소드
	public void close() {
		// pstmt, conn은 리소스(데이터를 읽고 쓰는 객체)이므로 사용후 반드시 닫아줘야 한다.
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 학생 정보를 입력 - insert
	public void insert(Student s) {
		// 먼저 DB를 오픈한다
		open();
		//시퀀스로 넣은 id말고는 나머지는 '?' 처리해준다. 무엇이 들어올지 모르기때문에
		String sql = "insert into student values(id_seq.nextval, ?, ?, ?, ?)";
		// 데이터 넣어주기 (오라클의 데이터 타입으로 변환)
		// 매개변수로 Student를 받아올거고, 그거를 각 set에다가 넣어줄거다 (순서 잘 맞춰서 넣어주기!)
		try {
			pstmt = conn.prepareStatement(sql); //실행할 쿼리문 입력
			pstmt.setString(1, s.getUsername()); // pstmt.setString(넣고싶은 위치, 넣을 데이터)
			pstmt.setString(2, s.getUniv());
			pstmt.setDate(3, s.getBirth());
			pstmt.setString(4, s.getEmail());
			
			pstmt.executeUpdate(); //insert, delete, update 실행시 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			close();
		}
	}
	
	// 학생 정보를 다 불러온다.
	public ArrayList <Student> getAll(){
		open(); //db오픈, 데이터는 student.java안에 있는 거를 받아서 쓸거다!
		ArrayList<Student> students = new ArrayList<>(); //student 객체를 담을 리스트 준비.
		try {
			pstmt = conn.prepareStatement("select*from student"); // prepareStatement 안에 실행할 쿼리문 작성
			// 실행했으면, 데이터를 받을 곳이 필요하겠지? ResultSet. 데이터를 받는 역할을 한다.
			ResultSet rs = pstmt.executeQuery(); // 쿼리문 실행 (select문)
			
			while(rs.next())  { // 테이블의 한 행씩 값이 있는지 없는지를 판단한다.
				// 이후 student 객체를 선언하고 각 필드별 setter을 가져온다.
				// 값을 어떻게 가져올 것인가?
				Student s = new Student(); // student에 있는 하나의 객체를 가져온다. 
				s.setId(rs.getInt("id"));
				s.setUsername(rs.getString("username"));
				s.setUniv(rs.getString("univ"));
				s.setBirth(rs.getDate("birth"));
				s.setEmail(rs.getString("email"));
				students.add(s); // arraylist students에 DB로부터 가져온 정보가 모인 객체 저장.
			}
		} catch (SQLException e) { 
			//DB에 try catch를 쓰는 이유? db에는 에러가 많이 난다. 그래서 에러가 어디서 났는지 확인해줘야하기 떄문에!
			e.printStackTrace();
		}	finally {
			close(); //열었던 리소스를 닫아준다.
		}
		return students;
	}
	
	
}
