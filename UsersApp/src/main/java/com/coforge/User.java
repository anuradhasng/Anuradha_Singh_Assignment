package com.coforge;
 
public class User {
 
    private String userId;
    private String username;
    private String password;
    private String email;
    private String mobile;
 
    public User(String userId, String username, String password, String email, String mobile) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
    }
 
    public String getUsername() {
        return username;
    }
 
    public String getPassword() {
        return password;
    }
}
 