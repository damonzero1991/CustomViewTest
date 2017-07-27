package jackson.customviewtest.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import jackson.customviewtest.R;

/**
 * Created by Administrator on 2017/7/26.
 */

public class CustomGroupView extends RelativeLayout {

    private Button mLeftBtn;
    private TextView mTitleView;

    public CustomGroupView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_customgroup, this);
        mLeftBtn = (Button) findViewById(R.id.backBtnId);
        mTitleView = (TextView) findViewById(R.id.titleTvId);

    }


    // 为左侧返回按钮添加自定义点击事件
    public void setLeftButtonListener(OnClickListener listener) {
        mLeftBtn.setOnClickListener(listener);
    }

    // 设置标题的方法
    public void setTitleText(String title) {
        mTitleView.setText(title);
    }

}
