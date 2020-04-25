package cn.edu.sdwu.android02.classroom.sn170507180120;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MyService extends Service {
    private MediaPlayer mediaPlayer;
    public MyService() {
    }
    @Override
    public void onCreate(){
        super.onCreate();
        //初始化播放器
        mediaPlayer=MediaPlayer.create(this,R.raw.music);
        mediaPlayer.setLooping(true);
        Log.i(MyService.class.toString(),"onCreate");
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        //主要业务写在本方法中
        mediaPlayer.start();
        Log.i(MyService.class.toString(),"onStartCommand");
        return super.onStartCommand(intent,flags,startId);

    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        mediaPlayer.release();
        Log.i(MyService.class.toString(),"onDestroy");
        super.onDestroy();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
