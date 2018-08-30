package com.nbt.erp.orm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WorkOrder {

	@Id
	@GeneratedValue
	private Long id;
	
	
	
}
