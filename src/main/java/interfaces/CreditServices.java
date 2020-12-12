package interfaces;

import entity.Client;
import entity.Credit;

public interface CreditServices {
    boolean getCredit(Client client);
    void creditRepayment(Client client);

}
