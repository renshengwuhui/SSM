package ssmtest.ssmtest1.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssmtest.ssmtest1.bo.User;
import ssmtest.ssmtest1.dao.IUserDao;
import ssmtest.ssmtest1.dao.util.SqlSessionFactoryUtil;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		//SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession(true);
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			IUserDao userDao=session.getMapper(IUserDao.class);
			return userDao.selectByPrimaryKey(id);
		} finally{
			session.close();
		}
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
