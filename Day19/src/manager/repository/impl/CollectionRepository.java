package manager.repository.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import manager.connect.CollectionDBConnect;
import manager.entity.Student;
import manager.repository.Repository;

public class CollectionRepository implements Repository {
	private static List<Student> students;
	private int stdNo = 1;
	public CollectionRepository() {
		this.students = CollectionDBConnect.getConnection();
	}


	@Override
	public List<Student> selectStudents() throws SQLException {
		return this.students;
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {
		// *중요
		// Student student = null;
		// for(Student v : this.students) {
		//	 if(v.getStdNo() == stdNo) {
		//		 student = v;
		//		 break;
		//   }
		// }
		
		List<Student> stdList = students.stream()
				.filter(v -> v.getStdNo() == stdNo)
				.collect(Collectors.toUnmodifiableList());
		return stdList.size() > 0 ? stdList.get(0) : null;
	}

	@Override
	public List<Student> selectStudent(String name) throws Exception {
		List<Student> stdList = students.stream()
				.filter(x -> x.getName().equals(name))
				.collect(Collectors.toUnmodifiableList());
		
		return stdList;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		Student student = students.get(students.size() -1);
		return student;
	}

	@Override
	public boolean registStudent(Student student) throws SQLException {
		student.setStdNo(stdNo ++); // DB가 아니므로 저장 x. 증가시키기
		students.add(student);
		return true;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {
		Student targetStudent = this.selectStudent(stdNo);
		if(targetStudent != null) {
			students.set(stdNo - 1, student);
			return 1;
		}
			
		return 0;
	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		Student targetStudent = this.selectStudent(stdNo);
		if(targetStudent != null) {
			students.remove(stdNo - 1); // 인덱스는 01234~  stdNo는  1234~ => 인덱스는 stdNo - 1
			return true;
		}
		return false;
	}

	@Override
	public void closeRepository() throws Exception {

	}
}
