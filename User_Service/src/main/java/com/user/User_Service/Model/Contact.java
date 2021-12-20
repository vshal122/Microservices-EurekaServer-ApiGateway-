package com.user.User_Service.Model;

public class Contact {

    private Long cId;
    private  String cName;
    private  String cEmail;
    private Long userId ;

    public Contact(Long cId, String cName, String cEmail, Long userId) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
