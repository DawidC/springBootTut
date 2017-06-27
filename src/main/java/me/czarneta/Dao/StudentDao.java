package me.czarneta.Dao;

import me.czarneta.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentDao {


    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Kowalski", "Computer Science"));
                put(2, new Student(2, "Czarneta", "Computer Science"));
                put(3, new Student(3, "Zajusz", "Computer Science"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }
}
