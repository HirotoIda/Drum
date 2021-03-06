package com.lifeistech.android.drum;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private SoundPool mSoundPool;

    private int [] mSoundID;

    private int [] mSoundResource = {

            R.raw.cymbal,
            R.raw.cymbal2,
            R.raw.cymbal3,
            R.raw.tom1,
            R.raw.tom2,
            R.raw.tom3,
            R.raw.hihat,
            R.raw.snare,
            R.raw.bass



    } ;

    @Override
    protected  void onResume() {
        super.onResume();


        mSoundPool = new SoundPool(mSoundResource.length, AudioManager.STREAM_MUSIC,0);

        mSoundID = new int[mSoundResource.length];

        for (int i =0; i <mSoundResource.length; i++) {
            mSoundID[i] = mSoundPool.load(getApplicationContext(),mSoundResource[i],0);
        }

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        mSoundPool.release();
    }

    public void cymbal(View v) {
       mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    public void cymbal2(View v) {
        mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    public void cymbal3(View v){
        mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    public void tom1(View v){
        mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    public void tom2(View v){
        mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    public void tom3(View v) {
        mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    public void hihat(View v) {
        mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    public void snare(View v) {
        mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    public void bass(View v){
        mSoundPool.play(mSoundID[0],1.0f,1.0F,0,0,1.0F);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
