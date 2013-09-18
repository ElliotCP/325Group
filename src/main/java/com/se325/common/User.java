package com.se325.common;

// default package
// Generated 16/09/2013 3:07:40 AM by Hibernate Tools 4.0.0

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String steamId;
    private long steamId64;
    private String steamName;
    private String steamProfileName;
    private int role;
    private String password;
    private String openIdReturnUrl;

    public User() {
    }

    public User(String steamId, long steamId64, String steamName,
            String steamProfileName, int role, String password, String openIdReturnUrl) {
        this.steamId = steamId;
        this.steamId64 = steamId64;
        this.steamName = steamName;
        this.steamProfileName = steamProfileName;
        this.role = role;
        this.password = password;
        this.openIdReturnUrl = openIdReturnUrl;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSteamId() {
        return this.steamId;
    }

    public void setSteamId(String steamId) {
        this.steamId = steamId;
    }

    public long getSteamId64() {
        return this.steamId64;
    }

    public void setSteamId64(long steamId64) {
        this.steamId64 = steamId64;
    }

    public String getSteamName() {
        return this.steamName;
    }

    public void setSteamName(String steamName) {
        this.steamName = steamName;
    }

    public String getSteamProfileName() {
        return this.steamProfileName;
    }

    public void setSteamProfileName(String steamProfileName) {
        this.steamProfileName = steamProfileName;
    }

    public int getRole() {
        return this.role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getOpenIdReturnUrl() {
        return this.openIdReturnUrl;
    }

    public void setOpenIdReturnUrl(String openIdReturnUrl) {
        this.openIdReturnUrl = openIdReturnUrl;
    }
    
    
    
}
