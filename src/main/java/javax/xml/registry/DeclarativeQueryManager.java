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
 * This interface provides the ability to execute declarative queries (e.g. SQL)
 *
 * @author Farrukh S. Najmi
 */
public interface DeclarativeQueryManager extends QueryManager {

	/**
	 * Creates a Query object given a queryType (for example, QUERY_TYPE_SQL) and a String
	 * that represents a query in the syntax appropriate for queryType.
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @see Query#QUERY_TYPE_SQL
	 * @see Query#QUERY_TYPE_XQUERY
	 * @see Query#QUERY_TYPE_EBXML_FILTER_QUERY
	 * @param queryType	the type of query
	 * @param queryString	the query in its string representation
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 * @throws InvalidRequestException	If the JAXR provider validates query syntax (optional) and the sqlQuery is not valid
	 *
	 */
	Query createQuery(int queryType, String queryString) throws InvalidRequestException, JAXRException;

	/**
	 * Executes a query as specified by query parameter.
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param query	the query to be executed
	 * @return the BulkResponse that is the result of the query
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public BulkResponse executeQuery(Query query) throws JAXRException;


    /** @link dependency 
     * @label processes*/
    /*#Query lnkQuery;*/
}
