package com.delazeri.music.reviews.controllers;

import com.delazeri.music.reviews.dtos.ReviewDTO;
import com.delazeri.music.reviews.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/reviews")
public class ReviewController {

    @Autowired
    ReviewService service;

    @PostMapping
    public ResponseEntity<ReviewDTO> postReview(@RequestBody ReviewDTO review, @RequestHeader(value = "Authorization") String token) {
        return ResponseEntity.ok().body(service.postReview(review, token));
    }
}