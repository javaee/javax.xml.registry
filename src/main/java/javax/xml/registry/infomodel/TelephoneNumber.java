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
 * A simple re-usable entity class that defines attributes of a telephone number.
 *
 * @author Farrukh S. Najmi 
 */
public interface TelephoneNumber {
    /**
     * Gets the country code. 
     * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the country code
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getCountryCode() throws JAXRException;

    /**
     * Gets the area code. 
     * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the area code
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getAreaCode() throws JAXRException;

    /**
     * Gets the telephone number suffix, not including the country or area code. 
     * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the telephone number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getNumber() throws JAXRException;

    /**
     * Gets the internal extension.
     * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the internal extension number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getExtension() throws JAXRException;

    /**
     * Gets the URL that can dial this number electronically.
     * Default is a NULL String.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the url
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getUrl() throws JAXRException;

    /**
     * The type of telephone number (for example, "fax"). Any String would do.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the type for this TelephoneNumber, which is an arbitrary String
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getType() throws JAXRException;

    /**
     * Sets country code.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param countryCode the country code
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setCountryCode(String countryCode) throws JAXRException;

    /**
     * Sets the area code. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param areaCode the area code
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setAreaCode(String areaCode) throws JAXRException;

    /**
     * Sets the telephone number suffix, not including the country or area code. 
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     * 
	 * @param number	the telephone number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setNumber(String number) throws JAXRException;

    /**
     * Sets the internal extension. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param extension	the internal extension number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setExtension(String extension) throws JAXRException;

    /**
     * Sets the URL that can dial this number electronically.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     * 
	 * @param url the URL string
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setUrl(String url) throws JAXRException;

    /**
     * Sets the type of telephone number (for example, "fax"). Any String will do.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param type the type for this TelephoneNumber, which is an arbitrary String
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setType(String type) throws JAXRException;

}
