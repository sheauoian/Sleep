package com.github.sheauoian.sleep.util;

import java.util.ArrayList;
import java.util.List;

public class StatusHolder {
    private final float[] STATUS = new float[10];
    public StatusHolder() {}
    public StatusHolder(List<SleepStatus> statusList) {
        for (SleepStatus status : statusList)
            this.STATUS[status.type()] = status.v();
    }
}