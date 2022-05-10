package com.david.insurance.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.david.insurance.handler.PolicyApiDelegate;
import com.david.insurance.model.Policy;

public class PolicyApiDelegateImpl implements PolicyApiDelegate {

	@Autowired
	PolicyService policyService;
	
	@Override
	public ResponseEntity<Policy> policyPost(Policy policy) {
		return ResponseEntity.ok(policyService.create(policy));

	}

	@Override
    public ResponseEntity<Policy> policyPolicyIdEndDatePatch(Integer policyId) {
		return ResponseEntity.ok(policyService.cancel(policyId));

    }
}
