/**
 * 
 */
package com.atul.learning.course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.atul.learning.core.BaseEntity;
import com.atul.learning.review.Review;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

@Entity
public class Course extends BaseEntity {

	private String title;
	private String url;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Review> reviews;

	public List<Review> getReviews() {
		return reviews;
	}
	
	public void addReview(Review review) {
		review.setCourse(this);
		reviews.add(review);
	}

	public Course() {
		super();
		reviews = new ArrayList<Review>();
	}

	public Course(String title, String url) {
		this();
		this.title = title;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
