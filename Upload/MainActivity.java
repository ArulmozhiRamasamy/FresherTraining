package com.javahelps.sample.upload;

import android.Manifest;
import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;


@RuntimePermissions
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonopenfile = findViewById(R.id.button_open_file);
        buttonopenfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityPermissionsDispatcher.openfileWithPermissionCheck(MainActivity.this);
            }
        });
    }

    @NeedsPermission(Manifest.permission.CAMERA)
    void openfile() {
        Toast.makeText(this, "Accepted", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        MainActivityPermissionsDispatcher.onRequestPermissionsResult(this,requestCode,grantResults);

    }
    @OnShowRationale(Manifest.permission.CAMERA)
    void ShowRationaleForCamera(final PermissionRequest request){
     new AlertDialog.Builder(this)
             .setTitle("Permission needed")
             .setMessage("This Permission is needed because of access the file")
             .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                 request.proceed();
                 }
             })
             .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     request.cancel();
                 }
             })
             .show();
    }
    @OnPermissionDenied(Manifest.permission.CAMERA)
    void onFileDenied(){
        Toast.makeText(this,"permission denied",Toast.LENGTH_SHORT).show();
    }
    @OnNeverAskAgain(Manifest.permission.CAMERA)
    void onNeverAskAgain(){
        Toast.makeText(this,"never asking again",Toast.LENGTH_SHORT).show();
    }
}