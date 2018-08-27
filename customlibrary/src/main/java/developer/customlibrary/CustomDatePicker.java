package developer.customlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.DatePicker;

/**
 * Created by developer on 11/4/18.
 */

public class CustomDatePicker extends DatePicker {
    public CustomDatePicker(Context context) {
        super(context);
    }

    public CustomDatePicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomDatePicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {
//        int colorOn = Color.parseColor(CL.getColor("switch_on"));
//        int colorOff = Color.parseColor(CL.getColor("switch_off"));
//        int alphaMediumGreen = Color.argb(127, Color.red(colorOn), Color.green(colorOn), Color.blue(colorOn));
//        int alphaMediumGrey = Color.argb(127, Color.red(colorOff), Color.green(colorOff), Color.blue(colorOff));
//
//
//        ColorStateList colorStateList = new ColorStateList(
//                new int[][] {
//                        new int[] { android.R.attr.state_checked }, // checked
//                        new int[] { -android.R.attr.state_checked }  // unchecked
//                },
//                new int[] {
//                        colorOn,
//                        colorOff
//                }
//        );
//        CompoundButtonCompat.setButtonTintList(this,colorStateList);


    }
}
