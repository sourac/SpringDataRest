/**
 * 
 */
package com.atul.learning.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.atul.learning.course.Course;
import com.atul.learning.course.CourseRepository;
import com.atul.learning.review.Review;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

@Component
public class DatabaseLoader implements ApplicationRunner {

	private final CourseRepository courses;

	@Autowired
	public DatabaseLoader(CourseRepository courses) {
		this.courses = courses;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Course course = new Course("Java Basics", "https://github.com/sourac");
		course.addReview(new Review(3, "You're doing good"));
		courses.save(course);

	}

}
