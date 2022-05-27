package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

    private java.sql.Connection openConnection(){

        return null;
    }
    @Override
    public Student findById(String id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student create(Student id) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Student update(Student id) {
        return null;
    }
}
