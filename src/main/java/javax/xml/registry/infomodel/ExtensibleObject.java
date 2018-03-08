/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2007-2018 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://oss.oracle.com/licenses/CDDL+GPL-1.1
 * or LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package javax.xml.registry.infomodel;

import java.util.*;

import javax.xml.registry.*;

/**
 * An ExtensibleObject is one that allows itself to be extended by utilizing 
 * dynamically added Slots that add arbitrary attributes to the object on a 
 * per instance basis.
 * 
 * @see Slot
 * @author Farrukh S. Najmi  
 */
public interface ExtensibleObject {
    /** 
	 * Adds a Slot to this object. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param slot	the Slot object being added to this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void addSlot(Slot slot) throws JAXRException;

    /**
     *
     * Adds more Slots to this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @param slots	the Collection of Slot objects being added to this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @supplierCardinality 0..*
     * @associates <{Slot}>
     * @undirected
     * @supplierRole slots
     * @link aggregationByValue
     */
    void addSlots(Collection slots) throws JAXRException;

    /** 
	 * Removes a Slot from this object. The Slot is identified by its name. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param slotName	the name for the Slot object being removed from this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void removeSlot(String slotName) throws JAXRException;

    /**
     * Removes specified Slots from this object. The Slots are identified by its name.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @param slotNames	the Collection of names for Slot objects being removed from this object. Must be a Collection of Strings
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @supplierCardinality 0..*
     * @associates <{Slot}>
     * @undirected
     * @supplierRole slots
     * @link aggregationByValue
     */
    void removeSlots(Collection slotNames) throws JAXRException;

	/**
	 * Gets the slot specified by slotName.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param slotName the name of the desired Slot object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	Slot getSlot(String slotName) throws JAXRException;
	
    /**
     * Returns the Slots associated with this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @return Collection of Slot instances. The Collection may be empty but not null.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @supplierCardinality 0..*
     * @associates <{Slot}>
     * @undirected
     * @supplierRole slots
     * @link aggregationByValue
     */
    Collection getSlots() throws JAXRException;
	
}
