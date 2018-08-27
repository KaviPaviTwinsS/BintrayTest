package developer.customlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;


/**
 * Created by developer on 10/4/18.
 */

public class CustomViewGroup extends FrameLayout {

    private Context mContext;

    public CustomViewGroup(Context context) {
        super(context);
    }

    public CustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {
        this.mContext = context;

//        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomViewGroup, defStyle, 0);
//        if (typedArray != null) {
//            if (typedArray.hasValue(0)) {
//                String colorName = typedArray.getString(R.styleable.CustomViewGroup_background_color);
//
//                try {
//                    if (!colorName.equals("") && TaxiUtil.COLORJSON != null) {
//
//                        setBackgroundColor(Color.parseColor(TaxiUtil.COLORJSON.getString(colorName)));
//
//                    } else {
//                        setBackgroundColor(Color.parseColor(TaxiUtil.COLORJSON.getString("text_unselected")));
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            } else {
//                setBackgroundColor(Color.parseColor(CL.getColor("text_unselected")));
//            }
//
//            typedArray.recycle();
//        } else {
//            Log.d("customCame9","kjhkdhsfkjj");
//        }
    }

}
