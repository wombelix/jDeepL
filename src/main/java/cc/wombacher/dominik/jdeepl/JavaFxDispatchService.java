/*
 * SPDX-FileCopyrightText: 2017 Alex Barker - https://stackoverflow.com/a/45423466
 *
 * SPDX-License-Identifier: CC-BY-SA-4.0
 */

package cc.wombacher.dominik.jdeepl;

import javafx.application.Platform;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public class JavaFxDispatchService extends AbstractExecutorService {
    private boolean running = false;

    public JavaFxDispatchService() {
        running = true;
    }

    public void shutdown() {
        running = false;
    }

    public List<Runnable> shutdownNow() {
        running = false;
        return new ArrayList<Runnable>(0);
    }

    public boolean isShutdown() {
        return !running;
    }

    public boolean isTerminated() {
        return !running;
    }

    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return true;
    }

    public void execute(Runnable r) {
        Platform.runLater(r);
    }
}
