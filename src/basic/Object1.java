package basic;

/**
 * 面向对象的理解
 * 定义一个类，赋予相应的属性和方法，新建个对象，通过对象来调用方法
 * 就像人类，有不同的名字、年龄、身高、心情，每个个体人类都可以理解为一个对象
 * 每个对象都可以调用不同方法，像吃饭之类的
 */
public class Object1 {
    String name;
    int age;
    int height;
    String mood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void set(String name,int age,int height,String mood){
        this.name = name;
        this.age = age;
        this.height = height;
        this.mood = mood;
    }

    public String toString(){
        return "name: "+name+" age: "+age+" height: "+height+" mood: "+mood;
    }

    public String eat(){
        return "你吃了三碗！";
    }

    public static void main(String args[]){
        Object1 share = new Object1();
        share.set("share",18,180,"happy");
        System.out.println(share.toString());
        System.out.println(share.eat());
        System.out.println(share.getName());
    }
}
