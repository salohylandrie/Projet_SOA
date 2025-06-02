package com.salohycoding.hrmi.repository;

import com.salohycoding.hrmi.model.LifeInsBeneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LifeInsBeneficiaryRepository extends JpaRepository<LifeInsBeneficiary, Long> {

//    LifeInsBeneficiary findByEmployee(AddEmployeeRequest request);

    Long countByEmployeeCode(String employeeCode);

    List<LifeInsBeneficiary> findByEmployeeId(Long id);

    LifeInsBeneficiary findByEmployeeCode(String employeeCode);
}
