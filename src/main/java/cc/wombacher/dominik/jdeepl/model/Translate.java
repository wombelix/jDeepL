/*
 * SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package cc.wombacher.dominik.jdeepl.model;

import java.util.List;
import java.util.Map;

public class Translate {
    private List<Map<String, String>> translations;

    public List<Map<String, String>> getTranslations() {
        return this.translations;
    }
}
