/*
 * SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package cc.wombacher.dominik.jdeepl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Usage {
    @JsonProperty("character_count")
    private Integer usageCharacterCount;
    @JsonProperty("character_limit")
    private Integer usageCharacterLimit;


    public Integer getUsageCharacterCount() {
        return this.usageCharacterCount;
    }
    public Integer getUsageCharacterLimit() {
        return this.usageCharacterLimit;
    }
    @Override
    public String toString() {
        return this.usageCharacterCount + " / " + this.usageCharacterLimit;
    }
}
