package com.javiernunez.puppies.pojo;

/**
 * Created by Javier Núñez on 19/07/2016.
 */
public class FollowInst {
    private String out_status;

    public FollowInst(String out_status) {
        this.out_status = out_status;
    }

    public FollowInst() {
    }

    public String getOut_status() {
        return out_status;
    }

    public void setOut_status(String out_status) {
        this.out_status = out_status;
    }
}
