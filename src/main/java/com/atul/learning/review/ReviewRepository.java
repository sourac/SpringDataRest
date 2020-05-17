/**
 * 
 */
package com.atul.learning.review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {

}
