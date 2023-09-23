package com.itany.mycorejava.Test07_面向对象.抽象类;

/**
 * @author 黄鹏程
 * @date 2023年08月18日14:54
 */
public class Test01 {
}
abstract class Fu{
    String name;
    public Fu(){
    }
    public Fu(String name){
        System.out.println(666);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void show();
}
class son extends Fu{
    public void show(){

    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
class bigson extends Fu{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void show(){

    }
}