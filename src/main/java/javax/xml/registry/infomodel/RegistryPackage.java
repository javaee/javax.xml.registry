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
 * RegistryPackage instances are RegistryEntries that group logically related 
 * RegistryEntries together.
 * A package may contain any number of RegistryObjects. A RegistryObject may be a member of any number of Packages.
 *
 * @see RegistryObject
 * @author Farrukh S. Najmi
 */
public interface RegistryPackage extends RegistryEntry {
	/** 
	 * Adds a child RegistryObject as member. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param registryObject	the RegistryObject being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void addRegistryObject(RegistryObject registryObject) throws JAXRException;

	/** 
	 * Adds a Collection of RegistryObject children as members.
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param registryObjects	the Collection of RegistryObjects being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void addRegistryObjects(Collection registryObjects) throws JAXRException;

	/** 
	 * Removes a child RegistryObject from membership. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param registryObject	the RegistryObject being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void removeRegistryObject(RegistryObject registryObject) throws JAXRException;

	/** 
	 * Removes a Collection of children RegistryObjects from membership.
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param registryObjects	the Collection of RegistryObject being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void removeRegistryObjects(Collection registryObjects) throws JAXRException;

    /**
     * Gets the collection of member RegistryObjects of this RegistryPackage.
     * 	 	 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
     * @return the Set of RegistryObjects that are members of this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    Set getRegistryObjects() throws JAXRException;
}
