public class SingleObj {

    private static SingleObj instance = new SingleObj();

    private SingleObj(){}

    public static SingleObj getInstance(){
        return instance;
    }

//    public void getName(String Name){
//        System.out.println(Name);
//    }

    public void showMessage(){
        System.out.println("Singleton-pattern");
    }
}
