package com.jwt.digital.jwtrac.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jwt.digital.jwtrac.model.User;


/**
 * @author mukesh kumar
 *
 */
@Component
public interface UserJPARepository extends JpaRepository<User, Long> {

	User findByName(String name);

}
