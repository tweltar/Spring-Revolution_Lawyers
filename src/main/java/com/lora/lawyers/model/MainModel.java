package com.lora.lawyers.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public class MainModel {
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created", updatable = false)
	@CreatedDate
	private Date dateCreated;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated")
	@LastModifiedDate
	private Date lastUpdated;

}
