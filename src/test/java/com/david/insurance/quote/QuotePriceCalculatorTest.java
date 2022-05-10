package com.david.insurance.quote;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.david.insurance.model.BusinessType;

public class QuotePriceCalculatorTest {
	
	QuotePriceCalculator instance;
	
	@BeforeEach
	void setup() {
		instance = new QuotePriceCalculator();
	}
	
	@Test
	void getQuoteAmountByBusinessType() {
		assertEquals(new BigDecimal(2000), instance.getQuoteAmountByBusinessType(BusinessType.PROFESSIONAL));
	}

}
