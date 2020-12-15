package com.example.mvpdemo;

/**
 * author:hequnyu
 * Description:
 * Date:2020/7/14
 */
public interface MVPView {

    /**
     * 增加数量
     */
    void addNum(String str);

    /**
     * 减少数量
     */
    void lessNum(String str);

    void show(String string);

}
