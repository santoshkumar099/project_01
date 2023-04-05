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

public class UserStories {
	@Id
	private int Id;
	private String  Title;
	private String UserStoryDetails;
	private String AcceptanceCriteria;
	private String Priority;
	private Date CreatedOn;
	private Date DoneOn;
	private String AssignedToDeveloperId;
	private int StoryPoints;
	private String Status;
	private int EpicId;

}
