package maosheng.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import maosheng.entity.User;

@Repository
public class UserDao extends BaseDao {

	public List<User> getUser(){
		System.out.println(session());
		String status = "maosheng.mapping.userMapper.getUser";
		List<User> list = session().selectList(status);
		
		return list;
	}
	
	public void saveUser(User user) {
		
		String status = "maosheng.mapping.userMapper.saveUser";
		int result = session().insert(status,user);
		System.out.println(result);
	}
	
	public void updateUser(User user) {
		
		String status = "maosheng.mapping.userMapper.updateUser";
		int result = session().update(status,user);
		System.out.println(result);
	}
	
	public void deleteUser(String id) {
	
		String status = "maosheng.mapping.userMapper.deleteUser";
		int result = session().delete(status,id);
		System.out.println(result);
	}
	
}
