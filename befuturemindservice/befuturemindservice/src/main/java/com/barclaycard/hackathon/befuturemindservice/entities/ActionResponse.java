package com.barclaycard.hackathon.befuturemindservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ActionResponse implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column
    private String actionResponseId;

    @Column
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
