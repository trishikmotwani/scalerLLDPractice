package com.scalerschemadesign.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Batch extends BaseModel {

	private String name;
	
	@ManyToMany
	private List<Student> students;
	
	@ManyToOne
	private Student batchRepresentative;
	
}
