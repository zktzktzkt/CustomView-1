package com.zzw.customview.view.utils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by zzw on 2017/6/6.
 * Version:
 * Des:
 */

public class DisplayUtil {

    /**
     * 得到文字的高度
     *
     * @param str
     * @param paint
     * @return
     */
    public static int getTextHeight(String str, Paint paint) {
        Rect textBounds = new Rect();
        paint.getTextBounds(str, 0, str.length(), textBounds);
        return textBounds.height();
    }

    /**
     * 得到文字的宽度
     *
     * @param str
     * @param paint
     * @return
     */
    public static float getTextWidth(String str, Paint paint) {
//        Rect textBounds = new Rect();
//        paint.getTextBounds(str, 0, str.length(), textBounds);
//        return textBounds.width();
        return paint.measureText(str);
    }

    /**
     * 获取文字基线
     *
     * @param height 当前控件高度
     * @param paint  画笔
     * @return
     */
    public static int getTextBaseLine(int height, Paint paint) {
        // 获取画笔的FontMetrics
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        // 计算文字的基线
        return (int) (height / 2 + (fontMetrics.bottom - fontMetrics.top) / 2 - fontMetrics.bottom);
    }

    /**
     * @param @param  context
     * @param @param  pxValue
     * @param @return
     * @return int
     * @throws
     * @方法名称: px2dip
     * @描述: 将px值转换为dip或dp值
     * @author 徐纪伟
     * 2014年10月24日 下午9:59:08
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * @param @param  context
     * @param @param  dipValue
     * @param @return
     * @return int
     * @throws
     * @方法名称: dip2px
     * @描述: 将dip或dp值转换为px值
     * @author 徐纪伟
     * 2014年10月24日 下午9:59:53
     */
    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }


    /**
     * @param @param  context
     * @param @param  pxValue
     * @param @return
     * @return int
     * @throws
     * @方法名称: px2sp
     * @描述: 将px值转换为sp值
     * @author 徐纪伟
     * 2014年10月24日 下午10:00:36
     */
    public static int px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

    /**
     * @param @param  context
     * @param @param  spValue
     * @param @return
     * @return int
     * @throws
     * @方法名称: sp2px
     * @描述: 将sp值转换为px值
     * @author 徐纪伟
     * 2014年10月24日 下午10:01:01
     */
    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }


    /**
     * 获得屏幕高度
     *
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.widthPixels;
    }

}
