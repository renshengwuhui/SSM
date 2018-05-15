package ssmtest.ssmtest1.service;

import ssmtest.ssmtest1.bo.User;

public interface IUserService {
	 int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
