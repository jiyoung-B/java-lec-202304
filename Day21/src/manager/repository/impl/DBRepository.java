package manager.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import manager.entity.Student;
import manager.repository.Repository;

public class DBRepository implements Repository{
	
	private Connection connection = null;
	
	// DBRepository의 객체가 생성될 때 DBConnection 객체를 connection에 넣고 싶다.
	// 생성자
	
	public DBRepository() {
		try {
			this.connection = MariaDBConnect.getConnection();
		}catch(Exception ex) {
			System.out.println("DB 접속에러 : \n" + ex.getLocalizedMessage();)
		}
		
	}
	
	
	
	// -- R
	// -- 검색어가 없음(메서드의 인자가 없음) = 학생 전체를 불러온다
	@Override
	public List<Student> selectAllStudents() throws SQLException {
		String sql = "SELECT * FROM student ORDER BY std_no asc";
		PreparedStatement pstmt = connection.preparStatement(sql);
		// -- 쿼리를 DB에 날린다.
		 ResultSet result = pstmt.executeQuery();
		 List<Student> resultList = new ArrayList()<Student>();
		 
		 
		 while(result.next()) {
			 resultList.add(
				 new Student(
					 result.getInt("std_no"),
					 result.getString("name"),
					 result.getString("grade"),
					 result.getInt("score"),
					 result.getString("insert_dt"),
					 result.getString("update_dt")
				 )
			 );
		 }
		
		return resultList;
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectSearchedStudents(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int rowCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
