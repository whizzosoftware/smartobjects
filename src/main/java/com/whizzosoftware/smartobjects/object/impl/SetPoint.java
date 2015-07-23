/*******************************************************************************
 * Copyright (c) 2015 Whizzo Software, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.whizzosoftware.smartobjects.object.impl;

import com.whizzosoftware.smartobjects.object.AbstractSmartObject;
import com.whizzosoftware.smartobjects.resource.ResourceConstants;

public class SetPoint extends AbstractSmartObject {
    public static final int ID = 3308;
    public static final String URN = "urn:oma:lwm2m:ext:3308";

    public SetPoint(int instanceId) {
        this(instanceId, null);
    }

    public SetPoint(int instanceId, Float value) {
        super(ID, instanceId, URN);
        setValue(value);
    }

    public void setValue(Float value) {
        setResourceValue(ResourceConstants.SetPointValue, 0, value);
    }

    public void setColour(String value) {
        setResourceValue(ResourceConstants.Colour, 0, value);
    }

    public void setUnits(String units) {
        setResourceValue(ResourceConstants.Units, 0, units);
    }

    public void setApplicationType(String type) {
        setResourceValue(ResourceConstants.ApplicationType, 0, type);
    }
}
