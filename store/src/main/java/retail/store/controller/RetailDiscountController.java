package retail.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import retail.store.model.UserDetails;
import retail.store.service.RetailDiscountService;

@RestController
@RequestMapping("/api/v1/retail")
public class RetailDiscountController {

	@Autowired
	RetailDiscountService retailDiscountService;
	
	@PostMapping("/getDiscount")
	public Double getDiscount(@RequestBody UserDetails userDetails) {
	
		Double discount = retailDiscountService.getDiscount(userDetails);
		return retailDiscountService.getNetPaybleAmount(userDetails.getBillingAmount(),discount);
	}
}
