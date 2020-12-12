import entity.Client;
import entity.Credit;
import service.CreditService;

public class Test {

    public static void main(String[] args){

        Client client1 = new Client((long) 1,"John","Cooper","Jour",27000.1243,null);
        CreditService creditService = new CreditService();
        System.out.println(client1);
        creditService.getCredit(client1);
        Credit credit =client1.getCredit();
        System.out.println(client1);
        System.out.println(credit);
        creditService.creditRepayment(client1);
        System.out.println(client1);

}

}
