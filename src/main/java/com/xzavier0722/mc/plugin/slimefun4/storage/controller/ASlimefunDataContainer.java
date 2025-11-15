package com.xzavier0722.mc.plugin.slimefun4.storage.controller;

import lombok.Getter;
import lombok.Setter;

/**
 * Slimefun data容器的抽象类.
 * <p>
 * 该类用于storage Slimefun 特有的data容器, 包括 Slimefun ID 和whether待delete的标志.
 *
 * @author NoRainCity
 *
 * @see ADataController
 */
public abstract class ASlimefunDataContainer extends ADataContainer {
    @Getter
    private final String sfId;

    @Setter
    @Getter
    private volatile boolean pendingRemove = false;

    public ASlimefunDataContainer(String key, String sfId) {
        super(key);
        this.sfId = sfId;
    }

    public ASlimefunDataContainer(String key, ADataContainer other, String sfId) {
        super(key, other);
        this.sfId = sfId;
    }
}
