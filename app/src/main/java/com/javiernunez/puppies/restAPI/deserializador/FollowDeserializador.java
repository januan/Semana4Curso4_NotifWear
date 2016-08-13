package com.javiernunez.puppies.restAPI.deserializador;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.javiernunez.puppies.pojo.FollowInst;
import com.javiernunez.puppies.restAPI.JSONKeys;
import com.javiernunez.puppies.restAPI.modelo.FollowResponse;

import java.lang.reflect.Type;

/**
 * Created by Javier Núñez on 19/07/2016.
 */
public class FollowDeserializador implements JsonDeserializer<FollowResponse>{
    @Override
    public FollowResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gsonFollow = new Gson();
        FollowResponse followResponse = gsonFollow.fromJson(json, FollowResponse.class);
        JsonObject followObj = json.getAsJsonObject();
        JsonObject followDataObj = followObj.getAsJsonObject(JSONKeys.RESPONSE_ARRAY);
        String outgoing_status = followDataObj.get(JSONKeys.USER_OUTGOING_STATUS).getAsString();

        FollowInst followInst = new FollowInst();
        followInst.setOut_status(outgoing_status);

        followResponse.setFollowInst(followInst);

        return followResponse;
    }
}
