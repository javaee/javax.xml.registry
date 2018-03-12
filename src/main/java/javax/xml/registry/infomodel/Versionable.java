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

import java.util.*;

import javax.xml.registry.*;

/**
 * The Versionable interface defines the behavior common to classes that 
 * are capable of creating versions of their instances. At present all 
 * RegistryEntry classes are required to implement the Versionable interface. 
 *
 * @see RegistryEntry 
 * @author Farrukh S. Najmi 
 */
public interface Versionable {
    /**
     * Gets the major revision number for this version of the Versionable object. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the major version for this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    int getMajorVersion() throws JAXRException;

    /**
     * Sets the major revision number for this version of the Versionable object. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param majorVersion	the major version number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setMajorVersion(int majorVersion) throws JAXRException;

    /**
     * Gets the minor revision number for this version of the Versionable object. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
     * @return the minor version for this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    int getMinorVersion() throws JAXRException;

    /**
     * Sets the minor revision number for this version of the Versionable object. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
     * @param minorVersion	the minor version number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setMinorVersion(int minorVersion) throws JAXRException;

    /**
     * Gets the user-specified revision number for this version of the Versionable object. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
     * @return the user-defined version number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    String getUserVersion() throws JAXRException;

    /**
     * Sets the user specified revision number for this version of the Versionable object. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
     * @param userVersion	the user-defined version number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setUserVersion(String userVersion) throws JAXRException;
}
