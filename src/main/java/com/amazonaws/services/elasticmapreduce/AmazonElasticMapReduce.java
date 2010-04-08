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
package com.amazonaws.services.elasticmapreduce;

import com.amazonaws.*;
import com.amazonaws.services.elasticmapreduce.model.*;

/**
 * Interface for accessing AmazonElasticMapReduce.
 * <p>
 * Elastic MapReduce is a web service that makes it easy to process vast
 * amounts of data using Amazon Simple Storage Service (Amazon S3), where
 * data is stored, and a cluster of Amazon Elastic Compute Cloud (EC2)
 * instances, where that data is processed. Elastic MapReduce uses Hadoop
 * processing to do such things as web indexing, data mining, log file
 * analysis, machine learning, scientific simulation, and bioinformatics
 * research.
 * </p>
 */
public interface AmazonElasticMapReduce {

    /**
     * Overrides the default endpoint for this client ("https://elasticmapreduce.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Adds new steps to a job flow already loaded on an EC2 cluster. Each
     * step applies an algorithm to the data set, for the first step, or to
     * the data returned by the previous step in the job flow. If the job
     * flow isn't executing any other steps, execution begins from the first
     * added step. The maximum number of steps in a job flow is 256.
     * </p>
     *
     * @param addJobFlowStepsRequest Container for the necessary parameters
     *           to execute the AddJobFlowSteps service method on
     *           AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addJobFlowSteps(AddJobFlowStepsRequest addJobFlowStepsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Terminates job flow processing, uploads data from EC2 to Amazon S3,
     * and terminates the EC2 cluster. Use this action to terminate a single
     * job flow or list of job flows. Job flows that complete successfully
     * terminate automatically unless the job flow's
     * <code>KeepJobFlowAliveWhenNoSteps</code> field is set to
     * <code>true</code> when provided to the RunJobFlows operation.
     * </p>
     *
     * @param terminateJobFlowsRequest Container for the necessary parameters
     *           to execute the TerminateJobFlows service method on
     *           AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void terminateJobFlows(TerminateJobFlowsRequest terminateJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns extensive details about specified job flows. The client
     * specifies job flows by their ID, creation date, or state. Elastic
     * MapReduce returns descriptions of job flows that are up to two months
     * old. Specifying a date older than two months returns an error. The
     * maximum number of job flow descriptions that are returned is 512.
     * </p>
     * <p>
     * Each input parameter acts as a filter so that Elastic MapReduce
     * returns information about a more precise set of job flows with each
     * parameter that is used in the request. If parameters are not included
     * in a request, Elastic MapReduce returns descriptions of all job flows
     * that have:
     * </p>
     * 
     * <ul>
     * <li>Been created and completed in the last two weeks,</li>
     * <li>Not ended within the last two months. These jobs have one of the
     * following job flow states: <code>RUNNING</code> ,
     * 
     * <code>WAITING</code> ,
     * 
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> .</li>
     * 
     * </ul>
     *
     * @param describeJobFlowsRequest Container for the necessary parameters
     *           to execute the DescribeJobFlows service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the DescribeJobFlows service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeJobFlowsResult describeJobFlows(DescribeJobFlowsRequest describeJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new job flow and EC2 cluster, and then executes the job flow
     * steps on the cluster. When the job flow finishes, depending on the
     * specified parameter values, RunJobFlow terminates the EC2 cluster and
     * uploads results to a specified Amazon S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> When running a new job flow, the following restrictions
     * apply: The maximum lifetime of a job flow is 2 weeks. The maximum
     * number of steps allowed in a job flow is 256.
     * </p>
     *
     * @param runJobFlowRequest Container for the necessary parameters to
     *           execute the RunJobFlow service method on AmazonElasticMapReduce.
     * 
     * @return The response from the RunJobFlow service method, as returned
     *         by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RunJobFlowResult runJobFlow(RunJobFlowRequest runJobFlowRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns extensive details about specified job flows. The client
     * specifies job flows by their ID, creation date, or state. Elastic
     * MapReduce returns descriptions of job flows that are up to two months
     * old. Specifying a date older than two months returns an error. The
     * maximum number of job flow descriptions that are returned is 512.
     * </p>
     * <p>
     * Each input parameter acts as a filter so that Elastic MapReduce
     * returns information about a more precise set of job flows with each
     * parameter that is used in the request. If parameters are not included
     * in a request, Elastic MapReduce returns descriptions of all job flows
     * that have:
     * </p>
     * 
     * <ul>
     * <li>Been created and completed in the last two weeks,</li>
     * <li>Not ended within the last two months. These jobs have one of the
     * following job flow states: <code>RUNNING</code> ,
     * 
     * <code>WAITING</code> ,
     * 
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> .</li>
     * 
     * </ul>
     * 
     * @return The response from the DescribeJobFlows service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeJobFlowsResult describeJobFlows() throws AmazonServiceException, AmazonClientException;
    
}
        