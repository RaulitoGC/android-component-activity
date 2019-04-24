package com.rguzmanc.activity;

import android.app.Application;

import com.rguzmanc.activity.log.ReleaseTree;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timber.log.Timber;

public class ActivityApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    initLogger();

  }

  private void initLogger() {
    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree() {
        @Override
        protected @Nullable String createStackElementTag(@NotNull StackTraceElement element) {
          return String.format("Class:%s: Line: %s, Method: %s",
                  super.createStackElementTag(element),
                  element.getLineNumber(),
                  element.getMethodName());
        }
      });
    } else {
      Timber.plant(new ReleaseTree());
    }
  }
}
