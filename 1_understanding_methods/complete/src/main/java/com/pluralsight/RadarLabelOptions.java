package com.pluralsight;

public class RadarLabelOptions {
    private boolean showAltitudeTrendArrow;
    private boolean showSpeed;

    public RadarLabelOptions(boolean showAltitudeTrendArrow, boolean showSpeed) {
        this.showAltitudeTrendArrow = showAltitudeTrendArrow;
        this.showSpeed = showSpeed;
    }

    public boolean isShowAltitudeTrendArrow() {
        return showAltitudeTrendArrow;
    }

    public boolean isShowSpeed() {
        return showSpeed;
    }

    public void setShowAltitudeTrendArrow(boolean showAltitudeTrendArrow) {
        this.showAltitudeTrendArrow = showAltitudeTrendArrow;
    }

    public void setShowSpeed(boolean showSpeed) {
        this.showSpeed = showSpeed;
    }
}
