package com.danya.springboot.springboot.dao;

import com.danya.springboot.springboot.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

        Session session = entityManager.unwrap(Session.class);

        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class)
                .getResultList();

        return allEmployees;
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//        Session session = sessionFactory.getCurrentSession();
//        // Проверка на существование такого работника => Update
//        session.saveOrUpdate(employee); // if(employee.getId() == 0) => save; else => update
//    }
//
//    @Override
//    public Employee getEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Employee employee = session.get(Employee.class, id);
//
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Employee> query = session.createQuery("delete from Employee " +
//                "where id = :employeeId");
//
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
//    }
}






