package designpatterns.creationaldesignpatterns.singleton.singletontestdemo;

public class DbSingleton {

    //Eagerly loaded instance - A new instance is created on line 7.

  //private static DbSingleton instance = new DbSingleton();
  //private static DbSingleton instance = null;
  //volatileKeyWord - helps the instance remains an instance
    private static volatile DbSingleton instance = null;

    private DbSingleton() {

        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create.");
        }

    }

    public static DbSingleton getInstance() {

        //Lazily loaded instance - Checking if the instance is null or not

        if (instance == null) {
          //synchronizedKeyWord - Checks for memory consistency errors
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }

}
