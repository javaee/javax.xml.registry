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

import java.util.*;
import javax.xml.registry.infomodel.*;

/**
 * Contains the response of a method in the API that performs a bulk
 * operation and returns a bulk response. Partial commits are allowed on
 * a bulk operation.
 * <p>
 * In the event of a partial success where only a subset of objects were processed successfully, the getStatus method of the BulkResponse must return JAXRResponse.STATUS_WARNING. In this case, a Collection of JAXRException instances is included in the BulkResponse instance. The JAXRExceptions provide information on each error that prevented some objects in the request to not be processed successfully.
 *
 * @see QueryManager
 * @see LifeCycleManager
 * @author Farrukh S. Najmi
 */
public interface BulkResponse extends JAXRResponse {

    /**
     * Get the Collection of objects returned as a response of a 
	 * bulk operation.
	 * Caller thread will block here if result is not yet available. 
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @see javax.xml.registry.infomodel.RegistryObject
     * @return Collection of RegistryObject instances. The Collection may be empty but not null.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    Collection getCollection() throws JAXRException;

    /** 
	 * Get the Collection of RegistryException instances in case of partial commit. 
	 * Caller thread will block here if result is not yet available. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL>
	 *	 
	 * @see RegistryException
	 * @return Collection of RegistryException instances. Return null if result is available and there is no RegistryException.	 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    Collection getExceptions() throws JAXRException;

	/** 
	 * Determines whether the response is a partial response due to large result set.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return <code>true</code> if the response is partial; <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public boolean isPartialResponse() throws JAXRException;
	
}
