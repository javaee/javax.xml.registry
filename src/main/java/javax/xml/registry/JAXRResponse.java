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

/**
 * A JAXR requests' response.
 *
 * @see JAXRException
 * @author Farrukh S. Najmi  
 */
public interface JAXRResponse {

	/**
	 * Status indicating a successful response.
	 */
	public static final int STATUS_SUCCESS=0;

	/**
	 * Status indicating a successful response that included at least one warning.
	 */
	public static final int STATUS_WARNING=1;

	/**
	 * Status indicating a failure response.
	 */
	public static final int STATUS_FAILURE=2;

	/**
	 * Status indicating that the results are currently unavailable.
	 */
	public static final int STATUS_UNAVAILABLE=3;
	
	/**
	 * Returns the unique id for the request that generated this response.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the request id
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	String getRequestId() throws JAXRException;
	
	
	/**
	 * Returns the status for this response.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @see JAXRResponse#STATUS_SUCCESS
	 * @return the status which is an integer enumerated value
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public int getStatus() throws JAXRException;
	
	/**
	 * Returns true if a response is available, false otherwise.
	 * This is a polling method and must not block.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return <code>true</code> if the response is available; <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public boolean isAvailable() throws JAXRException;
}
