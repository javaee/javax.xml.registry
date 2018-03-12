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

import java.net.*;

import javax.xml.registry.*;
import java.util.*;

/**
 * User instances are RegistryObjects that are used to provide information about registered users within the registry. Users are affiliated with Organizations. User objects are used in the audit trail for a RegistryObject. 
 *
 * @see Organization
 * @see AuditableEvent
 * @author Farrukh S. Najmi 
 */
public interface User extends RegistryObject {
    /** 
	 * Gets the Organization that this User is affiliated with.
     *
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @return the Organization that this User is affiliated with
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @supplierCardinality 1
     * @associates <{Organization}>
     * @directed
     * @supplierRole affiliatedWith
     * @clientCardinality 1..*
	 */
    Organization getOrganization() throws JAXRException;

    /** 
	 * Returns the name of this User.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the name of this User
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public PersonName getPersonName() throws JAXRException;

    /** 
	 * Sets the name of this User. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param personName	the name of this User
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setPersonName(PersonName personName) throws JAXRException;

    /**
     * Gets the postal address for this User.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @see javax.xml.registry.infomodel.PostalAddress
     * @return Collection of PostalAddress instances. The Collection may be empty but not null.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     *
     * @supplierCardinality 1
     * @associates <{PostalAddress}>
     * @directed
     * @supplierRole addresses
     * @clientCardinality 1..*
     */
    public Collection getPostalAddresses() throws JAXRException;

    /** 
	 * Sets the addresses for this User. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param addresses Is a Collection of PostAddress instances.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void setPostalAddresses(Collection addresses) throws JAXRException;

    /** 
	 * Gets the URL to the web page for this User. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @return the URL for this User's home page
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public URL getUrl() throws JAXRException;
	
    /** 
	 * Sets the URL to the web page for this User. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param url	the URL for this User's home page
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setUrl(URL url) throws JAXRException;

	/** 
	 * Gets the telephone numbers for this User that match the specified telephone number type.
	 *  
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @see javax.xml.registry.infomodel.TelephoneNumber
	 * @return Collection of TelephoneNumber instances. The Collection may be empty but not null.	 
	 * @param phoneType specifies the type of phone numbers to be returned. If phoneType is null, return all telephoneNumbers
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 * @supplierCardinality 1
	 * @associates <{TelephoneNumber}>
	 * @directed
	 * @supplierRole phones
	 * @clientCardinality 1..*
	 */
	public Collection getTelephoneNumbers(String phoneType) throws JAXRException;
	
	/** 
	 * Sets the various telephone numbers for this user.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param phoneNumbers	the Collection of TelephoneNumbers to be set
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setTelephoneNumbers(Collection phoneNumbers) throws JAXRException;
	
	/** 
	 * Gets the email addresses for this User.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @see javax.xml.registry.infomodel.EmailAddress
	 * @return Collection of EmailAddress instances. The Collection may be empty but not null.	 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 *
	 * @supplierCardinality 1
	 * @associates <{EmailAddress}>
	 * @directed
	 * @supplierRole emailAddresses
	 * @clientCardinality 0..*
	 */
	public Collection getEmailAddresses() throws JAXRException;
	
	/** 
	 * Sets the Collection of EmailAddress instances for this User. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param emailAddresses	the Collection of EmailAddresses to be set
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setEmailAddresses(Collection emailAddresses) throws JAXRException;

	/**
	 * Gets the type for this User.
	 * Default is a NULL String. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the type for this User, which is an arbitrary String
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getType() throws JAXRException;

	/**
	 * Sets the type for this User.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param type	the type for this User, which is an arbitrary String
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setType(String type) throws JAXRException;

}
