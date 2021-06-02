package entities;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import concrete.StarbucksCustomerManager;

public class Program {

	public static void main(String[] args, ICustomerCheckService ICustomerCheckService) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(ICustomerCheckService);

		Customer customer1 = new Customer();
		customer1.setDateOfBirth("07.10.2004");
		customer1.setFirstName("Mustafa");
		customer1.setLastName("IÞIK");
		customer1.setId(1);
		customer1.setNationalityId("202258872658");

		customerManager.save(customer1);
	}
}
