package io.github.younghwang.hfdesignpattern.proxy.dynamic;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        PersonBeanImpl personBean = new PersonBeanImpl();
        PersonBean ownerProxy = matchMakingTestDrive.getOwnerProxy(personBean);
    }

    PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }
}
