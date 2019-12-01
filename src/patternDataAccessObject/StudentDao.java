package patternDataAccessObject;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int id);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}