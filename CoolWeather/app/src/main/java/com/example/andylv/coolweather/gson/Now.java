package com.example.andylv.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by andy.lv on 2017/1/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
