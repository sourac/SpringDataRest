/**
 * 
 */
package com.atul.learning.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
@RepositoryRestResource(exported = false)
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserName(String username);

}
