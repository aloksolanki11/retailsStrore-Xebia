package retail.store.model;

import org.springframework.stereotype.Component;
@Component
public class UserDetails {
	private String userType;
	private String productType;
	private Double customerValidYears;
	private Double billingAmount;
	
	public UserDetails() {
		
	}
	public UserDetails(String userType, String productType, Double customerValidYears, Double billingAmount) {
		super();
		this.userType = userType;
		this.productType = productType;
		this.customerValidYears = customerValidYears;
		this.billingAmount = billingAmount;
	}
	public String getUserType() {
		return userType;
	}
	public String getProductType() {
		return productType;
	}
	public Double getCustomerValidYears() {
		return customerValidYears;
	}
	public Double getBillingAmount() {
		return billingAmount;
	}
	
	
}
