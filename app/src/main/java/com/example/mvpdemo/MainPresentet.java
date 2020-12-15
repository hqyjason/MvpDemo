package com.example.mvpdemo;

/**
 * author:hequnyu
 * Description:
 * Date:2020/7/14
 */
public class MainPresentet implements Presenter{
    PeopleBean peopleBean = new PeopleBean("hequnyu",0);

    private MVPView view;

    public MainPresentet(MVPView view) {
        this.view = view;
    }

    @Override
    public void addNum() {
        peopleBean.setNum(peopleBean.getNum() + 1);
        view.addNum(peopleBean.toString());
    }

    @Override
    public void lessNum() {
        peopleBean.setNum(peopleBean.getNum() - 1);
        view.lessNum(peopleBean.toString());
    }

    @Override
    public void show() {
        view.show(peopleBean.toString());
    }
}
