package ssmtest.ssmtest1.bo;

import java.util.Date;

public class User{
    private Integer id;

    private String username;

    private String password;

    private String passwordhash;

    private String email;

    private Boolean emailconfirmed;

    private String hometown;

    private String hometel;

    private String homephone;

    private String homeaddress;

    private String officephone;

    private String officetel1;

    private String officetel2;

    private String officeaddress;

    private Date lockoutenddateutc;

    private Integer accessfailedcount;

    private Boolean lockoutenabled;

    private Boolean twofactorenabled;

    private String code;

    private String name;

    private Integer createby;

    private Date createtime;

    private Integer lastupdateby;

    private Date lastupdatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordhash() {
        return passwordhash;
    }

    public void setPasswordhash(String passwordhash) {
        this.passwordhash = passwordhash == null ? null : passwordhash.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getEmailconfirmed() {
        return emailconfirmed;
    }

    public void setEmailconfirmed(Boolean emailconfirmed) {
        this.emailconfirmed = emailconfirmed;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getHometel() {
        return hometel;
    }

    public void setHometel(String hometel) {
        this.hometel = hometel == null ? null : hometel.trim();
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone == null ? null : homephone.trim();
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getOfficetel1() {
        return officetel1;
    }

    public void setOfficetel1(String officetel1) {
        this.officetel1 = officetel1 == null ? null : officetel1.trim();
    }

    public String getOfficetel2() {
        return officetel2;
    }

    public void setOfficetel2(String officetel2) {
        this.officetel2 = officetel2 == null ? null : officetel2.trim();
    }

    public String getOfficeaddress() {
        return officeaddress;
    }

    public void setOfficeaddress(String officeaddress) {
        this.officeaddress = officeaddress == null ? null : officeaddress.trim();
    }

    public Date getLockoutenddateutc() {
        return lockoutenddateutc;
    }

    public void setLockoutenddateutc(Date lockoutenddateutc) {
        this.lockoutenddateutc = lockoutenddateutc;
    }

    public Integer getAccessfailedcount() {
        return accessfailedcount;
    }

    public void setAccessfailedcount(Integer accessfailedcount) {
        this.accessfailedcount = accessfailedcount;
    }

    public Boolean getLockoutenabled() {
        return lockoutenabled;
    }

    public void setLockoutenabled(Boolean lockoutenabled) {
        this.lockoutenabled = lockoutenabled;
    }

    public Boolean getTwofactorenabled() {
        return twofactorenabled;
    }

    public void setTwofactorenabled(Boolean twofactorenabled) {
        this.twofactorenabled = twofactorenabled;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getLastupdateby() {
        return lastupdateby;
    }

    public void setLastupdateby(Integer lastupdateby) {
        this.lastupdateby = lastupdateby;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
    public String toString() {
    	return this.email;
    }
}