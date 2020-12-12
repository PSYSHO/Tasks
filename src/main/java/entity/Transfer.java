package entity;

import com.google.common.base.Objects;

import java.util.Date;

public class Transfer {
    private Long id;
    private Long Summ;
    private Date date;
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSumm() {
        return Summ;
    }

    public void setSumm(Long summ) {
        Summ = summ;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfer transfer = (Transfer) o;
        return Objects.equal(id, transfer.id) &&
                Objects.equal(Summ, transfer.Summ) &&
                Objects.equal(date, transfer.date) &&
                Objects.equal(client, transfer.client);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, Summ, date, client);
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "id=" + id +
                ", Summ=" + Summ +
                ", date=" + date +
                ", client=" + client +
                '}';
    }
}
