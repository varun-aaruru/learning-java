public class SwitchStatements {
    public static void main(String[] args){
        String role = "Admin";
        switch (role) {
            case "Admin":
                System.out.println("All access");
                break;
            case "Moderator":
                System.out.println("Limited access");
                break;
            default:
                System.out.println("Guest access");
        }
    }
}
