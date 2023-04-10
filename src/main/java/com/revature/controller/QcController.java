package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.QcModel;
import com.revature.service.QcService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QcController {
	
	@Autowired
	private QcService serve;
	
	@GetMapping("/getdetails")
	public List<QcModel> getallDetails() {
		return serve.getdetails();
	}
	
	@GetMapping("/getdetails/{id}")
	public QcModel getdetailsByid(@PathVariable int  id) {
		return serve.getbyid(id);
	}
	
	@PutMapping("/updatedetails/{id}")
	public QcModel update(@RequestBody QcModel model, @PathVariable int id ) {
		return serve.update(model, id);
	}
	
	@PostMapping("/adddetails")
	public QcModel adddetails(@RequestBody QcModel model) {
		return serve.add(model);
	
	}
	
	@DeleteMapping("/deletedetails/{id}")
	public void deletedetails( @PathVariable int id ) {
		serve.delete(id);
	}

}
