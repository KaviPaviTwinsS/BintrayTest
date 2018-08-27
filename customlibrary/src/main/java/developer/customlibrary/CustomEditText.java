package developer.customlibrary;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import java.io.FileNotFoundException;

/**
 * Created by developer on 18/6/18.
 */

public class CustomEditText extends AppCompatEditText {
    Context mContext;


    public CustomEditText(Context context) throws FileNotFoundException {
        super(context);
        init(context, null, 0);
    }

    public CustomEditText(Context context, AttributeSet attrs) throws FileNotFoundException {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        this.mContext = context;

//        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomEditText, defStyle, 0);
//        if (typedArray != null) {
//            if (typedArray.hasValue(0)) {
//                String bg_colorName = typedArray.getString(R.styleable.CustomEditText_edittext_background_color);
//                String textColor = typedArray.getString(R.styleable.CustomEditText_edittext_color);
//                String hintColor = typedArray.getString(R.styleable.CustomEditText_hint_color);
//                try {
//                    if (textColor != null && !textColor.equals("") && TaxiUtil.COLORJSON != null) {
//                        setTextColor(Color.parseColor(CL.getColor(textColor)));
//                    }
//                    if (hintColor != null && !hintColor.equals("") && TaxiUtil.COLORJSON != null) {
//                        setHintTextColor(Color.parseColor(CL.getColor(hintColor)));
//                    }
//                    if (bg_colorName != null && !bg_colorName.equals("") && TaxiUtil.COLORJSON != null) {
//                        setBackgroundColor(Color.parseColor(CL.getColor(bg_colorName)));
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            } else {
//                setTextColor(Color.parseColor(CL.getColor("text_normal")));
//                setHintTextColor(Color.parseColor(CL.getColor("text_hint_color")));
//            }
//
//            typedArray.recycle();
//        }
    }
}
