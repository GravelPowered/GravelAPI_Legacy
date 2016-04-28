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

import java.util.List;
import java.util.Optional;

/**
 * The {@link Plugin} manager.
 * From here you can get {@link PluginContainer}s and check if {@link Plugin}s are loaded.
 */
public interface PluginManager {

    /**
     * Gets the {@link PluginContainer} from the given identifier.
     *
     * @param id The {@link Plugin}'s id
     * @return The {@link PluginContainer}
     */
    Optional<PluginContainer> getPlugin(String id);

    /**
     * Gets an immutable {@link List} of the loaded {@link Plugin}s.
     *
     * @return The {@link Plugin}s
     */
    List<PluginContainer> getPlugins();

    /**
     * Checks if a plugin with the given identifier is currently loaded.
     *
     * @param id The {@link Plugin}'s id
     * @return {@code True} if the {@link Plugin} is loaded, {@code false} otherwise.
     */
    boolean isLoaded(String id);
}
