package blog.brianthomas.immutables;

import java.util.Arrays;
import java.util.Date;

import blog.brianthomas.pojo.PojoAddress;
import blog.brianthomas.pojo.PojoPerson;

public class Main {
    public static void main(String... args) throws InstantiationException, IllegalAccessException {
    	Address address = ImmutableAddress.builder()
    			.number(123)
    			.street("Dogwood St.")
    			.city("Beverly Hills")
    			.state("CA")
    			.zip("90210").build();
    	Person immutablesPerson = ImmutablePerson.builder()
    			.name("Brian Thomas")
    			.addPhoneNumbers("123-456-7890")
    			.birthdate(new Date(2001, 10, 01))
    			.address(address)
    			.build();
    	
    	PojoPerson pojoPerson = new PojoPerson();
    	pojoPerson.setName("Brian Thomas");
    	pojoPerson.setPhoneNumbers(Arrays.asList("123-456-7890"));
    	pojoPerson.setBirthdate(new Date(2001, 10, 01));
    	PojoAddress pojoAddress = new PojoAddress();
    	pojoAddress.setNumber(123);
    	pojoAddress.setStreet("Dogwood St.");
    	pojoAddress.setCity("Beverly Hills");
    	pojoAddress.setState("CA");
    	pojoAddress.setZip("90210");
		pojoPerson.setAddress(pojoAddress);
		
		System.out.println(immutablesPerson);
		System.out.println(pojoPerson);
    }
    
    
}
