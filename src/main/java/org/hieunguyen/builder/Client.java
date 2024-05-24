package org.hieunguyen.builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTO userWebDTO = createUserWebDTO(user);
		System.out.println("userWebDTO = " + userWebDTO);

	}

	public static UserDTO createUserWebDTO(User user) {
		UserWebDTOBuilder builder = new UserWebDTOBuilder();
		builder.withAddress(user.getAddress());
		builder.withFirstName(user.getFirstName());
		builder.withLastName(user.getLastName());
		builder.withBirthday(user.getBirthday());
		builder.build();
		return builder.getUserDTO();

	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
