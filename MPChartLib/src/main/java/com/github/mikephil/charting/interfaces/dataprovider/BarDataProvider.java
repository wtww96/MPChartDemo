package com.github.mikephil.charting.interfaces.dataprovider;

import com.github.mikephil.charting.data.BarData;

public interface BarDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BarData getBarData();

    boolean isDrawBarShadowEnabled();

    float isDrawBarRoundedRadius();//制圆角矩形柱状图 半径  0非圆角  大于0圆角

    boolean isDrawValueAboveBarEnabled();

    boolean isHighlightFullBarEnabled();
}
