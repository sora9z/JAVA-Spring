package ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserinfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		// fil type을 읽어서 oracle, mysql구분 
		
		FileInputStream fis=new FileInputStream("db.properties");
		
		Properties prop=new Properties(); // key : value로 되어있는 객체
		
		prop.load(fis);  //exception이 나오면 throws . IOException으로 바뀔  것임
		
		String dbType=prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUsetId("12345");
		userInfo.setPassword("#$%#^");
		userInfo.setUserName("Kang");
		
		UserinfoDao userInfoDao=null; // interface  
		// 변수 선언을 interface로 하고  
		
		
		//DB에 따라 생성하면 된다. 
		if(dbType.equals("ORACLE"))
			userInfoDao=new UserInfoOracleDao();
		
		else if(dbType.equals("MYSQL")){
			userInfoDao=new UserInfoMysqlDao();
		}
		else {
			System.out.println("db error");
			return;
			
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		

	}

}
