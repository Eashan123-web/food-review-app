package com.foodreview.foodreviewapp.api;

import java.util.Map;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.foodreview.foodreviewapp.models.Reviewmodel;
import com.foodreview.foodreviewapp.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/review")
public class Review
{
    @Autowired
	private ReviewService reviewService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> findAll(
		@RequestParam(required = false) String score,
	    @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size,
        @RequestParam(required = false) String productId)
    {
        Map<String, Object> Reviews = reviewService.getReviews(productId, score, page, size);
        return ResponseEntity.ok().body(Reviews);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reviewmodel> findById(@PathVariable(required = true) String id)
    {
        Reviewmodel Review= reviewService.getReview(id);
        if(Review == null)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "review not found");
        }       
        return ResponseEntity.ok().body(Review);
    }
}