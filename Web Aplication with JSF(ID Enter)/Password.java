public class Password {
    private String password = "";
    private int passLen;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPassLen() {
        return passLen;
    }

    public void setPassLen(String pass) {
        this.passLen = pass.length();
    }
}
