package com.foodreview.foodreviewapp.service;

import java.util.Map;
import com.foodreview.foodreviewapp.models.Reviewmodel;

public interface ReviewServiceInterface
{
	Reviewmodel getReview(String id);
	Map<String, Object> getReviews(String productId, String score, int page, int size);
}