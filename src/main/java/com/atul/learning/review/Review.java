/**
 * 
 */
package com.atul.learning.review;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.atul.learning.core.BaseEntity;
import com.atul.learning.course.Course;
import com.atul.learning.user.User;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
@Entity
public class Review extends BaseEntity {
	
	public Review() {
		super();
	}

	private int rating;
	private String description;
	
	
	public Review(int rating, String description) {
		this.rating = rating;
		this.description = description;
	}

	@ManyToOne
	private Course course;
	
	@ManyToOne
	private User reviewer;

	public User getReviewer() {
		return reviewer;
	}

	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
