/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ext.postgresql.model;

import org.jkiss.dbeaver.model.DBPNamedObject;

/**
 * PostgreAttributeIdentity
 */
public enum PostgreAttributeIdentity implements DBPNamedObject {
    GENERATED_ALWAYS("a", "Always", "GENERATED ALWAYS AS IDENTITY"),
    GENERATED_BY_DEFAULT("d", "By Default", "GENERATED BY DEFAULT AS IDENTITY");

    private String code;
    private String name;
    private String definitionClause;

    PostgreAttributeIdentity(String code, String name, String definitionClause) {
        this.code = code;
        this.name = name;
        this.definitionClause = definitionClause;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    public static PostgreAttributeIdentity getByCode(String code) {
        for (PostgreAttributeIdentity id : values()) {
            if (id.code.equals(code)) {
                return id;
            }
        }
        return null;
    }

    public String getDefinitionClause() {
        return definitionClause;
    }
}