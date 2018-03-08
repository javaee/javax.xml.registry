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
 * PostalAddress is a simple re-usable entity class that defines attributes of a postal Address.
 *
 * @author Farrukh S. Najmi
 */
public interface PostalAddress extends ExtensibleObject  {
	/** 
	 * Returns the street name. 
	 * Default is an empty String.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the street name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getStreet() throws JAXRException;
	
	/** 
	 * Sets the street name.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param street the street name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setStreet(String street) throws JAXRException;
	
	/** 
	 * Returns the street number.
	 * Default is an empty String.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the street number
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getStreetNumber() throws JAXRException;
	
	/** 
	 * Sets the street number. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param streetNumber the street number
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setStreetNumber(String streetNumber) throws JAXRException;

	/** 
	 * Returns the city. 
	 * Default is an empty String.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the city
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getCity() throws JAXRException;
	
	/** 
	 * Sets the city. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param city the city
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setCity(String city) throws JAXRException;
	
	/** 
	 * Returns the state or province.
	 * Default is an empty String.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the state or province
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getStateOrProvince() throws JAXRException;
	
	/** 
	 * Sets the state or province.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param stateOrProvince	the state or province
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setStateOrProvince(String stateOrProvince) throws JAXRException;
	
	/** 
	 * Returns the postal or zip code.
	 * Default is an empty String.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the postal code (e.g. US zip code)
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getPostalCode() throws JAXRException;
	
	/** 
	 * Sets the postal or zip code.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param postalCode the postal code (e.g. US zip code)
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setPostalCode(String postalCode) throws JAXRException;
	
	/** 
	 * Returns the country. 
	 * Default is an empty String.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the country
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getCountry() throws JAXRException;

    /** 
	 * Sets the country.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param country	the country
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setCountry(String country) throws JAXRException;

    /**
     * Returns the type of address (for example, "headquarters") as a String.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @return the type for this PostalAddress. This is an arbitrary String (e.g. "Home", "Office") 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getType() throws JAXRException;

    /**
     * Sets the type of address (for example, "headquarters") as a String.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @param type	the type for this PostalAddress. This is an arbitrary String (e.g. "Home", "Office") 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setType(String type) throws JAXRException;
	
    /** 
	 * Sets a user-defined postal scheme for codifying the attributes of PostalAddress.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param scheme	the user defined postal scheme.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */ 
    public void setPostalScheme(ClassificationScheme scheme)  throws JAXRException; 	

    /** 
	 * Returns a user-defined postal scheme for codifying the attributes of PostalAddress.
	 * If none is defined for this object, then must return the default value
	 * returned by RegistryService#getDefaultPostalScheme()
	 *
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @see javax.xml.registry.RegistryService#getDefaultPostalScheme()
	 * @return the user defined postal scheme.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */ 
    public ClassificationScheme getPostalScheme()  throws JAXRException; 
	
}
