interface requestStatus{
    public void clientdata();
    public void databaseField();
    public String clientCheckler();
    public void approvalStatus();
    }

    static class clientReq implements requestStatus{
        public void clientdata() {
            approvalStatus(2, "CONFIRM", 55);
//        status --> "CONFIRM" / "NOT_CONFIRM" / "EXPIRED" / "REJECT"
//        userRole --> 1 (admin) / --> 2 (client)
        }

        public void databaseField(String newStatus,int newUserRole,int newDate){
            String status = newStatus;
            int userRole = newUserRole;
            int date = newDate;
            System.out.println("database field updated. (" + "status: " + status + " , user role: " + userRole + " , date: " + date + ")");
        }
        public String clientCheckler(boolean clientStatus){
            return "your service approved but your status is expired for now :(, contact us";
        }
        public void approvalStatus(int userRole, String status, int date){
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
                } else if (statusValue == "CONFIRM" && date > today) {
                    System.out.println(clientCheckler(true));
                }
            }

        }
    }
public static void main(String[] args){
        clientReq myClient = new clientReq();
        myClient.clientdata();


    }

