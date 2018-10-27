package maosheng.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDao {

	@Autowired
	private SqlSessionFactory factory;
	
	public SqlSession session() {
		
		SqlSession session = factory.openSession();
		
		return session;
	}
	
}
