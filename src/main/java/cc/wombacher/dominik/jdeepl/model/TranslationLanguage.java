/*
 * SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package cc.wombacher.dominik.jdeepl.model;

public class TranslationLanguage {
    private String id;
    private String name;

    public TranslationLanguage(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
