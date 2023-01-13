package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
    @Query(value = "select email from tb_m_employee where email = ?1", nativeQuery = true)
    public String getEmail(String email);

    @Query(value = "select password from tb_m_user where id = ?1", nativeQuery = true)
    public String getPassword(Integer id);

}
