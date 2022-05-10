package com.david.insurance.quote;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.david.insurance.model.BusinessType;

/**
 * Bean to compute prices by strategy
 * @author davidgamez
 *
 */
@Component
public class QuotePriceCalculator {

	private static final Map<BusinessType, BigDecimal> priceMap = new HashMap<>();
	private static final BigDecimal DEFAULT;
	
	static {
		priceMap.put(BusinessType.PROFESSIONAL,  new BigDecimal(2000));
		priceMap.put(BusinessType.TRADE,  new BigDecimal(1500));
		DEFAULT = priceMap.get(BusinessType.TRADE);
	}
	
	public BigDecimal getQuoteAmountByBusinessType(BusinessType businessType) {
		return priceMap.getOrDefault(businessType, DEFAULT); 
	}
}
