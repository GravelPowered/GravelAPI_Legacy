/*
 * This file is part of GravelAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016, Jamie Mansfield <https://github.com/jamierocks>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.neptunepowered.gravel.api;

import com.google.common.base.Preconditions;
import org.neptunepowered.gravel.api.command.CommandManager;
import org.neptunepowered.gravel.api.event.EventManager;
import org.neptunepowered.gravel.api.plugin.PluginManager;

/**
 * Allows for static access to the {@link System}.
 */
public final class Gravel {

    private static final System system = null;

    /**
     * Gets the {@link System}.
     *
     * @return The system
     */
    public static System getSystem() {
        Preconditions.checkNotNull(system, "Gravel not yet initialised!");
        return system;
    }

    /**
     * Gets the {@link Server}.
     *
     * @return The server
     * @see System#getServer()
     */
    public static Server getServer() {
        return getSystem().getServer();
    }

    /**
     * Gets the {@link CommandManager}.
     *
     * @return The command manager
     * @see System#getCommandManager()
     */
    public static CommandManager getCommandManager() {
        return getSystem().getCommandManager();
    }

    /**
     * Gets the {@link EventManager}.
     *
     * @return The event manager
     * @see System#getEventManager()
     */
    public static EventManager getEventManager() {
        return getSystem().getEventManager();
    }

    /**
     * Gets the {@link PluginManager}.
     *
     * @return The plugin manager
     * @see System#getPluginManager()
     */
    public static PluginManager getPluginManager() {
        return getSystem().getPluginManager();
    }
}
