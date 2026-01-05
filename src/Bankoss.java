public class Bankoss {
    public static void main(String[] args){
        System.out.println(approvalStatus("manager", "expired"));

    }
    public static String approvalStatus(String userRole, String status){
        if (userRole == "manager"){
            return "manager test";
        }

    }
}
