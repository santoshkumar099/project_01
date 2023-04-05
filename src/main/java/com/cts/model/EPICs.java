package com.cts.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EPICs {
	@Id
	private int Id;
	private int ProjectCode;
	private int SprintId;
	private String Name;
	private Date CreatedOn;
	private Date CompletedOn;
	private String Status;
	
	
}
