package com.creil.demoCreil.student;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InMemoryStudentService implements StudentService{

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student s) {
        return dao.updateStudent(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}
