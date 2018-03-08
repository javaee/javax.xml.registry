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

import javax.xml.registry.*;

import java.util.*;

/**
 * Service instances are RegistryObjects that provide information on services 
 * (for example, web services) offered by an Organization. A Service may have a set of ServiceBinding instances. 
 * Maps to a BusinessService in UDDI.
 *
 * @see ServiceBinding
 * @author Farrukh S. Najmi
 */
public interface Service extends RegistryEntry {

	/** 
	 * Gets the Organization that provides this service.
	 * Providing Organization may be null. The providing
	 * Organization may be different from the Submitting Organization
	 * as defined by RegistryObject#getSubmittingOrganization.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see RegistryObject#getSubmittingOrganization()
	 * @return the Organization that provides this service
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 *
	 */
	Organization getProvidingOrganization() throws JAXRException;

	/** 
	 * Sets the Organization that provides this service. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param providingOrganization	the Organization that provides this service
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void setProvidingOrganization(Organization providingOrganization) throws JAXRException;

	/** 
	 * Adds a child ServiceBinding.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param serviceBinding	the ServiceBinding being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void addServiceBinding(ServiceBinding serviceBinding) throws JAXRException;

	/** 
	 * Adds a Collection of ServiceBinding children.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param serviceBindings	the Collection of ServiceBindings being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void addServiceBindings(Collection serviceBindings) throws JAXRException;

	/** 
	 * Removes a child ServiceBinding.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param serviceBinding	the ServiceBinding being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void removeServiceBinding(ServiceBinding serviceBinding) throws JAXRException;

	/** 
	 * Removes a Collection of children ServiceBindings.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param serviceBindings	the Collection of ServiceBindings being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void removeServiceBindings(Collection serviceBindings) throws JAXRException;

	/** 
	 * Gets all children ServiceBindings. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 
	 *
	 * @see javax.xml.registry.infomodel.ServiceBinding
	 * @return Collection of ServiceBinding instances. The Collection may be empty but not null.	 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 *
	 * @supplierCardinality 1..*
	 * @associates <{javax.xml.registry.infomodel.ServiceBinding}>	 
	 * @link aggregationByValue
	 */
	Collection getServiceBindings() throws JAXRException;

}
