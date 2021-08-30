package com.example.chapter05;

public class Student1 {
	// member property
	// �տ� private ���̸� �� Ŭ���� �̿� �ٸ������� �� �� ����
	// ���� �����ڸ� private�� �����Ͽ� �ܺο��� Ŭ������ �Ӽ���, �޼��带 �������� ���ϵ���
	// �����ϴ� ���� ���� ����(information hiding)�̶�� �Ѵ�.
	
	private int studentID; // �й�
	private String studentName; // �̸�
	private int grade; //�г�
	private String address; // �ּ�
	
	public Student1() { // default constructor | �ڹ� �����Ϸ��� �ڵ� �����ϴ� �⺻ ������
		// ���� �Ἥ ��Ÿ��
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

		// member function(method) ��� ���(�޼���)
		// ������ - ����Ÿ�� - �޼����̸�(�з�����){	}
		// public - ������. ������ ���ٰ����ϱ���
		// void - ����Ÿ���� ���� ����
		// showStudentInfo() { - �޼��� �̸�
		public void showStudentInfo( ) {
			System.out.println(studentName + ", " + address);
		}// showStudentInfo

}// class
