package ee.ivkhk.api.students;

import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> list(){
        return studentRepository.findAll();
    }
    public void add(Student student){
        studentRepository.save(student);
    }
}
