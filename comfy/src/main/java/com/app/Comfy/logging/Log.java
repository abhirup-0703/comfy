package com.app.Comfy.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1. A "Core" logger for engine-internal logging.
 * 2. A "Client" logger for the game/application using the engine.
 * Initialize it first to use it.
 */
public final class Log {

    private static Logger s_CoreLogger;
    private static Logger s_ClientLogger;

    private Log() {}

    public static void init() {
        s_CoreLogger = LoggerFactory.getLogger("CORE");
        s_ClientLogger = LoggerFactory.getLogger("CLIENT");

        s_CoreLogger.info("Initialized Core Logger!");
        s_ClientLogger.info("Initialized Client Logger!");
    }

    public static Logger getCoreLogger() {
        return s_CoreLogger;
    }

    public static Logger getClientLogger() {
        return s_ClientLogger;
    }

    
    public static void coreTrace(String msg, Object... args) {
        s_CoreLogger.trace(msg, args);
    }

    public static void coreDebug(String msg, Object... args) {
        s_CoreLogger.debug(msg, args);
    }

    public static void coreInfo(String msg, Object... args) {
        s_CoreLogger.info(msg, args);
    }

    public static void coreWarn(String msg, Object... args) {
        s_CoreLogger.warn(msg, args);
    }

    public static void coreError(String msg, Object... args) {
        s_CoreLogger.error(msg, args);
    }

    public static void clientTrace(String msg, Object... args) {
        s_ClientLogger.trace(msg, args);
    }

    public static void clientDebug(String msg, Object... args) {
        s_ClientLogger.debug(msg, args);
    }

    public static void clientInfo(String msg, Object... args) {
        s_ClientLogger.info(msg, args);
    }

    public static void clientWarn(String msg, Object... args) {
        s_ClientLogger.warn(msg, args);
    }

    public static void clientError(String msg, Object... args) {
        s_ClientLogger.error(msg, args);
    }
}