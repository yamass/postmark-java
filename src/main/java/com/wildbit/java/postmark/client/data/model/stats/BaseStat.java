package com.wildbit.java.postmark.client.data.model.stats;

import java.util.Date;

/**
 * Parrent stats class - POJO. Contains attributes each stat contains.
 */
public class BaseStat {

    private Date date;

    // SETTERS AND GETTERS

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
