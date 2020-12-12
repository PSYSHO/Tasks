package entity;

import Enums.TypeCredit;
import com.google.common.base.Objects;

import java.util.Date;
import java.util.Random;

public class Credit {
    private Enum type;
    private Double summ;
    private String term;
    private Date date;

    public Credit(){
        this.type=TypeCredit.NULL;
        this.summ= Double.valueOf(0);

    }

    public Credit(Client client) {
        this.type= TypeCredit.Consumer;
        this.summ=100000.00;
        this.term="3 месяца";
        this.date = new Date();
    }

    public Credit(Enum type, Double summ, Client client, String term, Date date) {
        this.type = type;
        this.summ = summ;
        this.term = term;
        this.date = date;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public Double getSumm() {
        return summ;
    }

    public void setSumm(Double summ) {
        this.summ = summ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credit credit = (Credit) o;
        return Objects.equal(type, credit.type) &&
                Objects.equal(summ, credit.summ) &&
                Objects.equal(term, credit.term) &&
                Objects.equal(date, credit.date);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(type, summ, term, date);
    }

    @Override
    public String
    toString() {
        return "Credit{" +
                "type=" + type +
                ", summ=" + summ +
                ", term='" + term + '\'' +
                ", date=" + date +
                '}';
    }
}
