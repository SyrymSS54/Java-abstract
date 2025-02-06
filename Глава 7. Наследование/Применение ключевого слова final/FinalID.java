class ErrorMsg{
    final int OUTERR = 0;
    final int INER = 1;
    final int DISKERR = 2;
    final int INDEXER = 3;
    String[] msgs = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Диск переполнен",
        "Индекс вышел за границы"
    };

    String getErrorMsg(int i){
        if(i>=0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}

public class FinalID {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }   
}
