/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

/**
 * <p>
 * </p>
 */
public class JobFlowInstancesConfig {

    /**
     * The EC2 instance type of the master node.
     */
    private String masterInstanceType;

    /**
     * The EC2 instance type of the slave nodes.
     */
    private String slaveInstanceType;

    /**
     * The number of EC2 instances in the cluster. If the value is 1, one
     * instance serves as the master and slave node. If the value is greater
     * than one, one instance is the master node and the remainder are slave
     * nodes.
     */
    private Integer instanceCount;

    /**
     * A container for the Ec2 key name of the job flow instances config.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String ec2KeyName;

    /**
     * A container for the placement type of the job flow instances config.
     */
    private PlacementType placement;

    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster enganged after all steps in the job flow
     * complete.
     */
    private Boolean keepJobFlowAliveWhenNoSteps;

    private String hadoopVersion;

    /**
     * The EC2 instance type of the master node.
     *
     * @return The EC2 instance type of the master node.
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }
    
    /**
     * The EC2 instance type of the master node.
     *
     * @param masterInstanceType The EC2 instance type of the master node.
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }
    
    /**
     * The EC2 instance type of the master node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterInstanceType The EC2 instance type of the master node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    
    
    /**
     * The EC2 instance type of the slave nodes.
     *
     * @return The EC2 instance type of the slave nodes.
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }
    
    /**
     * The EC2 instance type of the slave nodes.
     *
     * @param slaveInstanceType The EC2 instance type of the slave nodes.
     */
    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }
    
    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param slaveInstanceType The EC2 instance type of the slave nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
        return this;
    }
    
    
    /**
     * The number of EC2 instances in the cluster. If the value is 1, one
     * instance serves as the master and slave node. If the value is greater
     * than one, one instance is the master node and the remainder are slave
     * nodes.
     *
     * @return The number of EC2 instances in the cluster. If the value is 1, one
     *         instance serves as the master and slave node. If the value is greater
     *         than one, one instance is the master node and the remainder are slave
     *         nodes.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of EC2 instances in the cluster. If the value is 1, one
     * instance serves as the master and slave node. If the value is greater
     * than one, one instance is the master node and the remainder are slave
     * nodes.
     *
     * @param instanceCount The number of EC2 instances in the cluster. If the value is 1, one
     *         instance serves as the master and slave node. If the value is greater
     *         than one, one instance is the master node and the remainder are slave
     *         nodes.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of EC2 instances in the cluster. If the value is 1, one
     * instance serves as the master and slave node. If the value is greater
     * than one, one instance is the master node and the remainder are slave
     * nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of EC2 instances in the cluster. If the value is 1, one
     *         instance serves as the master and slave node. If the value is greater
     *         than one, one instance is the master node and the remainder are slave
     *         nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    
    
    /**
     * A container for the Ec2 key name of the job flow instances config.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return A container for the Ec2 key name of the job flow instances config.
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }
    
    /**
     * A container for the Ec2 key name of the job flow instances config.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ec2KeyName A container for the Ec2 key name of the job flow instances config.
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }
    
    /**
     * A container for the Ec2 key name of the job flow instances config.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ec2KeyName A container for the Ec2 key name of the job flow instances config.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }
    
    
    /**
     * A container for the placement type of the job flow instances config.
     *
     * @return A container for the placement type of the job flow instances config.
     */
    public PlacementType getPlacement() {
        return placement;
    }
    
    /**
     * A container for the placement type of the job flow instances config.
     *
     * @param placement A container for the placement type of the job flow instances config.
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }
    
    /**
     * A container for the placement type of the job flow instances config.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement A container for the placement type of the job flow instances config.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withPlacement(PlacementType placement) {
        this.placement = placement;
        return this;
    }
    
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster enganged after all steps in the job flow
     * complete.
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         keep the EC2 cluster enganged after all steps in the job flow
     *         complete.
     */
    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster enganged after all steps in the job flow
     * complete.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         keep the EC2 cluster enganged after all steps in the job flow
     *         complete.
     */
    public void setKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster enganged after all steps in the job flow
     * complete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         keep the EC2 cluster enganged after all steps in the job flow
     *         complete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }
    
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * keep the EC2 cluster enganged after all steps in the job flow
     * complete.
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         keep the EC2 cluster enganged after all steps in the job flow
     *         complete.
     */
    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Returns the value of the HadoopVersion property for this object.
     *
     * @return The value of the HadoopVersion property for this object.
     */
    public String getHadoopVersion() {
        return hadoopVersion;
    }
    
    /**
     * Sets the value of the HadoopVersion property for this object.
     *
     * @param hadoopVersion The new value for the HadoopVersion property for this object.
     */
    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }
    
    /**
     * Sets the value of the HadoopVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hadoopVersion The new value for the HadoopVersion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowInstancesConfig withHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("MasterInstanceType: " + masterInstanceType + ", ");
        sb.append("SlaveInstanceType: " + slaveInstanceType + ", ");
        sb.append("InstanceCount: " + instanceCount + ", ");
        sb.append("Ec2KeyName: " + ec2KeyName + ", ");
        sb.append("Placement: " + placement + ", ");
        sb.append("KeepJobFlowAliveWhenNoSteps: " + keepJobFlowAliveWhenNoSteps + ", ");
        sb.append("HadoopVersion: " + hadoopVersion + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    