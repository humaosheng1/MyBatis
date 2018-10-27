package maosheng.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import maosheng.dao.UserDao;
import maosheng.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public List<User> getUser() {
		
		List<User> user = dao.getUser();
		
		return user;
	}
	
	public void saveUser(User user) {
		dao.saveUser(user);
	}
	
	public void deleteUser(String id) {
		dao.deleteUser(id);
	}
	
	public void updateUser(User user) {
		dao.updateUser(user);
	}
	
}
