/* 
 * Copyright (C) 2015 www.phantombot.net
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package me.mast3rplan.phantombot.jerklib.events;

import me.mast3rplan.phantombot.jerklib.Session;

public class ErrorEvent extends IRCEvent
{

    private final ErrorType errorType;

    public enum ErrorType
    {

        NUMERIC_ERROR,
        UNRESOLVED_HOSTNAME,
        GENERIC
    }

    public ErrorEvent(String data, Session session, ErrorType errorType)
    {
        super(data, session, Type.ERROR);
        this.errorType = errorType;
    }

    /**
     * Get the error type
     *
     * @return ErrorType
     */
    public ErrorType getErrorType()
    {
        return errorType;
    }
}