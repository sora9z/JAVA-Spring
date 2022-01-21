package ch13.domain.userinfo.dao.mysql;
import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserinfoDao;

public class UserInfoMysqlDao implements UserinfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Insert into MYSQL DB userID="+ userInfo.getUserId()); 
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Update into MYSQL DB usetID="+ userInfo.getUserId());
		
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Delete from MYSQL DB"+ userInfo.getUserId());
		
	}
	

}
