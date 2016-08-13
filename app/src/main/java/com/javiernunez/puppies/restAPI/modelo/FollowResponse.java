package com.javiernunez.puppies.restAPI.modelo;

import com.javiernunez.puppies.pojo.FollowInst;

/**
 * Created by Javier Núñez on 19/07/2016.
 */
public class FollowResponse {
  FollowInst followInst;

    public FollowInst getFollowInst() {
        return followInst;
    }

    public void setFollowInst(FollowInst followInst) {
        this.followInst = followInst;
    }
}
