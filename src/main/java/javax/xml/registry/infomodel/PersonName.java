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
 * Represents a person's name.
 *
 * @author Farrukh S. Najmi
 */
public interface PersonName {
    /** 
	 * Gets the last name (surname) for this Person. 
	 * Default is a NULL String. 
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @return the person's last name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public String getLastName() throws JAXRException;

    /** 
	 * Sets the last name (surname) for this Person. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param lastName	 the person's last name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setLastName(String lastName) throws JAXRException;

    /** 
	 * Gets the first name for this Person. 
	 * Default is an empty String.
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @return the person's first name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public String getFirstName() throws JAXRException;

    /** 
	 * Sets the first name for this Person. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param firstName the person's first name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setFirstName(String firstName) throws JAXRException;

    /** 
	 * Gets the middle name for this Person. 
	 * Default is an empty String.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @return the person's middle name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public String getMiddleName() throws JAXRException;
	
	/** 
	 * Sets the middle name for this Person. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param middleName the person's middle name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setMiddleName(String middleName) throws JAXRException;
	
	/** 
	 * Gets the fully formatted name for this person.
	 * Default is an empty String.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the person's full name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getFullName() throws JAXRException;

	/** 
	 * Sets the fully formatted name for this person.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param fullName	the person's full name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setFullName(String fullName) throws JAXRException;
}

