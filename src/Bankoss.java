public class Bankoss {
    public static void main(String[] args){
        approvalStatus(2, "NOT_CONFIRM", 55);
//        status --> "CONFIRM" / "NOT_CONFIRM" / "EXPIRED" / "REJECT"
//        userRole --> 1 (admin) / --> 2 (client)

    }
    public static void databaseField(String newStatus,int newUserRole,int newDate){
        String status = newStatus;
        int userRole = newUserRole;
        int date = newDate;
        System.out.println("database field updated. (" + "status: " + status + " , user role: " + userRole + " , date: " + date + ")");
    }
    public static void approvalStatus(int userRole, String status, int date){
        int today = 10;
        String statusValue = status;
        if (userRole == 1){
             if(statusValue == "NOT_CONFIRM" && date > today){
                System.out.println("request is expired");
            }
            else if(statusValue == "EXPIRED" || date > today) {
                System.out.println("expired, pls check date");
            }else if (statusValue == "CONFIRM"){
                System.out.println("ticket completed");
            }
            else if (statusValue == "REJECT"){
                System.out.println("request rejected");
            }else {
                System.out.println("request needs to confirm");
            }
        }else if (userRole == 2){
            if (statusValue == "NOT_CONFIRM" && date > today){
                databaseField("EXPIRED", userRole, date);
                System.out.println("request is expired");
            } else if (statusValue == "EXPIRED") {
                System.out.println("request is expired");
            }
        }

    }
}
