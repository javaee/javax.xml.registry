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

/**
 * ExternalIdentifier instances provide the additional identifier information 
 * to RegistryObjects such as DUNS number, Social Security Number, or an alias 
 * name of the organization.  The attribute name inherited from RegistryObject is 
 * used to contain the identification scheme ("DUNS" "Social Security Number", etc.), 
 * and the attribute value contains the actual information (e.g. the actual DUNS number). 
 * Each RegistryObject may have 0 or more ExternalIdentifiers.
 *
 * @see RegistryObject
 * @author Farrukh S. Najmi   
 */
public interface ExternalIdentifier extends RegistryObject {

	/** 
	 * Gets the parent RegistryObject for this ExternalIdentifier.
	 * To set the registryObject call addExternalIdentifier on a RegistryObject.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 
	 *
	 * @see RegistryObject#addExternalIdentifier(ExternalIdentifier ei)
	 * @return	the RegistryObject that this object identifies 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	RegistryObject getRegistryObject() throws JAXRException;

	/** 
	 * Gets the value of an ExternalIdentifier.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return	the identification value defined by this object (e.g. a company's DUNS number)
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getValue() throws JAXRException;
	
	/** 
	 * Sets the value of an ExternalIdentifier.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param value	the identification value defined by this object (e.g. a company's DUNS number)
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setValue(String value) throws JAXRException;

    /**
     * Gets the ClassificationScheme that is used as the identification scheme
     * for identifying this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the ClassificationScheme that is used as the identification scheme (e.g. "DUNS")
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @supplierCardinality 0..*
     * @clientCardinality 0..*
     * @associationAsClass Classification
     */
    ClassificationScheme getIdentificationScheme() throws JAXRException;

    /** 
     * Sets the ClassificationScheme that is used as the identification scheme
	 * for identifying this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param identificationScheme	the ClassificationScheme that is used as the identification scheme (e.g. "DUNS")
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setIdentificationScheme(ClassificationScheme identificationScheme) throws JAXRException;
}
