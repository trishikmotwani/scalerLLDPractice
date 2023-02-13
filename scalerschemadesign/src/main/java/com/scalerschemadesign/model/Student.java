package com.scalerschemadesign.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends BaseModel {

	
	private String name;
	private String email;
	
	@ManyToMany(mappedBy = "students")
	private List<Batch> batches;
	
	
	@OneToMany(mappedBy = "batchRepresentative")
	private List<Batch> batchRepresentativeOf;
	
}
