package ee.ivkhk.api.students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path="list")
    public List<Student> list() {return studentService.list();}

    @GetMapping(path="item")
    public void add(@RequestBody Student student) {
      studentService.add(student);
    }
}
