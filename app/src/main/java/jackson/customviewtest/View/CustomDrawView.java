package jackson.customviewtest.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/26.
 */

public class CustomDrawView extends View implements View.OnClickListener{

    //定义画笔
    private Paint mPaint = null;
    //用于获取文字的宽和高
    private Rect mBounds = null;
    //计数值，每点击一次本控件，其值加1
    private int mCount = 0 ;


    public CustomDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        // 初始化画笔、Rect
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mBounds = new Rect();
        // 本控件的点击事件
        setOnClickListener(this);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLUE);
        // 绘制一个填充色为蓝色的矩形
        canvas.drawRect(0,0,getWidth(),getHeight(),mPaint);
        mPaint.setColor(Color.YELLOW);
        mPaint.setTextSize(50);
        String text = String.valueOf(mCount);
        // 获取文字的宽和高
        mPaint.getTextBounds(text,0,text.length(),mBounds);
        int textWidth = mBounds.width() ;
        int textHeight = mBounds.height() ;
        //绘制字符串
        canvas.drawText(text,(getWidth()-textWidth)/2,(getHeight()-textHeight)/2,mPaint);
    }

    @Override
    public void onClick(View view) {
        mCount++ ;
        //重绘
        invalidate();
    }
}
