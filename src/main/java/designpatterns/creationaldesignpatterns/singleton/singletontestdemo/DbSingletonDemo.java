package designpatterns.creationaldesignpatterns.singleton.singletontestdemo;

public class DbSingletonDemo {

    public static void main(String[] args) {

        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

    }

}
