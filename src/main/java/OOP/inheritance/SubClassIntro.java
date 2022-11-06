package OOP.inheritance;


class Parent{
    public void printParent(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{

public void PrintChild(){
    System.out.println("This is Child class");
}
}




public class SubClassIntro {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.printParent();

        Child child = new Child();
        child.printParent();

        child.PrintChild();



    }
}
