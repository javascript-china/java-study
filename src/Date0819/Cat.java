package Date0819;

public class Cat extends Animal {
    public String name;
    public String[] arr1 = new String[10];
    public final String[] arr = arr1;


    public Cat(String name) {
        super("猫:" + name);
    }

    public String getName() {

        return super.getName();
    }

    public String getName(int x) {

        return "动物";
    }

    public void eat() {

        System.out.println(getName() + "喵喵叫");
    }

    public void catchMice() {
        System.out.println("猫会捉耗子");
    }
}
