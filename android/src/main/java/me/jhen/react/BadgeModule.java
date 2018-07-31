package me.jhen.react;

import android.content.Context;
import android.content.Intent;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import me.leolin.shortcutbadger.ShortcutBadger;
import com.alibaba.fastjson.JSON;
public class BadgeModule extends ReactContextBaseJavaModule {

  private Context context;
  public static final String NOTIFY_LISTENER_HANDLER = "com.stan.NOTIFICATION_LISTENER_EXAMPLE";
  public BadgeModule(ReactApplicationContext reactContext) {
    super(reactContext);

    this.context = (Context) reactContext;
  }

  @Override
  public String getName() {
    return "BadgeAndroid";
  }

  @ReactMethod
  public void setBadge(int number) {
   

    Intent i = new  Intent(NOTIFY_LISTENER_HANDLER);
IconIndicators indicators = new IconIndicators(context.getPackageName(),number,true);
    String message = JSON.toJSONString(indicators);
    //Log.e(TAG,"notify message: "+message);
    i.putExtra("notification_event",message);
    context.sendBroadcast(i);

   // ShortcutBadger.applyCount(getReactApplicationContext(), number);
  }
}