package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.utils.NumberUtils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This class stores some startup warnings we occasionally need to print.
 * If you setup your server the recommended way, you are never going to see
 * any of these messages.
 *
 * @author TheBusyBiscuit
 *
 */
final class StartupWarnings {

    private static final String BORDER = "****************************************************";
    private static final String PREFIX = "* ";

    private StartupWarnings() {}

    @ParametersAreNonnullByDefault
    static void discourageCSCoreLib(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "似乎你还在使用 CS-CoreLib。");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Slimefun 自 2021/01/30 起");
        logger.log(Level.SEVERE, PREFIX + "就不再强制depend CS-CoreLib 了，");
        logger.log(Level.SEVERE, PREFIX + "你require移除 CS-CoreLib");
        logger.log(Level.SEVERE, PREFIX + "才能让 Slimefun 正常运row。");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidMinecraftVersion(Logger logger, int majorVersion, String slimefunVersion) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Slimefun 未被正确安装!");
        logger.log(Level.SEVERE, PREFIX + "你正在使用不support的 Minecraft version!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "你正在使用 Minecraft 1.{0}.x", majorVersion);
        logger.log(Level.SEVERE, PREFIX + "但 Slimefun {0} 只support", slimefunVersion);
        logger.log(Level.SEVERE, PREFIX + "Minecraft {0}", String.join(" / ", Slimefun.getSupportedVersions()));
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidServerSoftware(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Slimefun 未被正确安装!");
        logger.log(Level.SEVERE, PREFIX + "我们不再support CraftBukkit serviceserver了!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Slimefun require你使用 Spigot, Paper");
        logger.log(Level.SEVERE, PREFIX + "or者 Spigot/Paper 分支的任意serviceserver.");
        logger.log(Level.SEVERE, PREFIX + "(我们推荐 Paper)");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void oldJavaVersion(Logger logger, int recommendedJavaVersion) {
        int javaVersion = NumberUtils.getJavaVersion();

        logger.log(Level.WARNING, BORDER);
        logger.log(Level.WARNING, PREFIX + "正在使用的 Java version (Java {0}) 已过时.", javaVersion);
        logger.log(Level.WARNING, PREFIX);
        logger.log(Level.WARNING, PREFIX + "由于高version Minecraft 对 Java {0} 的强制depend,", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "我们推荐您尽快升level到 Java {0}.", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "同时，is尽快使用到新versionJava带来的feature,");
        logger.log(Level.WARNING, PREFIX + "Slimefun 也会在不久的将来depend于 Java {0}.", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "is了不影响您以后的正常使用，请尽快update!");
        logger.log(Level.WARNING, BORDER);
    }
}
