package developer.customlibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import java.io.FileNotFoundException;
import java.util.WeakHashMap;

/**
 * Created by developer on 10/4/18.
 */

public class CustomView extends View {
    private static final int HTML_STYLE_STRIKE_THROUGH = 0;
    private static WeakHashMap<String, Typeface> fontMap = new WeakHashMap();
    Context mContext;


    public CustomView(Context context) throws FileNotFoundException {
        super(context);
        init(context, null, 0);
    }

    public CustomView(Context context, AttributeSet attrs) throws FileNotFoundException {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        this.mContext = context;
//        setBackgroundColor(Color.parseColor(CL.getColor("text_highlighted")));


    }
}
