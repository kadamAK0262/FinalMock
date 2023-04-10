package com.revature.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="qc_demo")
public class QcModel {
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String gender;
	@Column
	private String mail;
	
	
	

}
