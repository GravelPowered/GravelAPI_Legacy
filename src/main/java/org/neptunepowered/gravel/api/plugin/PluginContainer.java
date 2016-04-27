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

package org.neptunepowered.gravel.api.plugin;

/**
 * A wrapper around {@link Plugin}, to be used when referencing to plugins.
 *
 * <b>NOTE: <i>Plugins DO NOT implement this class!</i></b>
 */
public interface PluginContainer {

    /**
     * Gets the unique identifier for this plugin.
     *
     * @return The plugin's identifier
     * @see Plugin#id()
     */
    String getIdentifier();

    /**
     * Gets the name for this plugin.
     *
     * @return The plugin's name
     * @see Plugin#name()
     */
    String getName();

    /**
     * Gets the version for this plugin.
     *
     * @return The plugin's version
     * @see Plugin#version()
     */
    String getVersion();

    /**
     * Gets the instance of the plugin.
     *
     * @return The plugin's instance
     */
    Object getInstance();
}
