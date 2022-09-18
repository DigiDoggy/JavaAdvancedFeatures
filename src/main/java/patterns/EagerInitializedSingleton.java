package patterns;

public class EagerInitializedSingleton {

    //Creting a field that represents an instance on this class.
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //Creating private constructor to avoid calling in outside the class definition
    private EagerInitializedSingleton(){
    }

    //Creating a method to get a class instance
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
