package com.mongodemo.util;

import java.util.UUID;

/**
 * desc:
 * author:devzhong
 * Date:2019/5/11 16:34
 */
public class UuidUtil {
    public static String generate(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
