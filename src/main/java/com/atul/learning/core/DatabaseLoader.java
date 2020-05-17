/**
 * 
 */
package com.atul.learning.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
		
		String [] templates= {
				"Up and Running with %s",
				"%s basics",
				"%s for beginners",
				"%s for neckbeards",
				"under the hood : %s"
		};
		
		String [] buzzwords= {
				"Spring Data Rest",
				"Java 14",
				"Scala",
				"Groovy",
				"Hibernate",
				"Kotlin"
		};
		
		
		List<Course> bunchOfCourses=new ArrayList<Course>();
		IntStream.range(0, 100).
		forEach(i-> {
			String template=templates[i % templates.length];
			String buzzword=buzzwords[i % buzzwords.length];
			String title=String.format(template, buzzwords);
			Course c=new Course(title, "https://www.example.com");
			c.addReview(new Review(i%5, String.format("More %s please", buzzword)));
			bunchOfCourses.add(c);
		});
		
		courses.saveAll(bunchOfCourses);
		courses.save(course);
		

	}

}
