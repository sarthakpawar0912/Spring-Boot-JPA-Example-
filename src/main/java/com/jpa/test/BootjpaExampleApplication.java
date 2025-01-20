package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class BootjpaExampleApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(BootjpaExampleApplication.class, args);

	context.getBean(UserRepository.class);

	UserRepository userRepository= context.getBean(UserRepository.class);

		User user=new User();
		user.setName("Sarthak Pawar");
		user.setCity("PCMC");
		user.setStatus("I am just A programmer");

		User user1 = userRepository.save(user);
		System.out.println(user1);
	//	craete object of user
		User user3=new User();
		user.setName("Sarthak Pawar");
		user.setCity("Pune");
		user.setStatus("I am just A programmer");
		System.out.println(user);

		User user2=new User();
		user2.setName("Niranjan Pawar");
		user2.setCity("SOlapur");
		user2.setStatus("I am just A dd");
		System.out.println(user2);
		List<User> users=List.of(user2);
		User user4 = (User) userRepository.saveAll(users);
	}

}
