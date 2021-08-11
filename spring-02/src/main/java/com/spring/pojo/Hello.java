package com.spring.pojo;

/**
 * @author: 小强
 * @date: 2021/8/11 0011
 * @tool: IntelliJ IDEA
 * @in a word: Be more professional every day!
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
