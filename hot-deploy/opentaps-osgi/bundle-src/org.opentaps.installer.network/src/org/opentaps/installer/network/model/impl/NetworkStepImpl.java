/*
 * Copyright (c) 2006 - 2010 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.opentaps.installer.network.model.impl;

import org.opentaps.installer.network.model.NetworkStepModel;
import org.opentaps.installer.service.InstallerStep;


/**
 *
 *
 */
public class NetworkStepImpl implements InstallerStep, NetworkStepModel {

    /** {@inheritDoc} */
    public void perform() {
    }

    /** {@inheritDoc} */
    public void rollback() {
    }

    public String actionUrl() {
        return "/osgi/network/pages/NetworkWizard.html";
    }

}