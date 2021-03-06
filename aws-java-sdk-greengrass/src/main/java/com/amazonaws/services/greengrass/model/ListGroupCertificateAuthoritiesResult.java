/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroupCertificateAuthorities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupCertificateAuthoritiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** A list of certificate authorities associated with the group. */
    private java.util.List<GroupCertificateAuthorityProperties> groupCertificateAuthorities;

    /**
     * A list of certificate authorities associated with the group.
     * 
     * @return A list of certificate authorities associated with the group.
     */

    public java.util.List<GroupCertificateAuthorityProperties> getGroupCertificateAuthorities() {
        return groupCertificateAuthorities;
    }

    /**
     * A list of certificate authorities associated with the group.
     * 
     * @param groupCertificateAuthorities
     *        A list of certificate authorities associated with the group.
     */

    public void setGroupCertificateAuthorities(java.util.Collection<GroupCertificateAuthorityProperties> groupCertificateAuthorities) {
        if (groupCertificateAuthorities == null) {
            this.groupCertificateAuthorities = null;
            return;
        }

        this.groupCertificateAuthorities = new java.util.ArrayList<GroupCertificateAuthorityProperties>(groupCertificateAuthorities);
    }

    /**
     * A list of certificate authorities associated with the group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupCertificateAuthorities(java.util.Collection)} or
     * {@link #withGroupCertificateAuthorities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param groupCertificateAuthorities
     *        A list of certificate authorities associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupCertificateAuthoritiesResult withGroupCertificateAuthorities(GroupCertificateAuthorityProperties... groupCertificateAuthorities) {
        if (this.groupCertificateAuthorities == null) {
            setGroupCertificateAuthorities(new java.util.ArrayList<GroupCertificateAuthorityProperties>(groupCertificateAuthorities.length));
        }
        for (GroupCertificateAuthorityProperties ele : groupCertificateAuthorities) {
            this.groupCertificateAuthorities.add(ele);
        }
        return this;
    }

    /**
     * A list of certificate authorities associated with the group.
     * 
     * @param groupCertificateAuthorities
     *        A list of certificate authorities associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupCertificateAuthoritiesResult withGroupCertificateAuthorities(
            java.util.Collection<GroupCertificateAuthorityProperties> groupCertificateAuthorities) {
        setGroupCertificateAuthorities(groupCertificateAuthorities);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupCertificateAuthorities() != null)
            sb.append("GroupCertificateAuthorities: ").append(getGroupCertificateAuthorities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGroupCertificateAuthoritiesResult == false)
            return false;
        ListGroupCertificateAuthoritiesResult other = (ListGroupCertificateAuthoritiesResult) obj;
        if (other.getGroupCertificateAuthorities() == null ^ this.getGroupCertificateAuthorities() == null)
            return false;
        if (other.getGroupCertificateAuthorities() != null && other.getGroupCertificateAuthorities().equals(this.getGroupCertificateAuthorities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupCertificateAuthorities() == null) ? 0 : getGroupCertificateAuthorities().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupCertificateAuthoritiesResult clone() {
        try {
            return (ListGroupCertificateAuthoritiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
