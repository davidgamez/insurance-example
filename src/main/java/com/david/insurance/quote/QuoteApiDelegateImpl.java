package com.david.insurance.quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.david.insurance.handler.QuoteApiDelegate;
import com.david.insurance.model.Quote;

public class QuoteApiDelegateImpl implements QuoteApiDelegate {

	@Autowired
	QuoteService quoteService;
	
	@Override
	public ResponseEntity<Quote> quotePost(Quote quote) {
		return ResponseEntity.ok(quoteService.create(quote));
	}
	

}
