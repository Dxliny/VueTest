package cn.goktech.pojo;

public class User {
    private int id;
    private String name;
    private String username;
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(){}
    public User(int id, String name, String username, String pwd) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.pwd = pwd;
    }
}
