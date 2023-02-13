package com.scalerschemadesign.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Exam extends BaseModel {
	private String name;
	private int durationMinutes;
	
	@OneToMany(mappedBy = "exam")
	private List<BatchModuleExam> bmeList;
}
