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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/UpdateMacieSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMacieSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub and
     * exporting finding events to Amazon CloudWatch.
     */
    private String findingPublishingFrequency;
    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     * activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     */
    private String status;

    /**
     * Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub and
     * exporting finding events to Amazon CloudWatch.
     * 
     * @param findingPublishingFrequency
     *        Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub
     *        and exporting finding events to Amazon CloudWatch.
     * @see FindingPublishingFrequency
     */

    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub and
     * exporting finding events to Amazon CloudWatch.
     * 
     * @return Specifies how often to publish findings for the account. This includes adding findings to AWS Security
     *         Hub and exporting finding events to Amazon CloudWatch.
     * @see FindingPublishingFrequency
     */

    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }

    /**
     * Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub and
     * exporting finding events to Amazon CloudWatch.
     * 
     * @param findingPublishingFrequency
     *        Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub
     *        and exporting finding events to Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public UpdateMacieSessionRequest withFindingPublishingFrequency(String findingPublishingFrequency) {
        setFindingPublishingFrequency(findingPublishingFrequency);
        return this;
    }

    /**
     * Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub and
     * exporting finding events to Amazon CloudWatch.
     * 
     * @param findingPublishingFrequency
     *        Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub
     *        and exporting finding events to Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public UpdateMacieSessionRequest withFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     * activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     * 
     * @param status
     *        Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     *        activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * @see MacieStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     * activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     * 
     * @return Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     *         activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * @see MacieStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     * activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     * 
     * @param status
     *        Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     *        activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacieStatus
     */

    public UpdateMacieSessionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     * activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     * 
     * @param status
     *        Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie
     *        activities for the account; and, PAUSED, suspend all Macie activities for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacieStatus
     */

    public UpdateMacieSessionRequest withStatus(MacieStatus status) {
        this.status = status.toString();
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
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: ").append(getFindingPublishingFrequency()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMacieSessionRequest == false)
            return false;
        UpdateMacieSessionRequest other = (UpdateMacieSessionRequest) obj;
        if (other.getFindingPublishingFrequency() == null ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null && other.getFindingPublishingFrequency().equals(this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMacieSessionRequest clone() {
        return (UpdateMacieSessionRequest) super.clone();
    }

}
