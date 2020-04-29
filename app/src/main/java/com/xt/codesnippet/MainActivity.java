package com.xt.codesnippet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codeSnippet();
    }

    /**
     * 用touch事件实现按钮点击选择器效果
     */
    private void codeSnippet() {
        View view = new View(this);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        //设置点击后的效果
                        return true;
                    case MotionEvent.ACTION_UP:
                        //恢复到点击前的效果
                    {
                        //判断手指弹起时的位置是否在控件区域内，在区域内是点击，在区域外是取消
                        float x = event.getX();
                        float y = event.getY();
                        if (x >= 0) {
                            if (x <= v.getWidth()) {
                                if (y >= 0) {
                                    if (y <= v.getHeight()) {
                                        //执行目标代码
                                    }
                                }
                            }
                        }
                    }
                    break;
                    case MotionEvent.ACTION_CANCEL:
                        //基本不会触发
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
    }
}
