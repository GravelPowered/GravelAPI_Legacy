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

import com.flowpowered.math.vector.Vector3d;
import org.neptunepowered.gravel.api.command.CommandSource;

import java.util.Optional;

/**
 * Represents the Minecraft server.
 */
public interface Server extends CommandSource {

    /**
     * Checks if the server is running in online mode or not.
     *
     * @return {@code True} if the server is in online mode, {@code false} otherwise
     */
    boolean getOnlineMode();

    /**
     * Safely shuts down the server.
     */
    void shutdown();

    /**
     * {@inheritDoc}
     */
    @Override
    default String getName() {
        return "Server";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    default Optional<Vector3d> getLocation() {
        return Optional.empty();
    }
}
