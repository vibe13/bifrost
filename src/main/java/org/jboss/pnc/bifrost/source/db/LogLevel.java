/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2020-2022 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.pnc.bifrost.source.db;

public enum LogLevel {

    TRACE(0), DEBUG(1), INFO(2), WARN(3), ERROR(4), FATAL(5);

    private final int intLevel;

    LogLevel(int intLevel) {
        this.intLevel = intLevel;
    }

    public static LogLevel parse(String level) {
        if (level != null) {
            String levelUpper = level.toUpperCase();
            if (levelUpper.equals("FINE")) {
                return LogLevel.TRACE;
            } else if (levelUpper.equals("FINER")) {
                return LogLevel.TRACE;
            } else if (levelUpper.equals("FINEST")) {
                return LogLevel.TRACE;
            } else if (levelUpper.equals("SEVERE")) {
                return LogLevel.FATAL;
            } else {
                return LogLevel.valueOf(levelUpper);
            }
        } else {
            return null;
        }
    }

    public int intLevel() {
        return intLevel;
    }
}
