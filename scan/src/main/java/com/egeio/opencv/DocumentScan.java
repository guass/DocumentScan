package com.egeio.opencv;

import android.content.Context;

/**
 * 预览转换类，一些初始化和一些阈值
 */

public class DocumentScan {

    /**
     * 最多能拍照的数量
     */
    public static int MAX_PAGE_NUM = 10;

    /**
     * 预览图按照这个比率缩小进行边框查找
     */
    public static final float SQUARE_FIND_SCALE = 0.25f;

    public static String cacheFolderPath;

    /**
     * 初始化
     *
     * @param context
     */
    public static void init(Context context, String cacheFolderPath) {
        init(context, cacheFolderPath, 10);
    }

    /**
     * 初始化
     *
     * @param context
     * @param cacheFolderPath 临时文件存储的目录
     * @param maxPageNum      最大页数限制
     */
    public static void init(Context context, String cacheFolderPath, int maxPageNum) {
        OpenCVHelper.init();
        DocumentScan.cacheFolderPath = cacheFolderPath;
        MAX_PAGE_NUM = maxPageNum;
    }

}
