/*
 * $Id$
 * 
 * This file is a part of jPapaBench providing a Java implementation of
 * PapaBench project. Copyright (C) 2010 Michal Malohlava
 * <michal.malohlava_at_d3s.mff.cuni.cz>
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package papabench.core.autopilot.conf;

import papabench.core.autopilot.modules.Navigator;


/**
 * Vertifal fligt mode - setup by {@link Navigator}.
 * 
 * @see Navigator
 * @author Michal Malohlava
 * 
 *         TODO put here description of each mode TODO this should be generated
 *         according to airplane configuration
 */
public enum VerticalFlightMode {
  MANUAL, AUTO_GAZ, AUTO_CLIMB, AUTO_ALTITUDE, MODE_NB
}
