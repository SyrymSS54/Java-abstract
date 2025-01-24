class MyClass{
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a){
        this.alpha = a;
    }

    int getAlpha(){
        return this.alpha;
    }
}

class AccessDemo{
    public static void main(String[] args) {
        var ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        //ob.alpha = 10;

        ob.beta = 88;
        ob.gamma = 99;
    }
}