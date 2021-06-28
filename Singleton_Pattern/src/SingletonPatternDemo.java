public class SingletonPatternDemo {

    public static void main(String[] args) {

        //without instantiate
        SingleObj object1 = SingleObj.getInstance();

        //*****//
//        SingleObj obj = new SingleObj();
//
//        obj.getName("A type of design pattern called--");
        object1.showMessage();
    }
}
