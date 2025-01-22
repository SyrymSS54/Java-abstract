public class Phone {
    public static void main(String[] args) {
        String[][] numbers = {
            {"Tom", "555-3322"},
            {"Mary", "555-8976"},
            {"Jon" , "555-1037"},
            {"Rachel", "555-1400"}
        };

        if(args.length !=1){
            System.out.println("args 0");
        }
        else{
            for(String[] s: numbers){
                if(s[0].equals(args[0])){
                    System.out.println(s[0] + " " + s[1]);
                    break;
                }
            }
            
        }
        
    }
}
