package com.adelawson.youverifynotes.ui

import android.app.Application
import android.util.Log
import com.flurry.android.FlurryAgent
import com.flurry.android.FlurryPerformance

class BaseApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        //Flurry Analytics setup
        FlurryAgent.Builder()
            .withCaptureUncaughtExceptions(true)
            .withLogLevel(Log.VERBOSE)
            .withPerformanceMetrics(FlurryPerformance.ALL)
            .withIncludeBackgroundSessionsInMetrics(true)
            .withLogEnabled(true)
            .build(this, "RFSRW2N7Y6KSR8PQDVBP")
    }
}