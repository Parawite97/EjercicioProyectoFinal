package es.eoi.jdbc.service;

import es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public Student findById(String id){

        return null;
    }
    public List<Student> findAll(){

        return null;
    }
    public Student create(Student student){

        return student;
    }
    public boolean delete(String id){

        return false;
    }
    public Student update(Student student){

        return student;
    }
}
