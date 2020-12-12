package service;

import entity.Client;
import entity.Credit;
import interfaces.CreditServices;

public class CreditService implements CreditServices {

    public boolean getCredit(Client client) {
        boolean check = false;
        if(client!=null){
            Credit credit= new Credit(client);
            check= true;
            client.setCredit(credit);
        }
        return check;
    }

    public void creditRepayment(Client client) {
        client.setCredit(new Credit());
    }
}
