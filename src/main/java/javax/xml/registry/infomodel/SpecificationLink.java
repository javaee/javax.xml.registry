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
 * A SpecificationLink provides the linkage between a ServiceBinding and one of its technical specifications that describes how to use the service using the ServiceBinding. For example, a ServiceBinding may have a SpecificationLink instance that describes how to access the service using a technical specification in the form of a WSDL document or a CORBA IDL document. 
 * It serves the same purpose as the union of the tModelInstanceInfo and instanceDetails structures in
 * UDDI.
 *
 * @see Concept
 * @author Farrukh S. Najmi
 */
public interface SpecificationLink extends RegistryObject {
    /**
     * Gets the specification object for this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the RegistryObject that is the specification object. 
     * 	For a UDDI provider the specification object must be a Concept with no parent.
     * 	For an ebXML provider it is likely to be an ExtrinsicObject.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @associates <{RegistryObject}>
     * @supplierCardinality 1
     * @directed 
     */
    RegistryObject getSpecificationObject() throws JAXRException;

    /**
     * Sets the specification object for this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @param obj the RegistryObject that is the specification object. 
     * 	For a UDDI provider the specification object must be a Concept with no parent.
     * 	For an ebXML provider it is likely to be an ExtrinsicObject.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setSpecificationObject(RegistryObject obj) throws JAXRException;

    /**
     * Gets the description of usage parameters.
	 * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * 
     * @return the usage description for this object, which must not be null
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
	InternationalString getUsageDescription() throws JAXRException;

    /**
     * Sets  the description of usage parameters.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @param usageDescription the description of usage parameters for this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
	void setUsageDescription(InternationalString usageDescription) throws JAXRException;

    /**
     * Gets any usage parameters. A usage parameter is an arbitrary String
	 * that describes how to use the technical specification accessed via this
	 * SpecificationLink. Each parameter is a String.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the Collection of String instances. The Collection may be empty but not null.	 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
     */
	Collection getUsageParameters() throws JAXRException;

    /**
     * Sets any usage parameters. Each parameter is a String
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param usageParameters the Collection of usage parameter Strings
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
	void setUsageParameters(Collection usageParameters) throws JAXRException;


	/**
	 * Gets the parent ServiceBinding for this SpecificationLink.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the parent ServiceBinding within which this object is composed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	ServiceBinding getServiceBinding() throws JAXRException;
}
