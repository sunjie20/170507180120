package cn.edu.sdwu.android02.classroom.sn170507180120;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Ch10Activity1 extends AppCompatActivity {
    private Integer count;//点击按键的计数器


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch10_1);
        Log.i(Ch10Activity1.class.toString(),"onCreate");

        count=0;
    }

    public void finishClick(View view){
        finish();//关闭界面
    }

    //计数的方法
    public void counter(View view){
        count++;
        Log.i(Ch10Activity1.class.toString(),"counter:"+count);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //使用本方法保存一些界面的状态信息
        //数据保存在Bundle对象，恢复时会传回
        //一般保存动态的状态信息
        outState.putInt("counter",count);//保存数据到Bundle
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //恢复之前保存的状态信息
        count=savedInstanceState.getInt("counter");//恢复到成员变量
        Log.i(Ch10Activity1.class.toString(),"onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Ch10Activity1.class.toString(),"onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Ch10Activity1.class.toString(),"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Ch10Activity1.class.toString(),"onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Ch10Activity1.class.toString(),"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Ch10Activity1.class.toString(),"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Ch10Activity1.class.toString(),"onRestart");
    }
}

