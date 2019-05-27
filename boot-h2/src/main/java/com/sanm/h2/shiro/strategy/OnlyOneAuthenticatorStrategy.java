package com.sanm.h2.shiro.strategy;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.pam.AbstractAuthenticationStrategy;
import org.apache.shiro.realm.Realm;

import java.util.Collection;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/27 15:59
 * Description: 重新认证方式。只有满足一个realm的时候 才能认证通过。
 */
public class OnlyOneAuthenticatorStrategy extends AbstractAuthenticationStrategy {

    // 返回一个权限认证的信息
    @Override
    public AuthenticationInfo beforeAllAttempts(Collection<? extends Realm> realms, AuthenticationToken token) throws AuthenticationException {
        return new SimpleAuthenticationInfo();
    }

    //返回之前合并的
    @Override
    public AuthenticationInfo beforeAttempt(Realm realm, AuthenticationToken token, AuthenticationInfo aggregate) throws AuthenticationException {
        return aggregate;
    }

    @Override
    public AuthenticationInfo afterAttempt(Realm realm, AuthenticationToken token, AuthenticationInfo singleRealmInfo, AuthenticationInfo aggregateInfo, Throwable t) throws AuthenticationException {
        AuthenticationInfo info;
        if (singleRealmInfo == null) {
            info = aggregateInfo;
        } else if (aggregateInfo == null) {
            info = singleRealmInfo;
        } else {
            info = this.merge(singleRealmInfo, aggregateInfo);
            if (info.getPrincipals().getRealmNames().size() > 1) {
                System.out.println(info.getPrincipals().getRealmNames());
                throw new AuthenticationException("Authentication token of type [" + token.getClass() + "] " +
                        "could not be authenticated by any configured realms.  Please ensure that only one realm can " +
                        "authenticate these tokens.");
            }
        }

        return info;
    }

    @Override
    public AuthenticationInfo afterAllAttempts(AuthenticationToken token, AuthenticationInfo aggregate) throws AuthenticationException {
        return aggregate;
    }
}
