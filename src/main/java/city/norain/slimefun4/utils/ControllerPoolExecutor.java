package city.norain.slimefun4.utils;

import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.annotation.Nonnull;

public class ControllerPoolExecutor extends ThreadPoolExecutor {
    private final String name;

    public ControllerPoolExecutor(
            String name,
            int corePoolSize,
            int maximumPoolSize,
            long keepAliveTime,
            @Nonnull TimeUnit unit,
            @Nonnull BlockingQueue<Runnable> workQueue,
            @Nonnull ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);

        this.name = name;
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);

        if (t != null) {
            Slimefun.logger()
                    .log(
                            Level.WARNING,
                            "An error occurred in " + name + "("
                                    + Thread.currentThread().getName() + ")",
                            t);
        }

        if (r instanceof FutureTask<?> future) {
            try {
                future.get();
            } catch (Exception e) {
                Slimefun.logger()
                        .log(
                                Level.WARNING,
                                "An error occurred in " + name + "("
                                        + Thread.currentThread().getName() + ")",
                                t);
            }
        }
    }
}
