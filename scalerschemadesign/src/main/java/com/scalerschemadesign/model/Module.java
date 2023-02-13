package com.scalerschemadesign.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Module extends BaseModel {

	private String name;
}
