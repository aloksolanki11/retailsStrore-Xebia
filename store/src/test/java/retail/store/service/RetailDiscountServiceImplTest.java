package retail.store.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import retail.store.model.UserDetails;
import retail.store.serviceimpl.RetailDiscountServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RetailDiscountServiceImplTest {

	@MockBean
	private RetailDiscountServiceImpl retailDiscountService;

	@Test
	public void getDiscount() {
		UserDetails userDetails = getUserDetails();  
		Double discount = retailDiscountService.getDiscount(userDetails);
		Assert.assertNotNull(discount);
		
	}

	private UserDetails getUserDetails() {
		// TODO Auto-generated method stub
		return new UserDetails("EMPLOYEE", null, 2d,300d);
	}

	@Test
	public void getNetPaybleAmount() {
		Double discount =retailDiscountService.getNetPaybleAmount(300d, 0d);
		Assert.assertNotNull(discount);

	}
}
