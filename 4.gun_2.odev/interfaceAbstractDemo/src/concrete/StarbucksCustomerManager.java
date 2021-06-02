package concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService{
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)){
			
		}else{
			System.out.println("Not a valid person!");
		}
	}
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return false;
	}
}
 