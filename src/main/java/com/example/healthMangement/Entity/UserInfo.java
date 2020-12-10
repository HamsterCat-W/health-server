package com.example.healthMangement.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
    private String userId;
    private String username;
    private String password;
    private String email;
    private String tel;
    private boolean userRole;
    private boolean userState;

    public UserInfo() {

    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    public String getUserId() {
        return userId;
    }

    public UserInfo(String userId, String username, String password, String email, String tel) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.tel = tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean getUserRole() {
        return userRole;
    }

    public void setUserRole(boolean userRole) {
        this.userRole = userRole;
    }

    public boolean getUserState() {
        return userState;
    }

    public void setUserState(boolean userState) {
        this.userState = userState;
    }

    @Override
    public String toString() {
        return "userInfo{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", userRole=" + userRole +
                ", userState=" + userState +
                '}';
    }
}
