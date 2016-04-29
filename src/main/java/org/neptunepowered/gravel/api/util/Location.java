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

package org.neptunepowered.gravel.api.util;

import com.flowpowered.math.vector.Vector3d;
import org.neptunepowered.gravel.api.world.World;

/**
 * Represents a 3-dimensional position within a {@link World}.
 */
public class Location extends Vector3d {

    private final World world;

    public Location(World world, double x, double y, double z) {
        super(x, y, z);
        this.world = world;
    }

    public Location(World world, Vector3d vector3d) {
        this(world, vector3d.getX(), vector3d.getY(), vector3d.getZ());
    }

    /**
     * Gets the {@link World} of which this location is within.
     *
     * @return The world
     */
    public World getWorld() {
        return this.world;
    }
}
