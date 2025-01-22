public class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";
        switch ((command)) {
            case "connect":
                System.err.println("Connect");
                break;
            case "cancel":
                System.out.println("cancel");
                break;
            case "disconnect":
                System.out.println("Disconnect");
            default:
                System.out.println("Error");
                break;
        }
    }
}
