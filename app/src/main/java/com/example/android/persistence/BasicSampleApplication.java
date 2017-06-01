package com.example.android.persistence;

import android.app.Application;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by nkoroi on 01/06/17.
 */

public class BasicSampleApplication extends Application {

  @Override
  public void onCreate(){
    super.onCreate();
    if(LeakCanary.isInAnalyzerProcess(this)){
      return;
    }
    LeakCanary.install(this);
  }
}
