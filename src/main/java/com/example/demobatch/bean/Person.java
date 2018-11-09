package com.example.demobatch.bean;

/**
 * TODO 描述:
 *
 * @author zhiqiang.wang@marketin.cn
 * @create 2018-11-09 下午4:09
 * @since dev-1.9.2
 */
public class Person {

    private String lastName;

    private String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
