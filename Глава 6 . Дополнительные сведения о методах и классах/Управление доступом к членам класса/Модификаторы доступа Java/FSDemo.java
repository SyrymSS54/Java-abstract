class FailSoftArray{
    private int[] a;
    private int errval;
    public int length;

    public FailSoftArray(int size, int errv){
        this.a = new int[size];
        this.errval = errv;
        this.length = size;
    }

    public int get(int index){
        if(indexOK(index)) return a[index];
        return errval;
    }

    public boolean put(int index,int val){
        if(indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index){
        if(index >= 0 & index < this.length) return true;
        return false;
    }
}

public class FSDemo {
    public static void main(String[] args) {
        var fs = new FailSoftArray(5,-1);
        int x;

        System.out.println("Обработка ошибок без отчета.");
        for(int i = 0; i < (fs.length * 2); i++){
            fs.put(i, i*10);
        }

        for(int i=0; i < (fs.length * 2); i++){
            x = fs.get(i);
            if(x != - 1) System.out.print(x + " ");
        }

        System.out.println();

        System.out.println("\nОбработка ошибок с отчетом.");
        for(int i =0; i< (fs.length * 2); i++){
            if(!fs.put(i,i*10)){
                System.out.println("Индекс " + i + " выходит за границы массива");
            }
            
        }

        for(int i=0; i < (fs.length * 2); i++){
            x = fs.get(i);
            if(x != - 1) System.out.print(x + " ");
            else System.out.println("Индекс " + i + " выходит за границы массива");
        }
    }
}
