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
 * This exception is thrown when the JAXR provider finds a Object that is
 * out-of-place or of the wrong type within the context of a user request.
 * For example a saveOrganizations request in BusinessLifeCycleManager would
 * throw this Exception if it found an Object other than Organization in the
 * Collection of Objects provided by client to be saved by the request.
 *
 * @author Farrukh S. Najmi
 */
public class UnexpectedObjectException extends JAXRException {

	 /**
     * Constructs a <code>JAXRException</code> object with no
     * reason or embedded Throwable.
     */
    public UnexpectedObjectException() {
        super();
		this.cause = null;
    }

    /**
     * Constructs a <code>JAXRException</code> object with the given
     * <code>String</code> as the reason for the exception being thrown.
     *
     * @param reason a description of what caused the exception
     */
    public UnexpectedObjectException(String reason) {
        super(reason);
		this.cause = null;
    }

    /**
     * Constructs a <code>JAXRException</code> object with the given
     * <code>String</code> as the reason for the exception being thrown
     * and the given <code>Throwable</code> object as an embedded
     * Throwable.
     *
     * @param reason a description of what caused the exception
     * @param cause a <code>Throwable</code> object that is to
     *        be embedded in this <code>JAXRException</code> object
     */
    public UnexpectedObjectException(String reason, Throwable cause) {
       super (reason);
       initCause(cause);
    }

    /**
     * Constructs a <code>JAXRException</code> object initialized
     * with the given <code>Throwable</code> object.
     *
     * @param cause the Throwable that caused this Exception
     */
    public UnexpectedObjectException(Throwable cause) {
		super (cause.toString());
		initCause(cause);
    }
}
