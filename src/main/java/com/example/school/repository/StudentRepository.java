// Write your code here
import java.util.List;

public interface StudentRepository {
    List<Student> getAllStudents();
    Student getStudentById(int studentId);
    Student createStudent(Student student);
    List<Student> createStudents(List<Student> students);
    Student updateStudent(int studentId, Student student);
    void deleteStudent(int studentId);
}
