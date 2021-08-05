package chapter7.web.userinfo;

import chapter7.domain.userinfo.UserInfo;
import chapter7.domain.userinfo.dao.UserInfoDao;
import chapter7.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import chapter7.domain.userinfo.dao.oracle.UserInfoOracleDao;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("정병기");
        UserInfoDao userInfoDao = null;
        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else{
            System.out.println("db error");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
    }

}
