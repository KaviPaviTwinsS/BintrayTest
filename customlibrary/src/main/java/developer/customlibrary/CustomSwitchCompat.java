package developer.customlibrary;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by developer on 11/4/18.
 */

public class CustomSwitchCompat extends android.support.v7.widget.SwitchCompat {
    public CustomSwitchCompat(Context context) {
        super(context);
    }

    public CustomSwitchCompat(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomSwitchCompat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {
//        int colorOn = Color.parseColor(CL.getColor("switch_on"));
//        int colorOff = Color.parseColor(CL.getColor("switch_off"));
//        int alphaMediumGreen = Color.argb(127, Color.red(colorOn), Color.green(colorOn), Color.blue(colorOn));
//        int alphaMediumGrey = Color.argb(127, Color.red(colorOff), Color.green(colorOff), Color.blue(colorOff));
//        // Sets the tints for the thumb in different states
//        DrawableCompat.setTintList(this.getThumbDrawable(), new ColorStateList(
//                new int[][]{
//                        new int[]{android.R.attr.state_checked},
//                        new int[]{}
//                },
//                new int[]{
//                        colorOn,
//                        colorOff
//                }));
//        // Sets the tints for the track in different states
//        DrawableCompat.setTintList(this.getTrackDrawable(), new ColorStateList(
//                new int[][]{
//                        new int[]{android.R.attr.state_checked},
//                        new int[]{}
//                },
//                new int[]{
//                        alphaMediumGreen,
//                        alphaMediumGrey
//                }));
    }

}
