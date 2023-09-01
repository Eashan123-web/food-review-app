package com.foodreview.foodreviewapp.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name= "reviews")
public class Reviewmodellite
{
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "PRODUCTID")
    private String productId;

    @Column(name = "PROFILENAME")
    private String profileName;

    @Column(name = "SCORE")
    private String score;

    @Column(name = "SUMMARY")
    private String summary;
}