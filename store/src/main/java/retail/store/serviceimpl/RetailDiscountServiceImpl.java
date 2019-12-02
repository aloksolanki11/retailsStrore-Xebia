package retail.store.serviceimpl;

import org.springframework.stereotype.Service;

import retail.store.enums.ProductType;
import retail.store.enums.UserType;
import retail.store.model.UserDetails;
import retail.store.service.RetailDiscountService;

@Service
public class RetailDiscountServiceImpl implements RetailDiscountService {

	@Override
	public Double getDiscount(UserDetails userDetails) {
		if(ProductType.GROCERIES.toString().equals(userDetails.getProductType())) {
			return 0d;
		}else {
			if(UserType.EMPLOYEE.toString().equals(userDetails.getUserType())){
				return 30d;
			}else if(UserType.AFFILIATE.toString().equals(userDetails.getUserType())){
				return 10d;
			}else if(userDetails.getCustomerValidYears()!= null && userDetails.getCustomerValidYears()>=2) {
				return 5d;
			}
		}
		return 0d;
	}

	private Double getDiscountOnBillingAmount(Double billingAmount) {
		
		int multiplefactor = (int) (billingAmount/100);
		return new Double(multiplefactor*5);
	}

	@Override
	public Double getNetPaybleAmount(Double billingAmount, Double discount) {
		Double disc = 0d;
		Double netAmt = billingAmount - (billingAmount*discount)/100;
		 if(billingAmount>=100) {
			disc= getDiscountOnBillingAmount(billingAmount);
		}
		 netAmt = netAmt -disc;
		return netAmt;
	}

}
