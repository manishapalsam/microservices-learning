package com.dailycodebuffer.department_service.repository;

import com.dailycodebuffer.department_service.model.Department;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
   // private List<Department> departments = new ArrayList<>();

//    public Department addDepartments(Department department){
//        departments.add(department);
//        return department;
//    }


//    public Department findById(Long id){
//        return departments.stream()
//                .filter(department ->
//                        department.getId().equals(id))
//                .findFirst()
//                .orElseThrow();
//    }


}
