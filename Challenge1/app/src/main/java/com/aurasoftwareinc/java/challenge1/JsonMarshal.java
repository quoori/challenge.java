package com.aurasoftwareinc.java.challenge1;

import org.json.JSONObject;

public class JsonMarshal
{
    public static JSONObject marshalJSON(Object object)
    {
        //
        // Todo: replace contents of this method with Your code.
        //

        JSONObject json = new JSONObject();

        try
        {
            json.put("test", "dummy");
        }
        catch (Exception ignore)
        {
        }

        return json;
    }

    public static boolean unmarshalJSON(Object object, JSONObject json)
    {
        //
        // Todo: replace contents of this method with Your code.
        //

        return true;
    }
}