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
 * This interface represents a String that has been internationalized into several Locales.
 * This interface is used as a replacement for the String type whenever a String attribute needs to be I18N capable. An instance of the InternationalString interface composes within it a Collection of LocalizedString instances, where each String is specific to a particular Locale. The InternationalString interface provides set/get methods for adding or getting locale specific String values for the InternationalString instance.
 *
 *
 * @see LocalizedString
 * @author Farrukh S. Najmi
 */
public interface InternationalString {
	/**
	 * Gets the String value for the Locale returned by Locale.getDefault().
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the String value for the Locale returned by Locale.getDefault()
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    String getValue() throws JAXRException;
	
    /**
     * Gets the String value for the specified Locale. Return null if no locale specific
	 * value is found for the specified locale.
	 *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param locale	The Locale for the desired value
	 * @return the String value for the specified Locale
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    String getValue(Locale locale) throws JAXRException;

    /**
     * Sets the String value for the Locale returned by Locale.getDefault().
	 *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param value	the String value for the Locale returned by Locale.getDefault()
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setValue(String value) throws JAXRException;

    /**
     * Sets the String value for the specified Locale.
	 *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param locale	The locale for this value being set
	 * @param value		The value being set
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setValue(Locale locale, String value) throws JAXRException;
	
    /** 
	 * Adds a LocalizedString to this object. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param localizedString	the LocalizedString being added to this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void addLocalizedString(LocalizedString localizedString) throws JAXRException;

    /**
     *
     * Adds many LocalizedStrings to this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param localizedStrings	the Collection of LocalizedStrings being added to this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void addLocalizedStrings(Collection localizedStrings) throws JAXRException;

    /** 
	 * Removes a LocalizedString from this object. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param localizedString	the LocalizedString being removed from this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void removeLocalizedString(LocalizedString localizedString) throws JAXRException;

    /**
     * Removes specified LocalizedStrings to this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @param localizedStrings	the Collection of LocalizedStrings being removed from this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void removeLocalizedStrings(Collection localizedStrings) throws JAXRException;

	/**
	 * Gets the LocalizedString for the specified Locale and charsetName.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param locale	The loacle for the desired LocalizedStrings
	 * @param charsetName	The character set name for the desired LocalizedStrings
	 * @return the LocalizedString that matches specified locale and character set
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	LocalizedString getLocalizedString(Locale locale, String charsetName) throws JAXRException;
	

    /**
     * Returns the LocalizedStrings associated with this object.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL>
	 * 
     * @see javax.xml.registry.infomodel.LocalizedString
     * @return Collection of LocalizedString instances. The Collection may be empty but not null.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    Collection getLocalizedStrings() throws JAXRException;
	
}
