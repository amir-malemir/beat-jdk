interface CheckRequest{
    public void customerApporval(int userRole, String status, int date, int today);
    public void managerApporval(int userRole, String status, int date, int today);
    public void database(int userRole, String status, int date);
    public String expireChecker(int date, int today);
}
class RequestChecker implements CheckRequest{
    public void doProcess(int userRole, String status, int date, int today){
//        System.out.println(userRole+status);
        if (userRole == 2){
            customerApporval(userRole, status, date, today);
        }else if (userRole == 1){
            managerApporval(userRole, status, date, today);
        }
    }
    public void customerApporval(int userRole, String status, int date, int today) {
        if (date > today){
            switch (userRole + status) {
                case "2NOT_CONFIRM": database(userRole, status, date); break;
                case "2EXPIRED": System.out.println("request is expired"); break;
                case "2CONFIRM": System.out.println(expireChecker(date, today));
                default: System.out.println("wrong information");
            }
        }
    }
    public void managerApporval(int userRole, String status, int date, int today) {
        if (date > today){
            switch (userRole + status) {
                case "1NOT_CONFIRM" : System.out.println("request is expired"); break;
                case "1EXPIRED" : System.out.println("expired, pls check date");
                default: System.out.println("wrong information");
            }
        }else {
            switch (userRole + status) {
                case "1CONFIRM" : System.out.println("request sent, ticket completed"); break;
                case "1REJECT" :  System.out.println("request rejected");
                default: System.out.println("wrong information");
            }
        }
    }
    public void database(int userRole, String status, int date) {
        status = "EXPIRED";
        System.out.println("your request " + status + " (" +  date + ")");
    }
    public String expireChecker(int date, int today) {
        return "your service approved but your status is expired for now :(, contact us";
    }
}
class Main{
    enum status{
        C("CONFIRM"),
        NC("NOT_CONFIRM"),
        E("EXPIRED"),
        R("REJECT");

        private String statusValue;

        // Constructor (runs once for each constant above)
        private status(String statusValue) {
            this.statusValue = statusValue;
        }
        public String getStatusValue() {
            return statusValue;
        }
    }
    public static void main(String[] args) {
        //   enum status : C -> "CONFIRM" / NC -> "NOT_CONFIRM" / E -> "EXPIRED" / R -> "REJECT"
        status myStatus = status.C;
//        System.out.println(myStatus.getStatusValue());
        RequestChecker myRequest = new RequestChecker();
        myRequest.doProcess(2, myStatus.getStatusValue(), 50, 10);
//        myRequest.doProcess(1, "CONFIRM", 10, 10);

    }
}
//        userRole --> 1 (admin) / --> 2 (client)
