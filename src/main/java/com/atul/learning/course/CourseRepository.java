/**
 * 
 */
package com.atul.learning.course;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author Atul Sharma
 *
 * https://github.com/sourac
 */

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{
	
	Page<Course> findByTitle(@Param("title")String title,Pageable page);

}
