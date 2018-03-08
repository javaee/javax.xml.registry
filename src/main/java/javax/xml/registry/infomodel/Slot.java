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
 * Slot instances provide a dynamic way to add arbitrary attributes to 
 * RegistryObject instances. This ability to add attributes dynamically 
 * to RegistryObject instances enables extensibility within the Registry 
 * Information Model. 
 * <p>
 * A RegistryObject may have 0 or more Slots. A slot is composed of a name, 
 * a slotType and a collection of values. The name of a slot is locally unique 
 * within the RegistryObject instance. Similarly, the value of a Slot is 
 * locally unique within a slot instance. Since a Slot represents an 
 * extensible attribute whose value may be a collection, a 
 * Slot is allowed to have a collection of values rather than a single value. 
 * The slotType attribute may optionally specify a type or category for the slot.
 *
 * @see ExtensibleObject
 * @author Farrukh S. Najmi 
 */
public interface Slot {

	/**
	 * Gets the name for this Slot.
	 * Default is a NULL String. 
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the name 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public String getName() throws JAXRException;

    /**
     * Sets the name for this Slot.
     * Default is a NULL String. 
     * 
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 @param name	the name
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setName(String name) throws JAXRException;

    /**
     * Gets the slotType for this Slot.
     * Default is a NULL String.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the slot type which is an arbitrary String
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getSlotType() throws JAXRException;

    /**
     * Sets the slotType for this Slot.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param slotType	the slot type which is an arbitrary String
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setSlotType(String slotType) throws JAXRException;

    /**
     * Gets the values for this Slot.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	
	 * 
     * @see java.lang.String
     * @return Collection of String instances representing the values for this Slot. The Collection may be empty but not null.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     *
     */
    public Collection getValues() throws JAXRException;

    /**
     * Sets the values for this Slot.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param values the values for this Slot
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setValues(Collection values) throws JAXRException;
	
	/**
	 * Name for pre-defined Slot used in PostalAddress by JAXR UDDI provider.
	 */
	public static final String SORT_CODE_SLOT = "sortCode";

	/**
	 * Name for pre-defined Slot used in PostalAddress by JAXR UDDI provider.
	 */
	public static final String ADDRESS_LINES_SLOT = "addressLines";		

	/**
	 * Name for pre-defined Slot used in Organization and ClassificationScheme by JAXR UDDI provider.
	 */
	public static final String AUTHORIZED_NAME_SLOT = "authorizedName";

	/**
	 * Name for pre-defined Slot used in Organization and ClassificationScheme by JAXR UDDI provider.
	 */
	public static final String OPERATOR_SLOT = "operator";

}
