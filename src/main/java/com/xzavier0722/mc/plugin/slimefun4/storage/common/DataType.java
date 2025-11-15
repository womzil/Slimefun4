package com.xzavier0722.mc.plugin.slimefun4.storage.common;

/**
 * {@link DataType} 是 Slimefun database控制器的type，
 * 用于区分不同的datastoragetype。
 */
public enum DataType {
    /**
     * player档案，通常包含研究进度、背包等其他player相关data。
     */
    PLAYER_PROFILE,

    /**
     * Slimefun blockdata
     */
    BLOCK_STORAGE
}
