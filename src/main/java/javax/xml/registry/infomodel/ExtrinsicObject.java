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

/**
 * ExtrinsicObjects provide metadata that describes submitted content whose 
 * type is not intrinsically known to the registry and therefore must be 
 * described by means of additional attributes (e.g., mime type).
 * <p>
 * Examples of content described by ExtrinsicObject include Collaboration 
 * Protocol Profiles (CPP), business process descriptions, and schemas.
 *
 * @author Farrukh S. Najmi   
 */
public interface ExtrinsicObject extends RegistryEntry {

    /**
     * Gets the mime type associated with this object. 
	 * Default is a NULL String. 
	 * 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the mime type associated with this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    String getMimeType() throws JAXRException;

    /**
     * Sets the mime type associated with this object. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param mimeType	the mime type associated with this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setMimeType(String mimeType) throws JAXRException;

    /**
     * Determines whether the ExtrinsicObject is opaque (not readable) by the registry operator.
     * <p>
     * In some situations, a Submitting Organization may submit content that is encrypted and not even readable by the registry. This attribute allows the registry to know whether this is the case. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return <code>true</code> if the ExtrinsicObject is readable by the registry operator; <code>false</code> otherwise
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    boolean isOpaque() throws JAXRException;

    /**
     * Sets whether the ExtrinsicObject is opaque (not readable) by the registry. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param isOpaque	boolean value set to <code>true</code> if the ExtrinsicObject is readable by the registry operator; <code>false</code> otherwise
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setOpaque(boolean isOpaque) throws JAXRException;

    /** 
	 * Gets the repository item for this object.
	 * Must not return null. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @return the DataHandler for the repository item
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public javax.activation.DataHandler getRepositoryItem() throws JAXRException;

    /** 
	 * Sets the repository item for this object.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param repositoryItem	the DataHandler for the repository item. Must not be null 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setRepositoryItem(javax.activation.DataHandler repositoryItem) throws JAXRException;
}
