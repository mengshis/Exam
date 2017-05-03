package com.examsystem.dao;

import java.util.List;

import com.examsystem.po.Student;

public interface StudentDAO {
	public Student findByStudentID(String studentID);//��ѯ����������ѧ��ID��ѯ
	public void updateStudent(Student student);//����ѧ����Ϣ
	public List<Student> findByStudentName(String studentName);//����ѧ����������ѧ��
	public List<Student> findByStudentClass(String sclass);//���ݰ༶����ѧ��
}