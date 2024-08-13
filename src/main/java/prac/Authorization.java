package prac;

public enum Authorization {
    TELEGRAM("login","password");
    private String login;
    private String password;
    private Authorization(String log,String pass){
this.login=log;
this.password=pass;
    }
    public String getLogin(){return this.login;}
    public String getPassword(){return this.password;}
}
