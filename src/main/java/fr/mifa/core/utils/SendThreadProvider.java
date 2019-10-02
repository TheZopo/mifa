package fr.mifa.core.utils;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

public enum SendThreadProvider {
    INSTANCE;

    private ExecutorService executorService;

    public ExecutorService getExecutorService() {
        return executorService;
    }

    SendThreadProvider() {
        executorService = newSingleThreadExecutor();
    }
}
