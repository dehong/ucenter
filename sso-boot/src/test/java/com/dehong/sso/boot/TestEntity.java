package com.dehong.sso.boot;

/**
 * Created by dehong on 2018-03-26.
 */
public class TestEntity
{
    private String name;

    private String tel;

    private Integer age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String getTel()
    {
        return tel;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    @Override
    public String toString()
    {
        return "TestEntity{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +
                '}';
    }
}
