package com.wildbit.java.postmark.client.data.model.stats;

import java.util.ArrayList;

/**
 * Click platform stat object.
 */
public class OutboundClickPlatformStats {

    private Integer desktop;
    private Integer mobile;
    private Integer webmail;
    private Integer unknown;

    private ArrayList<ClickPlatformStat> days;

    // SETTERS AND GETTERS

    public Integer getDesktop() {
        return desktop;
    }

    public void setDesktop(Integer desktop) {
        this.desktop = desktop;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Integer getWebmail() {
        return webmail;
    }

    public void setWebmail(Integer webmail) {
        this.webmail = webmail;
    }

    public Integer getUnknown() {
        return unknown;
    }

    public void setUnknown(Integer unknown) {
        this.unknown = unknown;
    }

    public ArrayList<ClickPlatformStat> getDays() {
        return days;
    }

    public void setDays(ArrayList<ClickPlatformStat> days) {
        this.days = days;
    }
}
