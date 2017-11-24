package com.barclaycard.hackathon.befuturemindservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity(name = "SenderSession")
public class SenderSession implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column( name = "ID")
    private String senderID;

    @Column
    private String lastLoginTS;

    @Column
    private boolean authenticatedFlag;

    @Column
    private String securePin;

    @Column
    private String updateTS;

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getLastLoginTS() {
        return lastLoginTS;
    }

    public void setLastLoginTS(String lastLoginTS) {
        this.lastLoginTS = lastLoginTS;
    }

    public boolean isAuthenticatedFlag() {
        return authenticatedFlag;
    }

    public void setAuthenticatedFlag(boolean authenticatedFlag) {
        this.authenticatedFlag = authenticatedFlag;
    }

    public String getSecurePin() {
        return securePin;
    }

    public void setSecurePin(String securePin) {
        this.securePin = securePin;
    }

    public String getUpdateTS() {
        return updateTS;
    }

    public void setUpdateTS(String updateTS) {
        this.updateTS = updateTS;
    }
}
