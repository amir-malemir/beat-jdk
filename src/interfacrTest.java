interface CheckRequest{
    public void customerApporval(int userRole, String status, int date);
    public void database(int userRole, String status, int date);
    public String clientCheckler(boolean check);
}
class ReqStatus implements CheckRequest{
    public void  customerApporval(int userRole, String status, int date) {
        int today = 10;
        if (date > today){
            switch (userRole + status) {
                case "2NOT_CONFIRM": database(userRole, status, date); break;
                case "2EXPIRED": System.out.println("request is expired"); break;
                case "2CONFIRM": System.out.println(clientCheckler(true));
                default: System.out.println("no information");
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
        myReqStatus.customerApporval(2, "NOT_CONFIRM", 50);
        myReqStatus.client(1, "test", 10);

    }
}
//        status --> "CONFIRM" / "NOT_CONFIRM" / "EXPIRED" / "REJECT"
//        userRole --> 1 (admin) / --> 2 (client)
