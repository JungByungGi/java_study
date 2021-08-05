package chapter7.domain.userinfo.dao.mysql;

import chapter7.domain.userinfo.UserInfo;
import chapter7.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into mysql db user id = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into mysql db user id = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from mysql db user id = " + userInfo.getUserId());
    }
}
