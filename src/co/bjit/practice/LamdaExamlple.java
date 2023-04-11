package co.bjit.practice;

@FunctionalInterface
interface A
{
    void show(int n);
}

public class LamdaExamlple {

    public static void main(String args[]){
        A obj =(n)->{
            System.out.println("Show IN "+n);
        };

        obj.show(10);
    }
}
