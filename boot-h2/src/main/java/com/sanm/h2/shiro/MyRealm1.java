package com.sanm.h2.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/27 15:43
 * Description:
 */
public class MyRealm1 implements Realm {

    @Override
    public String getName() {
        return "myRealm1";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken; //仅支持UsernamePasswordToken类型的Token
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 得到用戶名
        String userName = (String) token.getPrincipal();
        // 得到密碼
        String password = new String((char[]) token.getCredentials());

        if (!"sanm".equals(userName))
            throw new UnknownAccountException();
        if (!"123456".equals(password))
            throw new IncorrectCredentialsException();

        return new SimpleAuthenticationInfo(userName,password,getName());
    }
}