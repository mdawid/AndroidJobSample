package com.example.androidjobsample;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;
import com.evernote.android.job.JobManager;

public class AndroidJobApplication extends Application {
	@Override public void onCreate() {
		super.onCreate();

		JobManager.create( this ).addJobCreator( new JobCreator() {
			@Nullable @Override public Job create( @NonNull final String tag ) {
				return null;
			}
		} );
	}
}
