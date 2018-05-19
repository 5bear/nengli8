package com.nengli8.util;

import java.sql.Timestamp;

/**
 * Created by 11369 on 2018/5/19.
 */
public class DateUtil {
    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}
