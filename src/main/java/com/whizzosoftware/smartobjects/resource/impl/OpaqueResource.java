/*******************************************************************************
 * Copyright (c) 2015 Whizzo Software, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.whizzosoftware.smartobjects.resource.impl;

import com.whizzosoftware.smartobjects.resource.AbstractResource;
import com.whizzosoftware.smartobjects.resource.InvalidResourceException;
import com.whizzosoftware.smartobjects.resource.ResourceClass;

public class OpaqueResource extends AbstractResource<Object> {
    public OpaqueResource(ResourceClass resourceClass, int instanceId) throws InvalidResourceException {
        super(resourceClass, instanceId, null);
    }
}
