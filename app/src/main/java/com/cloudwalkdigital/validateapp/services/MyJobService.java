package com.cloudwalkdigital.validateapp.services;

import android.app.job.JobParameters;
import android.app.job.JobService;

/**
 * Created by alleoindong on 6/30/17.
 */

public class MyJobService extends JobService {
    private static final String TAG = "MyJobService";

    @Override
    public boolean onStartJob(JobParameters params) {
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
