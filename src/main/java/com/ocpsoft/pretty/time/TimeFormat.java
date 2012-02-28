/*
 * PrettyTime is an OpenSource Java time comparison library for creating human
 * readable time.
 * 
 * Copyright (C) 2009 - Lincoln Baxter, III <lincoln@ocpsoft.com>
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see the file COPYING.LESSER3 or visit the
 * GNU website at <http://www.gnu.org/licenses/>.
 */
package com.ocpsoft.pretty.time;


/**
 * Format a Duration object.
 * 
 * @author lb3
 */
public interface TimeFormat
{
    /**
     * Given a populated Duration object. Apply formatting and output the
     * result.
     * 
     * @param duration
     * @return
     */
    public abstract String format(final Duration duration);

    /**
     * Given Duration object apply formating, optional rounding,
     * optional decorating with prefix/suffix and output the result.
     * 
     * @param duration
     * @param doRounding
     * @param doDecorate
     * @return
     */
    public abstract String format(final Duration duration, boolean doRounding, boolean doDecorate);

    
    /**
     * Decorate with prefix/fuffix
     * 
     * @param sign
     * @param result
     * @return
     */
    public String decorate(String value, boolean inThePast);

}