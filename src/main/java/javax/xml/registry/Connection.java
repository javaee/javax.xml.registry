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

package javax.xml.registry;

import javax.xml.registry.infomodel.*;
import java.util.*;



/**
 * This class represents a connection between a JAXR client and a
 * JAXR provider.
 *
 * @see ConnectionFactory
 * @author Farrukh S. Najmi
 */
public interface Connection {

    /**
     * Gets the RegistryService interface associated with the Connection.
	 * If a Connection property (e.g. credentials) is set after the client calls getRegistryService
	 * then the newly set Connection property is visible to the RegistryService
	 * previously returned by this call.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the RegistryService associated with this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @associates <{RegistryService}>
     * @see RegistryService
     */
	RegistryService getRegistryService() throws JAXRException;

    /**
	 * Closes a Connection when it is no longer needed.
     * Since a provider typically allocates significant resources outside 
     * the JVM on behalf of a Connection, clients should close them when
     * they are not needed.
     *
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void close() throws JAXRException;
	
	/**
	 * Indicated whether this Connection has been closed or not.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return <code>true</code> if Connection is closed; <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	boolean isClosed() throws JAXRException;

	/**
	 * Indicates whether a client uses synchronous communication with JAXR provider or not.
	 * A JAXR provider must support both modes
	 * of communication. A JAXR client can choose which mode it wants to use.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return <code>true</code> if Connection is synchronous (default); <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public boolean isSynchronous() throws JAXRException;

	/**
	 * Sets whether the client uses synchronous communication or not. 
	 * A JAXR client may dynamically change its communication style
	 * preference. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param sync	<code>true</code> if Connection is desired to be synchronous; <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setSynchronous(boolean sync) throws JAXRException;

	/**
	 * Sets the Credentials associated with this client. The credentials is used to authenticate the client with the JAXR provider.
	 * A JAXR client may dynamically change its identity by changing
	 * the credentials associated with it.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 *
	 * @param credentials	a Collection oj java.lang.Objects which provide identity related information for the caller.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setCredentials(Set credentials) throws JAXRException;

	/**
	 * Gets the credentials associated with this client.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL>
	 * 	 
	 * @return Set of java.lang.Object instances. The Collection may be empty but not null.	 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 *
	 */
	public Set getCredentials() throws JAXRException;
	

}
