package com.xzavier0722.mc.plugin.slimefun4.storage.controller.attributes;

import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalBlockData;
import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalData;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

/**
 * thisproperty用于声明 {@link SlimefunItem} 使用了 {@link SlimefunUniversalData}
 * <p>
 * 当this {@link SlimefunItem} 作is机器时, 对应材质requiresupport
 * 使用 PDC storage容器 (用于识别 UUID).
 * else无法将thisitem/机器绑定到一个通用data上.
 *
 * 查看此处了解support PDC 的item材质:
 * <a href="https://jd.papermc.io/paper/1.21/org/bukkit/block/TileState.html">Paper Doc</a>
 *
 * @author NoRainCity
 *
 * @see SlimefunUniversalData
 * @see SlimefunUniversalBlockData
 */
public interface UniversalBlock {}
