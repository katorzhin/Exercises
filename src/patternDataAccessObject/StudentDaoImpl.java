package patternDataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0);
      Student student2 = new Student("John",1);
      students.add(student1);
      students.add(student2);		
   }
   @Override
   public void deleteStudent(Student student) {
      students.remove(student.getId());
      System.out.println("Student: Roll No " + student.getId() + ", deleted from database");
   }


   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getId()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getId() + ", updated in the database");
   }
}