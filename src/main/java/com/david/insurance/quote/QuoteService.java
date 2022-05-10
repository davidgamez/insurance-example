package com.david.insurance.quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.insurance.model.Quote;
import com.david.insurance.security.RequestService;

@Service
public class QuoteService {

	@Autowired
	QuotePriceCalculator quotePriceCalculator;
	
	@Autowired
	RequestService requestService;
	
	/**
	 * Computes a quote taking in consideration the business type and start date 
	 * @param quote
	 * @return the computed quote
	 */
	public Quote create(Quote quote) {
		quote.endDate(quote.getStartDate().plusYears(1));
		quote.setAmount(quotePriceCalculator.getQuoteAmountByBusinessType(quote.getCategory().getBusinessType()));
		quote.setUsername(requestService.getAuthenticatedUser().getName());
		return quote;
	}
	
}
