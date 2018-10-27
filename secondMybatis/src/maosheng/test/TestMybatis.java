package maosheng.test;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import maosheng.entity.User;
import maosheng.service.UserService;

public class TestMybatis {

	static ApplicationContext ioc = new ClassPathXmlApplicationContext("Spring-mybatis.xml");
	static UserService bean = ioc.getBean(UserService.class);
	public static void main(String[] args) {
		
		
		testGetUser();
		testUpdate();
		testSave();
		testDelete();
	}
	
	
	public static void testGetUser() {
		
		List<User> user = bean.getUser();
		
		for (User user2 : user) {
			System.out.println(user2);
		}
	} 
	
	public static void testUpdate() {
		User user = new User();
		user.setId(1);
		user.setUser_name("妲己");
		user.setAge(25);
		bean.updateUser(user);
	}
	
	public static void testSave() {
		User user = new User();
		user.setUser_name("王昭君");
		user.setAge(24);
		bean.saveUser(user);
	}
	
	public static void testDelete() {
		bean.deleteUser("1");
	}
}
