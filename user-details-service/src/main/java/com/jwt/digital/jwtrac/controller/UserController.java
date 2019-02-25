package com.jwt.digital.jwtrac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.digital.jwtrac.model.User;
import com.jwt.digital.jwtrac.repo.UserJPARepository;
import com.jwt.digital.jwtrac.util.UserDetailsUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * @author mukesh kumar
 *
 */
@RestController
@RefreshScope
@Api(tags = "User Details Service")
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserJPARepository userJPARepository;
	
	@ApiOperation(notes = UserDetailsUtil.SERVICE_DESC, value = "Get all User Details", nickname = "all")
	@RequestMapping(value="/all",method= RequestMethod.GET)
	public List<User> findAll() {
		return userJPARepository.findAll();
		
	}
	
	@GetMapping(value = "/{name}")
	public User findByName(@PathVariable final String name) {
		return userJPARepository.findByName(name);
		
	}
	
	@PostMapping(value="/load")
	public User load(@RequestBody final User user) {
		
		userJPARepository.save(user);
		return userJPARepository.findByName(user.getName());
	}
	
	
	

}
