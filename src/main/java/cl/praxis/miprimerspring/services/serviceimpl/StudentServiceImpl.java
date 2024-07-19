package cl.praxis.miprimerspring.services.serviceimpl;

import cl.praxis.miprimerspring.entity.Student;
import cl.praxis.miprimerspring.repositories.IStudentRepository;
import cl.praxis.miprimerspring.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentServiceImpl")
public class StudentServiceImpl implements IStudentService {

@Autowired
private IStudentRepository studentRepository;
    @Override
    public Student getStudent(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
}
