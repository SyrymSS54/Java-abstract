public class StrOps {
    public static void main(String[] args) {
        String str1 = "В области программирования веб - приложений язык Java занимает первое место.";
        String str2 = new String(str1);
        String str3 = "Строки Java крайне эффективны.";
        int result, idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());

        for(int i = 0;i < str1.length();i++){
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        if(str1.equals(2)){
            System.out.println("Str1 equals str2");
        }
        else{
            System.out.println("Str1 not equals str2");
        }
        if(str1.equals(str3)){
            System.out.println("Str1 equals str3");
        }
        else{
            System.out.println("Str1 not equals str3");
        }

        result = str1.compareTo(str3);
        if(result == 0){
            System.out.println("str1 == str3");
        }
        else if(result < 0){
            System.out.println("str1 < str3");
        }
        else{
            System.out.println("str1 > str3");
        }

        str2 = "Один Два Три Один";

        idx = str2.indexOf("Один");
        System.out.println(idx);
        idx = str2.lastIndexOf("Один");
        System.out.println(idx);
    }
}
