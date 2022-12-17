package com.jdbcdemo.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbcdemo.dbconnect.DatabaseConnection;
import com.jdbcdemo.model.Student;
import com.jdbcdemo.service.StudentService;

public class StudentServiceImpl implements StudentService {


	@Override
	public int addStudent(Student student) {

		int flag = 0;
		try {
			Connection con = DatabaseConnection.getDbConnection();
			String sql = "INSERT INTO student(fname,mname,lname,gender,address,phoneno,rollno,dob)VALUES (?,?,?,?,?,?,?,?)";

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, student.getfName());
			pstm.setString(2, student.getmName());
			pstm.setString(3, student.getlName());
			pstm.setString(4, student.getGender());
			pstm.setString(5, student.getAddress());
			pstm.setString(6, student.getPhoneNo());
			pstm.setInt(7, student.getRollNo());
			pstm.setString(8, student.getDob());

			if (pstm.executeUpdate() > 0) {
				flag = 1;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public int updateStudent(Student student) {
		int flag = 0;

		try {
			Connection con = DatabaseConnection.getDbConnection();

			String sql = "update student set fname=?,mname=?,lname=?,gender=?,address=?,phoneno=?,rollno=?,dob=? where sid=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, student.getfName());
			pstm.setString(2, student.getmName());
			pstm.setString(3, student.getlName());
			pstm.setString(4, student.getGender());
			pstm.setString(5, student.getAddress());
			pstm.setString(6, student.getPhoneNo());
			pstm.setInt(7, student.getRollNo());
			pstm.setString(8, student.getDob());
			pstm.setInt(9, student.getSid());

			if (pstm.executeUpdate() > 0) {
				flag = 1;
			}
	
		} catch (Exception e) {

		}

		return flag;
	}

	@Override
	public List<Student> getStudents() {

		List<Student> sList = new ArrayList<Student>();
		try {

			Connection con = DatabaseConnection.getDbConnection();
			Statement statement = con.createStatement();
			String sql = "select * from student";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {

				Student student = new Student();
				student.setSid(rs.getInt("sid"));
				student.setfName(rs.getString("fname"));
				student.setmName(rs.getString("mname"));
				student.setlName(rs.getString("lname"));
				student.setAddress(rs.getString("address"));
				student.setDob(rs.getString("dob"));
				student.setGender(rs.getString("gender"));
				student.setPhoneNo(rs.getString("phoneno"));
				student.setRollNo(rs.getInt("rollno"));
				sList.add(student);
			}

		} catch (Exception e) {

		}

		return sList;
	}

	@Override
	public Student getStudent(int sid) {

		Student student = new Student();
		try {
			Connection con = DatabaseConnection.getDbConnection();

			String sql = "select * from student where sid=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, sid);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				student.setSid(rs.getInt("sid"));
				student.setfName(rs.getString("fname"));
				student.setmName(rs.getString("mname"));
				student.setlName(rs.getString("lname"));
				student.setAddress(rs.getString("address"));
				student.setDob(rs.getString("dob"));
				student.setGender(rs.getString("gender"));
				student.setPhoneNo(rs.getString("phoneno"));
				student.setRollNo(rs.getInt("rollno"));
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return student;

	}

	@Override
	public String deleteStudent(int sid) {
		String flag = null;

		try {
			Connection con = DatabaseConnection.getDbConnection();
			String sql = "delete from student where sid=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, sid);
			if (pstm.executeUpdate() > 0) {
				flag = "Student " + sid + " deleted successfully!";
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return flag;

	}

}
