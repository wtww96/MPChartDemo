package com.github.mikephil.charting.listener;

import android.view.MotionEvent;

/**
 * Listener for callbacks when doing gestures on the chart.
 *
 * @author Philipp Jahoda
 */
public interface OnChartGestureListener {

    /**
     * 当一个触摸手势在图表上 开始 时的回调(ACTION_DOWN)
     *
     * @param me
     * @param lastPerformedGesture
     */
    void onChartGestureStart(MotionEvent me, ChartTouchListener.ChartGesture lastPerformedGesture);

    /**
     * 当一个触摸手势在图表上 结束 时返回(ACTION_UP, ACTION_CANCEL)
     *
     * @param me
     * @param lastPerformedGesture
     */
    void onChartGestureEnd(MotionEvent me, ChartTouchListener.ChartGesture lastPerformedGesture);

    /**
     * 图表长按时
     *
     * @param me
     */
    void onChartLongPressed(MotionEvent me);

    /**
     * 图表双击
     *
     * @param me
     */
    void onChartDoubleTapped(MotionEvent me);

    /**
     * 图表单击
     *
     * @param me
     */
    void onChartSingleTapped(MotionEvent me);

    /**
     * Callbacks then a fling gesture is made on the chart.
     *
     * @param me1
     * @param me2
     * @param velocityX
     * @param velocityY
     */
    void onChartFling(MotionEvent me1, MotionEvent me2, float velocityX, float velocityY);

    /**
     * 图表的 缩放/双击手势缩放/缩放。
     *
     * @param me
     * @param scaleX scalefactor on the x-axis
     * @param scaleY scalefactor on the y-axis
     */
    void onChartScale(MotionEvent me, float scaleX, float scaleY);

    /**
     * 图表移动回调
     *
     * @param me
     * @param dX translation distance on the x-axis
     * @param dY translation distance on the y-axis
     */
    void onChartTranslate(MotionEvent me, float dX, float dY);
}
