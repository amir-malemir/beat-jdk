interface CheckRequest{
    public void client(int userRole, String status, int date);
    public void database(int userRole, String status, int date);
    public String clientCheckler(boolean check);
}
class ReqStatus implements CheckRequest{
    @Override
    public void client(int userRole, String status, int date) {
        int today = 10;
        if (userRole == 1){
            if(status == "NOT_CONFIRM" && date > today){
                System.out.println("request is expired");
            }
            else if(status == "EXPIRED" || date > today) {
                System.out.println("expired, pls check date");
            }else if (status == "CONFIRM"){
                System.out.println("request sent, ticket completed");
            }
            else if (status == "REJECT"){
                System.out.println("request rejected");
            }else {
                System.out.println("request needs to confirm");
            }
        }else if (userRole == 2){
            if (status == "NOT_CONFIRM" && date > today){
                database(userRole, status, date);
            } else if (status == "EXPIRED") {
                System.out.println("request is expired");
            } else if (status == "CONFIRM" && date > today) {
                System.out.println(clientCheckler(true));
            }
        }
    }
    public void database(int userRole, String status, int date) {
        status = "EXPIRED";
        System.out.println("your request " + status + " (" +  date + ")");
    }
    public String clientCheckler(boolean check){
        return "your service approved but your status is expired for now :(, contact us";
    }
}
class Main{
    public static void main(String[] args) {
        ReqStatus myReqStatus = new ReqStatus();
        myReqStatus.client(2, "CONFIRM", 50);
        myReqStatus.client(1, "CONFIRM", 1);

    }
}
//        status --> "CONFIRM" / "NOT_CONFIRM" / "EXPIRED" / "REJECT"
//        userRole --> 1 (admin) / --> 2 (client)
