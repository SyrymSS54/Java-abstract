class Block{
    int a, b, c;
    int volume;

    Block(int i, int j, int k){
        this.a = i;
        this.b = j;
        this.c = k;
        this.volume = this.a * this.b * this.c;
    }

    boolean sameBlock(Block ob){
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    boolean sameVolume(Block ob){
        if(ob.volume == this.volume) return true;
        else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        var ob1 = new Block(10, 2, 5);
        var ob2 = new Block(10, 2, 5);
        var ob3 = new Block(4, 5, 5);

        System.out.println(ob1.sameBlock(ob2));
        System.out.println(ob1.sameBlock(ob3));
        System.out.println(ob1.sameVolume(ob3));
    }
}
