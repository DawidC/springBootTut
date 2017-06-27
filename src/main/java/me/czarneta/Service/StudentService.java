package me.czarneta.Service;

import me.czarneta.Dao.StudentDao;
import me.czarneta.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Dawid on 26.06.2017.
 */
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        //sprawdzanie, czy student istnieje TODO
        return this.studentDao.getStudentById(id);
    }
}
