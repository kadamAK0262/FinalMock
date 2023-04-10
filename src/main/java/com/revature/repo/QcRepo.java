package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.QcModel;

@Repository
public interface QcRepo extends JpaRepository<QcModel, Integer>{

}
