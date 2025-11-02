package io.github.thebusybiscuit.slimefun4.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Skull;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.profile.PlayerTextures;

import javax.annotation.Nullable;
import java.net.URI;
import java.net.URL;
import java.util.Base64;
import java.util.UUID;

public class Utils {
    private Utils() {}

    public static void applyHeadTexture(Block block, String hashOrBase64OrUrl) {
        applyHeadTexture(block, hashOrBase64OrUrl, null);
    }

    public static void applyHeadTexture(Block block, String hashOrBase64OrUrl, @Nullable UUID stableUuid) {
        if (!(block.getState() instanceof Skull skull)) return;

        URL url = toSkinURL(hashOrBase64OrUrl);
        if (url == null) return;

        PlayerProfile profile = Bukkit.createPlayerProfile(stableUuid != null ? stableUuid : UUID.randomUUID(), null);
        setSkinOnProfile(profile, url);

        skull.setOwnerProfile(profile);
        skull.update(true, false);
    }

    public static ItemStack headItemFromTexture(String hashOrBase64OrUrl) {
        return headItemFromTexture(hashOrBase64OrUrl, null);
    }

    public static ItemStack headItemFromTexture(String hashOrBase64OrUrl, @Nullable UUID stableUuid) {
        URL url = toSkinURL(hashOrBase64OrUrl);
        if (url == null) return new ItemStack(Material.PLAYER_HEAD);

        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) head.getItemMeta();

        PlayerProfile profile = Bukkit.createPlayerProfile(stableUuid != null ? stableUuid : UUID.randomUUID(), null);
        setSkinOnProfile(profile, url);

        meta.setOwnerProfile(profile);
        head.setItemMeta(meta);
        return head;
    }

    @Deprecated
    public static void applyHeadHashToBlock(Block block, String hash) {
        applyHeadTexture(block, hash, null);
    }

    @Deprecated
    public static void applyHeadHashToBlock(Block block, String hash, @Nullable UUID stableUuid) {
        applyHeadTexture(block, hash, stableUuid);
    }

    @Deprecated
    public static ItemStack headItemFromHash(String hash) {
        return headItemFromTexture(hash, null);
    }

    private static void setSkinOnProfile(PlayerProfile profile, URL skinUrl) {
        try {
            PlayerTextures textures = profile.getTextures();
            textures.setSkin(skinUrl);
            profile.setTextures(textures);
        } catch (Exception ignored) {
            //nothing
        }
    }

    @Nullable
    private static URL toSkinURL(String input) {
        try {
            if (isLikelyBase64Json(input)) {
                String json = new String(Base64.getDecoder().decode(input));
                int i = json.indexOf("\"url\":\"");
                if (i >= 0) {
                    int start = i + 7;
                    int end = json.indexOf('"', start);
                    if (end > start) {
                        return URI.create(json.substring(start, end)).toURL();
                    }
                }
                return null;
            }

            if (input.startsWith("http://") || input.startsWith("https://")) {
                return URI.create(input).toURL();
            }

            return URI.create("https://textures.minecraft.net/texture/" + input).toURL();
        } catch (Exception ignored) {
            return null;
        }
    }

    private static boolean isLikelyBase64Json(String s) {
        if (s == null || s.length() < 16) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!((c >= 'A' && c <= 'Z') ||
                    (c >= 'a' && c <= 'z') ||
                    (c >= '0' && c <= '9') ||
                    c == '+' || c == '/' || c == '=')) {
                return false;
            }
        }
        try {
            String decoded = new String(Base64.getDecoder().decode(s));
            return decoded.contains("\"textures\"") || decoded.contains("\"SKIN\"");
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
