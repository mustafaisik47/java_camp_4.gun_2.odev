package adaptors;

import abstracts.ICustomerCheckService;
import entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
