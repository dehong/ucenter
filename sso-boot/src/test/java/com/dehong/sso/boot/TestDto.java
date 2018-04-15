package com.dehong.sso.boot;

/**
 * Created by dehong on 2018-03-26.
 */
public class TestDto
{
    @TransformField("name")
    private String name1;

    private Integer age;

    private String add;

    public String getName1()
    {
        return name1;
    }

    public void setName1(String name1)
    {
        this.name1 = name1;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String getAdd()
    {
        return add;
    }

    public void setAdd(String add)
    {
        this.add = add;
    }

    @Override
    public String toString()
    {
        return "TestDto{" +
                "name1='" + name1 + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }
}
