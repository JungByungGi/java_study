package chapter7.domain.userinfo.dao.oracle;

import chapter7.domain.userinfo.UserInfo;
import chapter7.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into oracle db user id = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into oracle db user id = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from oracle db user id = " + userInfo.getUserId());
    }
}
