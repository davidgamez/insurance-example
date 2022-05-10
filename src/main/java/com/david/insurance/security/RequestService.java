package com.david.insurance.security;

import org.springframework.stereotype.Service;

import com.david.insurance.security.User.UserType;

/**
 * This class gets the user information from the session
 * Not implemented this will always return the same mock user
 * @author davidgamez
 *
 */
@Service
public class RequestService {

	public User getAuthenticatedUser() {
		var user = new User();
		user.setName("david");
		user.setUserType(UserType.USER);
		return user;
	}
}
