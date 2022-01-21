package ch13.domain.userinfo.dao.oracle;
import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserinfoDao;
public class UserInfoOracleDao implements UserinfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Insert into Oracle DB"+userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Update into Oracle DB"+userInfo.getUserId());		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Delete from Oracle DB"+ userInfo.getPassword());
		
	} 

}
