class Test{
    int a,b;

    Test(int i,int j){
        a = i;
        b = j;
    }

    void Change(Test ob){
        ob.a = ob.a + ob.b; 
        ob.b = -ob.b;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        var ob = new Test(15,20);
        System.out.println(ob.a + " " + ob.b);
        ob.Change(ob);
        System.out.println(ob.a+ " " + ob.b);
    }    
}
