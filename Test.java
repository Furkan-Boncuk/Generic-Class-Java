package generic;

public class Test <T1, T2, T3> {
    private final T1 object1;
    private final T2 object2;
    private final T3 object3;

    public Test(T1 object1, T2 object2, T3 object3){
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public void showInfo(){
        System.out.println("T1 : "+getObject1()+" : "+object1.getClass().getSimpleName());
        System.out.println("T2 : "+getObject2()+" : "+object2.getClass().getSimpleName());
        System.out.println("T3 : "+getObject3()+" : "+object3.getClass().getSimpleName());
    }

    //Getters
    public T1 getObject1() {
        return object1;
    }
    public T2 getObject2() {
        return object2;
    }
    public T3 getObject3() {
        return object3;
    }
}
