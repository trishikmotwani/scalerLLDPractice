package com.scalerschemadesign.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BatchModule extends BaseModel {

	@ManyToOne
	private Batch batch;
	
	@ManyToOne
	private Module module;
	
	private Date batchStartDateTime;
	
	
	@OneToMany(mappedBy = "batchModule")
	private List<BatchModuleExam> bmeList;
}
