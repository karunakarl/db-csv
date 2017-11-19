package org.tesco.database.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tesco.database.model.Employee;

@Repository
public interface DataRepository extends JpaRepository<Employee, Long> {

    
}
