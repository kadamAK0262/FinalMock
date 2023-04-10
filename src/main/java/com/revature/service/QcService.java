package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.QcModel;
import com.revature.repo.QcRepo;

@Service
public class QcService {
	
	@Autowired
	private QcRepo repo;
	
	public List<QcModel> getdetails() {
		
		return repo.findAll();
	}
	
	public QcModel getbyid(int id) {
		return repo.findById(id).get();
	}
	
	
	public QcModel update(QcModel model, int id) {
		QcModel qc = repo.findById(id).get();
		
		qc.setId(model.getId());
		qc.setName(model.getName());
		qc.setMail(model.getMail());
		qc.setGender(model.getGender());
		
		return repo.saveAndFlush(qc);
		
	}
	
	public QcModel add(QcModel model) {
		return repo.save(model);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	

}
