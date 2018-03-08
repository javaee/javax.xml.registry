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

package javax.xml.registry;

import java.util.*;

import javax.xml.registry.infomodel.*;


/**
 * This is the principal interface implemented by a JAXR provider.  
 * A registry client can get this interface from a Connection to a registry. 
 * It provides the methods that are used by the client to discover various capability 
 * specific interfaces implemented by the JAXR provider.
 *
 * @see Connection
 * @author Farrukh S. Najmi
 */
public interface RegistryService {

    /**
     * Returns the CapabilityProfile for the JAXR provider.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the CapabilityProfile for a JAXR provider 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @associates <{javax.xml.registry.CapabilityProfile}>
     * @see LifeCycleManager
     */
    CapabilityProfile getCapabilityProfile() throws JAXRException;


    /**
     * Returns the BusinessLifeCycleManager object implemented by the JAXR provider.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the BusinessLifeCycleManager
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @associates <{javax.xml.registry.BusinessLifeCycleManager}>
     * @see LifeCycleManager
     */
    BusinessLifeCycleManager getBusinessLifeCycleManager() throws JAXRException;

    /**
     * Returns the BusinessQueryManager object implemented by the JAXR provider.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the BusinessQueryManaer
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @associates <{BusinessQueryManager}>
     * @directed
     */
    BusinessQueryManager getBusinessQueryManager() throws JAXRException;

    /**
     * Returns the DeclarativeQueryManager object implemented by the JAXR provider.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the DeclarativeQueryManager
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @associates <{DeclarativeQueryManager}>
     * @directed
     */
    DeclarativeQueryManager getDeclarativeQueryManager() throws JAXRException, UnsupportedCapabilityException;

	/**
	 * Returns the BulkResponse associated with specified requestId.
	 * Once a client retrieves a BulkResponse for a particular requestId
	 * any subsequent calls to retrieve the Bulkresponse for the same requestId
	 * should result in an InvalidRequestException.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param requestId	the id for a previous asynchronous request
	 * @return the BulkResponse that contains the result for the specified request
	 * @throws InvalidRequestException	if no responses exist for specified requestId
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	BulkResponse getBulkResponse(String requestId) throws InvalidRequestException, JAXRException;


    /** 
     * Gets the default user-defined postal scheme for codifying the attributes of PostalAddress.
     *
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the ClassificationScheme that is the default postal scheme
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */ 
    public ClassificationScheme getDefaultPostalScheme()  throws JAXRException; 	

	/** 
	 * Takes a String that is an XML request in a registry-specific 
	 * format, sends the request to the registry, and returns a String that is 
	 * the registry-specific XML response. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param request	the registry-specific request in a String representation
	 * @return the String that is the XML response in a registry-specific manner
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */ 
	public String makeRegistrySpecificRequest(String request) throws JAXRException; 
}
