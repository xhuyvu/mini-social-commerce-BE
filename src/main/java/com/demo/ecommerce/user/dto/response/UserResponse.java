package com.demo.ecommerce.user.dto.response;

public class UserResponse {
    private long id;
    private String username;
    private String email;
    private ProfileReponse profile;
    public UserResponse(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public ProfileReponse getProfile() {
        return profile;
    }

    public void setProfile(ProfileReponse profile) {
        this.profile = profile;
    }
}
