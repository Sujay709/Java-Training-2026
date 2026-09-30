public class Parent {
    public Parent(String firstName){
        this.firstName = firstName;
    }
    String firstName;
    String lastName;
    String eyeColor;
    public void getlastName() {
            System.out.println(lastName);
    }

}


class Child extends Parent {
    String firstName;
    public Child(String firstName) {
        super(firstName);
    }
}
