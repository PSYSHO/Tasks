package entity;

public class Client {
    private Long id;
    private String firstname;
    private String secondname;
    private String lastname;
    private Double Wallet;
    private Credit credit;

    public Client() {
    }

    public Client(Long id, String firstname, String secondname, String lastname, Double wallet, Credit credit) {
        this.id = id;
        this.firstname = firstname;
        this.secondname = secondname;
        this.lastname = lastname;
        this.Wallet = wallet;
        this.credit = credit;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Double getWallet() {
        return Wallet;
    }

    public void setWallet(Double wallet) {
        Wallet = wallet;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return com.google.common.base.Objects.equal(id, client.id) &&
                com.google.common.base.Objects.equal(firstname, client.firstname) &&
                com.google.common.base.Objects.equal(secondname, client.secondname) &&
                com.google.common.base.Objects.equal(lastname, client.lastname) &&
                com.google.common.base.Objects.equal(Wallet, client.Wallet) &&
                com.google.common.base.Objects.equal(credit, client.credit);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(id, firstname, secondname, lastname, Wallet, credit);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Wallet=" + Wallet +
                ", credit=" + credit +
                '}';
    }
}
