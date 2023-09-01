package com.foodreview.foodreviewapp.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name= "reviews")
public class Reviewmodel
{
	@Id
	@Column(name = "ID")
    private String id;
    
	@Column(name = "PRODUCTID")
    private String productId;
    
	@Column(name = "USERID")
    private String userId;
    
	@Column(name = "PROFILENAME")
    private String profileName;
    
	@Column(name = "HELPFULNESSNUMERATOR")
    private String helpfulnessNumerator;
    
	@Column(name = "HELPFULNESSDENOMINATOR")
    private String helpfulnessDenominator;
    
	@Column(name = "SCORE")
    private String score;
    
	@Column(name = "TIME")
    private String time;
    
	@Column(name = "SUMMARY")
    private String summary;
    
	@Column(name = "TEXT")
	private String text;
}