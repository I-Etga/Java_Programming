package sundays_live_sessions.week10.amazonAccount;

public class AmazonAccount {
    private String username;
    private String email;
    private boolean hasPrime;

    public AmazonAccount(String username, String email, boolean hasPrime) {
        setUsername(username);
        setEmail(email);
        setHasPrime(hasPrime);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }
}