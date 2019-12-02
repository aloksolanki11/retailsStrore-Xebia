package retail.store.service;

import org.springframework.stereotype.Component;

import retail.store.model.UserDetails;

@Component
public interface RetailDiscountService {
	
	public Double getDiscount(UserDetails userDdetails);

	public Double getNetPaybleAmount(Double billingAmount, Double discount);
}
