package com.devsuperior.userdapt.endities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="tb_departament")
public class Departaments {
		
	private Long id;
	private String name;
	
	
	public Departaments() {

	}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
