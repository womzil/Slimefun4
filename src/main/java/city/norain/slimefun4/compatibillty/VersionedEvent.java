package city.norain.slimefun4.compatibillty;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.logging.Level;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.bukkit.ExplosionResult;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockExplodeEvent;

@UtilityClass
public class VersionedEvent {
    private Constructor<BlockExplodeEvent> blockExplodeConstructor;

    public void init() {
        if (Slimefun.getMinecraftVersion().isBefore(MinecraftVersion.MINECRAFT_1_21)) {
            try {
                blockExplodeConstructor = BlockExplodeEvent.class.getConstructor(Block.class, List.class, float.class);
            } catch (NoSuchMethodException e) {
                Slimefun.logger().log(Level.WARNING, "无法初始化事件版本兼容模块, 部分功能可能无法正常使用", e);
            }
        }
    }

    @SneakyThrows
    public BlockExplodeEvent newBlockExplodeEvent(Block block, List<Block> affectedBlock, float yield) {
        if (Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_21)) {
            return new BlockExplodeEvent(block, block.getState(), affectedBlock, yield, ExplosionResult.DESTROY);
        } else {
            if (blockExplodeConstructor == null) {
                throw new IllegalStateException("Unable to create BlockExplodeEvent: missing constructor");
            }
            return blockExplodeConstructor.newInstance(block, affectedBlock, yield);
        }
    }
}
