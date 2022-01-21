package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;
// DAO Interface
// Uset에 대한 DB Opeation을 할 때 구현해야 할 기능을 선언
//  나중에  oracle  or  mysql에 맞게  각 각 구현하면 된다  
// insert delete update 기능 선언  
public interface UserinfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	
	void updateUserInfo(UserInfo userInfo);
	
	void deleteUserInfo(UserInfo userInfo);
	

}
