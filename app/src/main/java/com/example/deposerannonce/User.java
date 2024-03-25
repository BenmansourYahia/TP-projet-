package com.example.deposerannonce;
public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public byte[] getUsername() {
        return new byte[0];
    }

    public byte[] getPassword() {
        return new byte[0];
    }

    public byte[] getEmail() {
        return new byte[0];
    }

}
