package com.example.vai9105.sched;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;

import org.androidannotations.annotations.EApplication;
import org.androidannotations.annotations.UiThread;

/**
 * Created by Andrew Peacock on 4/14/2017.
 * found @ andrewpeacock04@gmail.com
 */
@EApplication
public class Globals extends Application {
    public void printMessage(){
        System.out.println("here's a global message!");
    }

    ProgressDialog progressDialog;

    @UiThread(propagation = UiThread.Propagation.REUSE)
    public void startProgress(Context c) {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        progressDialog = new ProgressDialog(c);
        progressDialog.setTitle("MySchedule");
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    @UiThread(propagation = UiThread.Propagation.REUSE)
    public void stopProgress() {
        if (progressDialog != null) {
            if (progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
        }
    }
}
