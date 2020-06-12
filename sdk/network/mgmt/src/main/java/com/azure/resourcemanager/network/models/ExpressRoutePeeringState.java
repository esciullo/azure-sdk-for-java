// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExpressRoutePeeringState. */
public final class ExpressRoutePeeringState extends ExpandableStringEnum<ExpressRoutePeeringState> {
    /** Static value Disabled for ExpressRoutePeeringState. */
    public static final ExpressRoutePeeringState DISABLED = fromString("Disabled");

    /** Static value Enabled for ExpressRoutePeeringState. */
    public static final ExpressRoutePeeringState ENABLED = fromString("Enabled");

    /**
     * Creates or finds a ExpressRoutePeeringState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressRoutePeeringState.
     */
    @JsonCreator
    public static ExpressRoutePeeringState fromString(String name) {
        return fromString(name, ExpressRoutePeeringState.class);
    }

    /** @return known ExpressRoutePeeringState values. */
    public static Collection<ExpressRoutePeeringState> values() {
        return values(ExpressRoutePeeringState.class);
    }
}