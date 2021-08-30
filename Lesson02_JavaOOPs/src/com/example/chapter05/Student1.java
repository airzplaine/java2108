package com.example.chapter05;

public class Student1 {
	// member property
	// 앞에 private 붙이면 이 클래스 이외 다른곳에서 쓸 수 없다
	// 접근 한정자를 private로 설정하여 외부에서 클래스의 속성값, 메서드를 접근하지 못하도록
	// 설정하는 것을 정보 은닉(information hiding)이라고 한다.
	
	private int studentID; // 학번
	private String studentName; // 이름
	private int grade; //학년
	private String address; // 주소
	
	public Student1() { // default constructor | 자바 컴파일러가 자동 제공하는 기본 생성자
		// 굳이 써서 나타냄
	}
	
	public Student1(int studentID, String studentName, int grade, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

		// member function(method) 멤버 펑션(메서드)
		// 한정자 - 리턴타입 - 메서드이름(패러미터){	}
		// public - 한정자. 누구나 접근가능하구나
		// void - 리턴타입이 딱히 없다
		// showStudentInfo() { - 메서드 이름
		public void showStudentInfo( ) {
			System.out.println(studentName + ", " + address);
		}// showStudentInfo

}// class
