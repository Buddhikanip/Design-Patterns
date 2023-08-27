public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal constructor
        //Compile Time Error: The constructor SingleObject() is not visible
//        SingleObject object = SingleObject();

        //Get the only object = available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
