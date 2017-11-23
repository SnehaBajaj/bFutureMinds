package com.barclaycard.hackathon.befuturemindservice.entities;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by vbhatia on 11/23/2017.
 */
@Entity
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String accountId;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = true)
    private String socialId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }
}
