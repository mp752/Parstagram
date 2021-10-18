package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("32t4SLbs2f3UIMU7HqReNyCIqHQcxBHn0T3tqyNz")
                .clientKey("SslEoxqgYDa4WzHE8EbfrYre1WXblESVec5KhOBe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
