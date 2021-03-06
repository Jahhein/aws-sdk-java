/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/IpOwner" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpOwner implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String asn;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String asnOrg;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String isp;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String org;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param asn
     *        Reserved for future use.
     */

    public void setAsn(String asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param asn
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOwner withAsn(String asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param asnOrg
     *        Reserved for future use.
     */

    public void setAsnOrg(String asnOrg) {
        this.asnOrg = asnOrg;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getAsnOrg() {
        return this.asnOrg;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param asnOrg
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOwner withAsnOrg(String asnOrg) {
        setAsnOrg(asnOrg);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param isp
     *        Reserved for future use.
     */

    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getIsp() {
        return this.isp;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param isp
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOwner withIsp(String isp) {
        setIsp(isp);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param org
     *        Reserved for future use.
     */

    public void setOrg(String org) {
        this.org = org;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getOrg() {
        return this.org;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param org
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOwner withOrg(String org) {
        setOrg(org);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getAsnOrg() != null)
            sb.append("AsnOrg: ").append(getAsnOrg()).append(",");
        if (getIsp() != null)
            sb.append("Isp: ").append(getIsp()).append(",");
        if (getOrg() != null)
            sb.append("Org: ").append(getOrg());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpOwner == false)
            return false;
        IpOwner other = (IpOwner) obj;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAsnOrg() == null ^ this.getAsnOrg() == null)
            return false;
        if (other.getAsnOrg() != null && other.getAsnOrg().equals(this.getAsnOrg()) == false)
            return false;
        if (other.getIsp() == null ^ this.getIsp() == null)
            return false;
        if (other.getIsp() != null && other.getIsp().equals(this.getIsp()) == false)
            return false;
        if (other.getOrg() == null ^ this.getOrg() == null)
            return false;
        if (other.getOrg() != null && other.getOrg().equals(this.getOrg()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAsnOrg() == null) ? 0 : getAsnOrg().hashCode());
        hashCode = prime * hashCode + ((getIsp() == null) ? 0 : getIsp().hashCode());
        hashCode = prime * hashCode + ((getOrg() == null) ? 0 : getOrg().hashCode());
        return hashCode;
    }

    @Override
    public IpOwner clone() {
        try {
            return (IpOwner) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.IpOwnerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
