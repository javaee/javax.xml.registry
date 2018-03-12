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
 * The Query interface encapsulates a query in a declarative query language.
 * Currently a Query can be an SQL query or an ebXML Filter Query only.
 * In future support for other query languages such as XQL query may be added. 
 * The query must conform to a fixed schema as defined by the JAXR specification.
 *
 * @author Farrukh S. Najmi
 */
public interface Query {

	/**
	 * An SQL query type.
	 */
	public static final int QUERY_TYPE_SQL=0;

	/**
	 * A W3C XQuery type.
	 */
	public static final int QUERY_TYPE_XQUERY=1;

	/**
	 * An OASIS ebXML Registry XML Filter Query type.
	 */
	public static final int QUERY_TYPE_EBXML_FILTER_QUERY=2;
	
    /**
	 * Gets the type of Query (for example, QUERY_TYPE_SQL).
	 *
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @see Query#QUERY_TYPE_SQL
	 * @see Query#QUERY_TYPE_XQUERY
	 * @see Query#QUERY_TYPE_EBXML_FILTER_QUERY
	 * @return the type of query
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public int getType() throws JAXRException;

	/**
	 * Returns the String representing the query. For example,
	 * in the case of an SQL query, returns the SQL query as a string.
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @return the String representation for this query
	 *
	 */	
	public String toString();
}
