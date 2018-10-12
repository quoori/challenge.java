package com.aurasoftwareinc.java.challenge1;

import org.json.JSONObject;

public class SubclassTypes implements JsonMarshalInterface
{
    public PrimitiveTypes primitiveTypes;
    private ObjectTypes objectTypes;
    public JSONTypes jsonTypes;

    public void populateTestData()
    {
        primitiveTypes = new PrimitiveTypes();
        primitiveTypes.populateTestData();

        objectTypes = new ObjectTypes();
        objectTypes.populateTestData();

        jsonTypes = new JSONTypes();
        jsonTypes.populateTestData();
    }

    @Override
    public JSONObject marshalJSON()
    {
        return JsonMarshal.marshalJSON(this);
    }

    @Override
    public boolean unmarshalJSON(JSONObject json)
    {
        return JsonMarshal.unmarshalJSON(this, json);
    }
}
