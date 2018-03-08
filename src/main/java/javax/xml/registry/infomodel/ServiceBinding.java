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
 * ServiceBinding instances are RegistryObjects that represent technical information on a specific way to access a specific interface offered by a Service instance. A ServiceBinding may have a set of SpecificationLink instances.
 * Maps to a BindingTemplate in UDDI.
 * 
 * @see Concept
 * @author Farrukh S. Najmi
 */
public interface ServiceBinding extends RegistryObject, URIValidator {

	/** 
	 * Gets the URI that gives access to the service via this binding. 
	 * Default is a NULL String. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the URI that gives access to the service via this binding 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 * 
	 */ 
	String getAccessURI() throws JAXRException;
	
	/** 
	 * Sets the URI that gives access to the service via this binding.
	 * The accessURI is mutually exclusive from targetBinding. JAXR Provider must
	 * throw an InvalidRequestException if an accessURI is set when there is
	 * already a non-null targetBinding defined.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param uri	the URI that gives access to the service via this binding 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */ 
	void setAccessURI(String uri) throws JAXRException;
	
	/** 
	 * Gets the next ServiceBinding in case there is a redirection from
	 * one service provider to another service provider.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the next ServiceBinding in case there is a service redirection
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	ServiceBinding getTargetBinding() throws JAXRException;
	
    /** 
	 * Sets the next ServiceBinding in case there is a redirection.
     * The targetBinding is mutually exclusive from the accessURI. JAXR Provider must
     * throw an InvalidRequestExcpetion if a targetBinding is set when there is
     * already a non-null accessURI defined.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param binding the target ServiceBinding to which this object is redirected to 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void setTargetBinding(ServiceBinding binding) throws JAXRException;
    
	
	
	/** 
	 * Gets the parent service for which this is a binding. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return	the parent Service object 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */ 
	Service getService() throws JAXRException;

    /**
     * @directed
     * @label targetBinding 
     */
    /*#ServiceBinding lnkServiceBinding;*/		

    /** 
	 * Adds a child SpecificationLink. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param specificationLink	the SpecificationLink being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void addSpecificationLink(SpecificationLink specificationLink) throws JAXRException;

    /** 
	 * Adds a Collection of SpecificationLink children. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param specificationLinks	the Collection of SpecificationLinks being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void addSpecificationLinks(Collection specificationLinks) throws JAXRException;

    /** 
	 * Removes a child SpecificationLink. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param specificationLink	the SpecificationLink being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void removeSpecificationLink(SpecificationLink specificationLink) throws JAXRException;

    /** 
	 * Removes a Collection of children SpecificationLinks. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param specificationLinks	the Collection of SpecificationLinks being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void removeSpecificationLinks(Collection specificationLinks) throws JAXRException;


    /** 
     * Gets all children SpecificationLinks. 
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     *
     * @see javax.xml.registry.infomodel.SpecificationLink
     * @return Collection of SpecificationLink instances. The Collection may be empty but not null.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     *
     * @supplierCardinality 1..*
     * @associates <{javax.xml.registry.infomodel.SpecificationLink}>	 
     * @link aggregationByValue
     */
    Collection getSpecificationLinks() throws JAXRException;


    /**
     * @link aggregationByValue
     * @supplierCardinality 1..* 
     */
    /*#SpecificationLink lnkFoo;*/
}
