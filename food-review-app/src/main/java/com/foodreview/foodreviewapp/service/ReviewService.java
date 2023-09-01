package com.foodreview.foodreviewapp.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.foodreview.foodreviewapp.models.*;
import com.foodreview.foodreviewapp.repository.*;

@Service
@Transactional
public class ReviewService implements ReviewServiceInterface
{
	@Autowired
	private Reviewliterepository reviewRepositoryLite;

	@Autowired
	private Reviewrepository reviewRepository;

	@Override
	public Map<String, Object> getReviews(String productId, String score, int page, int size)
	{
		Pageable paging = PageRequest.of(page, size);
		Reviewmodellite exampleReview = new Reviewmodellite();
		exampleReview.setScore(score);
		exampleReview.setProductId(productId);
		Page<Reviewmodellite> reviewsPage = reviewRepositoryLite.findAll(Example.of(exampleReview), paging);
		List<Reviewmodellite> reviews = reviewsPage.getContent();
		reviews = reviewsPage.getContent();
	    Map<String, Object> response = new HashMap<>();
	    response.put("reviews", reviews);
	    response.put("currentPage", reviewsPage.getNumber());
	    response.put("totalItems", reviewsPage.getTotalElements());
	    response.put("totalPages", reviewsPage.getTotalPages());
		return response;
	}

	@Override
	public Reviewmodel getReview(String id)
	{
		return reviewRepository.findById(id);
	}
}