package com.ts.iplay.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;

import com.ts.iplay.R;

/**
 * Created by jmt on 17/7/4.
 */

public class MaskRoundCornerImageView extends RoundCornerImageView {
    private static final int MASK_COLOR = 0x77000000;

    private int mMaskColor = MASK_COLOR;

    public MaskRoundCornerImageView(Context context) {
        super(context);
        init(null);
    }

    public MaskRoundCornerImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public MaskRoundCornerImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

//    private void init() {
//        setColorFilter(new PorterDuffColorFilter(MASK_COLOR, PorterDuff.Mode.SRC_ATOP));
//    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RoundCornerImageView);
            mMaskColor = a.getColor(R.styleable.RoundCornerImageView_maskColor, MASK_COLOR);
        }
        setColorFilter(new PorterDuffColorFilter(mMaskColor, PorterDuff.Mode.SRC_ATOP));
    }

//    private void setPressedEffect(boolean pressed) {
//        if (isPressed != pressed) {
//            Log.d(TAG, "setPressedEffect " + pressed);
//            isPressed = pressed;
//            if (isPressed)
//                setColorFilter(new PorterDuffColorFilter(MASK_COLOR, PorterDuff.Mode.SRC_ATOP));
//            else
//                setColorFilter(null);
//        }
//    }
}
