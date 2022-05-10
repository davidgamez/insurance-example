package com.david.insurance.policy;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.insurance.model.Policy;
import com.david.insurance.security.RequestService;

@Service
public class PolicyService {

	private Random rand = new Random();
	
	@Autowired
	RequestService requestService;
	
	public Policy create(Policy policy) {
		policy.setUsername(requestService.getAuthenticatedUser().getName());
		policy.setId(getIdentifier());
		policy.setAutorenew(true);
		return policy;
	}

	public Policy cancel(Integer policyId) {
		var policy = loadPolicyById(policyId);
		policy.setAutorenew(false);
		return policy;
	}


	/**
	 * This method mocks a DAO access to load a policy
	 * @param policyId
	 * @return
	 */
	private Policy loadPolicyById(Integer policyId) {
		return new Policy();
	}

	/**
	 * This method is used to mock identifiers not for production use
	 * @return random integer
	 */
	private synchronized Integer getIdentifier() {
		return rand.nextInt();
	}
}
