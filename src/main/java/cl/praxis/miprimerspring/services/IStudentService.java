package cl.praxis.miprimerspring.services;

import cl.praxis.miprimerspring.entity.Student;

import java.util.List;

public interface IStudentService {
    Student getStudent(Long id);
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
