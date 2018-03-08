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
import java.util.*;
import javax.xml.registry.*;

/** 
 *  
 * ExternalLink instances model a named URI to content that may reside outside  
 * the registry.  
 * RegistryObject may be associated with any number of ExternalLinks to annotate  
 * a RegistryObject with external links to external content. 
 * <p> 
 * Consider the case where a Submitting Organization submits a repository item  
 * (e.g. a DTD) and wants to associate some external content to that object 
 * (e.g. the Submitting Organization's home page). The ExternalLink enables this  
 * capability.  
 * 
 * @see RegistryObject 
 * @author Farrukh S. Najmi    
 */
public interface ExternalLink extends RegistryObject, URIValidator {    

    /** 
     * Gets the collection of RegistryObjects that are annotated by this 
     * ExternalLink.     
     *	 
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 	 
     *	 
     * @return Collection of RegistryObjects. Return an empty Collection if no RegistryObjects	 
     * are annotated by this object.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error	 
     *	 
     */    
    Collection getLinkedObjects() throws JAXRException;    
     
    /** 	 
     * Gets URI to the an external resource.	 
     * Default is a NULL String. 	 
     *	 
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 	 
     *	 
     * @return	the URI String for this object (e.g. "http://java.sun.com") 	 
     * @throws JAXRException	If the JAXR provider encounters an internal error	 
     *	 
     */    
    String getExternalURI() throws JAXRException;    
     
    /** 	 
     * Sets URI for an external resource. 	 
     *	 
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 	 
     *	 
     * @param uri	the URI String for this object (e.g. "http://java.sun.com")	 
     * @throws JAXRException	If the JAXR provider encounters an internal error	 
     *	 
     */ 
    void setExternalURI(String uri) throws JAXRException;
}
