package com.scalerschemadesign.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BatchModuleExam extends BaseModel {

	@ManyToOne
	private BatchModule batchModule;
	
	@ManyToOne
	private Exam exam;
}
