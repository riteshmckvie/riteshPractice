/**
 * AdministrationServiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationServiceResponse  implements java.io.Serializable {
    private com.hof.mi.web.service.ReportBinaryObject[] binaryAttachments;

    private java.lang.String binaryData;

    private com.hof.mi.web.service.AdministrationClientOrg client;

    private com.hof.mi.web.service.AdministrationClientOrg[] clients;

    private com.hof.mi.web.service.ContentResource[] contentResources;

    private java.lang.String contentType;

    private com.hof.mi.web.service.AdministrationDataSource[] datasources;

    private java.lang.Integer entityId;

    private java.lang.Integer errorCode;

    private java.lang.String fileName;

    private com.hof.mi.web.service.AdministrationGroup group;

    private com.hof.mi.web.service.AdministrationGroup[] groups;

    private com.hof.mi.web.service.ImportIssue[] importIssues;

    private com.hof.mi.web.service.AdministrationDataSource loadedDataSource;

    private java.lang.String loginSessionId;

    private java.lang.String[] messages;

    private com.hof.mi.web.service.ParentDashboard parentDashboard;

    private com.hof.mi.web.service.ParentDashboard[] parentDashboards;

    private com.hof.mi.web.service.ParentReportGroup[] parentReportGroups;

    private com.hof.mi.web.service.AdministrationPerson[] people;

    private com.hof.mi.web.service.AdministrationPerson person;

    private com.hof.mi.web.service.PersonFavourite[] personfavourites;

    private com.hof.mi.web.service.ReportRow[] queryResults;

    private com.hof.mi.web.service.AdministrationReport report;

    private com.hof.mi.web.service.AdministrationReportGroup[] reportGroups;

    private java.lang.Integer reportId;

    private com.hof.mi.web.service.AdministrationReport[] reports;

    private com.hof.mi.web.service.AdministrationRole[] roles;

    private com.hof.mi.web.service.schedule.AdministrationSchedule schedule;

    private com.hof.mi.web.service.schedule.AdministrationSchedule[] schedules;

    private java.lang.String sessionId;

    private java.lang.String statusCode;

    public AdministrationServiceResponse() {
    }

    public AdministrationServiceResponse(
           com.hof.mi.web.service.ReportBinaryObject[] binaryAttachments,
           java.lang.String binaryData,
           com.hof.mi.web.service.AdministrationClientOrg client,
           com.hof.mi.web.service.AdministrationClientOrg[] clients,
           com.hof.mi.web.service.ContentResource[] contentResources,
           java.lang.String contentType,
           com.hof.mi.web.service.AdministrationDataSource[] datasources,
           java.lang.Integer entityId,
           java.lang.Integer errorCode,
           java.lang.String fileName,
           com.hof.mi.web.service.AdministrationGroup group,
           com.hof.mi.web.service.AdministrationGroup[] groups,
           com.hof.mi.web.service.ImportIssue[] importIssues,
           com.hof.mi.web.service.AdministrationDataSource loadedDataSource,
           java.lang.String loginSessionId,
           java.lang.String[] messages,
           com.hof.mi.web.service.ParentDashboard parentDashboard,
           com.hof.mi.web.service.ParentDashboard[] parentDashboards,
           com.hof.mi.web.service.ParentReportGroup[] parentReportGroups,
           com.hof.mi.web.service.AdministrationPerson[] people,
           com.hof.mi.web.service.AdministrationPerson person,
           com.hof.mi.web.service.PersonFavourite[] personfavourites,
           com.hof.mi.web.service.ReportRow[] queryResults,
           com.hof.mi.web.service.AdministrationReport report,
           com.hof.mi.web.service.AdministrationReportGroup[] reportGroups,
           java.lang.Integer reportId,
           com.hof.mi.web.service.AdministrationReport[] reports,
           com.hof.mi.web.service.AdministrationRole[] roles,
           com.hof.mi.web.service.schedule.AdministrationSchedule schedule,
           com.hof.mi.web.service.schedule.AdministrationSchedule[] schedules,
           java.lang.String sessionId,
           java.lang.String statusCode) {
           this.binaryAttachments = binaryAttachments;
           this.binaryData = binaryData;
           this.client = client;
           this.clients = clients;
           this.contentResources = contentResources;
           this.contentType = contentType;
           this.datasources = datasources;
           this.entityId = entityId;
           this.errorCode = errorCode;
           this.fileName = fileName;
           this.group = group;
           this.groups = groups;
           this.importIssues = importIssues;
           this.loadedDataSource = loadedDataSource;
           this.loginSessionId = loginSessionId;
           this.messages = messages;
           this.parentDashboard = parentDashboard;
           this.parentDashboards = parentDashboards;
           this.parentReportGroups = parentReportGroups;
           this.people = people;
           this.person = person;
           this.personfavourites = personfavourites;
           this.queryResults = queryResults;
           this.report = report;
           this.reportGroups = reportGroups;
           this.reportId = reportId;
           this.reports = reports;
           this.roles = roles;
           this.schedule = schedule;
           this.schedules = schedules;
           this.sessionId = sessionId;
           this.statusCode = statusCode;
    }


    /**
     * Gets the binaryAttachments value for this AdministrationServiceResponse.
     * 
     * @return binaryAttachments
     */
    public com.hof.mi.web.service.ReportBinaryObject[] getBinaryAttachments() {
        return binaryAttachments;
    }


    /**
     * Sets the binaryAttachments value for this AdministrationServiceResponse.
     * 
     * @param binaryAttachments
     */
    public void setBinaryAttachments(com.hof.mi.web.service.ReportBinaryObject[] binaryAttachments) {
        this.binaryAttachments = binaryAttachments;
    }


    /**
     * Gets the binaryData value for this AdministrationServiceResponse.
     * 
     * @return binaryData
     */
    public java.lang.String getBinaryData() {
        return binaryData;
    }


    /**
     * Sets the binaryData value for this AdministrationServiceResponse.
     * 
     * @param binaryData
     */
    public void setBinaryData(java.lang.String binaryData) {
        this.binaryData = binaryData;
    }


    /**
     * Gets the client value for this AdministrationServiceResponse.
     * 
     * @return client
     */
    public com.hof.mi.web.service.AdministrationClientOrg getClient() {
        return client;
    }


    /**
     * Sets the client value for this AdministrationServiceResponse.
     * 
     * @param client
     */
    public void setClient(com.hof.mi.web.service.AdministrationClientOrg client) {
        this.client = client;
    }


    /**
     * Gets the clients value for this AdministrationServiceResponse.
     * 
     * @return clients
     */
    public com.hof.mi.web.service.AdministrationClientOrg[] getClients() {
        return clients;
    }


    /**
     * Sets the clients value for this AdministrationServiceResponse.
     * 
     * @param clients
     */
    public void setClients(com.hof.mi.web.service.AdministrationClientOrg[] clients) {
        this.clients = clients;
    }


    /**
     * Gets the contentResources value for this AdministrationServiceResponse.
     * 
     * @return contentResources
     */
    public com.hof.mi.web.service.ContentResource[] getContentResources() {
        return contentResources;
    }


    /**
     * Sets the contentResources value for this AdministrationServiceResponse.
     * 
     * @param contentResources
     */
    public void setContentResources(com.hof.mi.web.service.ContentResource[] contentResources) {
        this.contentResources = contentResources;
    }


    /**
     * Gets the contentType value for this AdministrationServiceResponse.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this AdministrationServiceResponse.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the datasources value for this AdministrationServiceResponse.
     * 
     * @return datasources
     */
    public com.hof.mi.web.service.AdministrationDataSource[] getDatasources() {
        return datasources;
    }


    /**
     * Sets the datasources value for this AdministrationServiceResponse.
     * 
     * @param datasources
     */
    public void setDatasources(com.hof.mi.web.service.AdministrationDataSource[] datasources) {
        this.datasources = datasources;
    }


    /**
     * Gets the entityId value for this AdministrationServiceResponse.
     * 
     * @return entityId
     */
    public java.lang.Integer getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this AdministrationServiceResponse.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the errorCode value for this AdministrationServiceResponse.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this AdministrationServiceResponse.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the fileName value for this AdministrationServiceResponse.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this AdministrationServiceResponse.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the group value for this AdministrationServiceResponse.
     * 
     * @return group
     */
    public com.hof.mi.web.service.AdministrationGroup getGroup() {
        return group;
    }


    /**
     * Sets the group value for this AdministrationServiceResponse.
     * 
     * @param group
     */
    public void setGroup(com.hof.mi.web.service.AdministrationGroup group) {
        this.group = group;
    }


    /**
     * Gets the groups value for this AdministrationServiceResponse.
     * 
     * @return groups
     */
    public com.hof.mi.web.service.AdministrationGroup[] getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this AdministrationServiceResponse.
     * 
     * @param groups
     */
    public void setGroups(com.hof.mi.web.service.AdministrationGroup[] groups) {
        this.groups = groups;
    }


    /**
     * Gets the importIssues value for this AdministrationServiceResponse.
     * 
     * @return importIssues
     */
    public com.hof.mi.web.service.ImportIssue[] getImportIssues() {
        return importIssues;
    }


    /**
     * Sets the importIssues value for this AdministrationServiceResponse.
     * 
     * @param importIssues
     */
    public void setImportIssues(com.hof.mi.web.service.ImportIssue[] importIssues) {
        this.importIssues = importIssues;
    }


    /**
     * Gets the loadedDataSource value for this AdministrationServiceResponse.
     * 
     * @return loadedDataSource
     */
    public com.hof.mi.web.service.AdministrationDataSource getLoadedDataSource() {
        return loadedDataSource;
    }


    /**
     * Sets the loadedDataSource value for this AdministrationServiceResponse.
     * 
     * @param loadedDataSource
     */
    public void setLoadedDataSource(com.hof.mi.web.service.AdministrationDataSource loadedDataSource) {
        this.loadedDataSource = loadedDataSource;
    }


    /**
     * Gets the loginSessionId value for this AdministrationServiceResponse.
     * 
     * @return loginSessionId
     */
    public java.lang.String getLoginSessionId() {
        return loginSessionId;
    }


    /**
     * Sets the loginSessionId value for this AdministrationServiceResponse.
     * 
     * @param loginSessionId
     */
    public void setLoginSessionId(java.lang.String loginSessionId) {
        this.loginSessionId = loginSessionId;
    }


    /**
     * Gets the messages value for this AdministrationServiceResponse.
     * 
     * @return messages
     */
    public java.lang.String[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this AdministrationServiceResponse.
     * 
     * @param messages
     */
    public void setMessages(java.lang.String[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the parentDashboard value for this AdministrationServiceResponse.
     * 
     * @return parentDashboard
     */
    public com.hof.mi.web.service.ParentDashboard getParentDashboard() {
        return parentDashboard;
    }


    /**
     * Sets the parentDashboard value for this AdministrationServiceResponse.
     * 
     * @param parentDashboard
     */
    public void setParentDashboard(com.hof.mi.web.service.ParentDashboard parentDashboard) {
        this.parentDashboard = parentDashboard;
    }


    /**
     * Gets the parentDashboards value for this AdministrationServiceResponse.
     * 
     * @return parentDashboards
     */
    public com.hof.mi.web.service.ParentDashboard[] getParentDashboards() {
        return parentDashboards;
    }


    /**
     * Sets the parentDashboards value for this AdministrationServiceResponse.
     * 
     * @param parentDashboards
     */
    public void setParentDashboards(com.hof.mi.web.service.ParentDashboard[] parentDashboards) {
        this.parentDashboards = parentDashboards;
    }


    /**
     * Gets the parentReportGroups value for this AdministrationServiceResponse.
     * 
     * @return parentReportGroups
     */
    public com.hof.mi.web.service.ParentReportGroup[] getParentReportGroups() {
        return parentReportGroups;
    }


    /**
     * Sets the parentReportGroups value for this AdministrationServiceResponse.
     * 
     * @param parentReportGroups
     */
    public void setParentReportGroups(com.hof.mi.web.service.ParentReportGroup[] parentReportGroups) {
        this.parentReportGroups = parentReportGroups;
    }


    /**
     * Gets the people value for this AdministrationServiceResponse.
     * 
     * @return people
     */
    public com.hof.mi.web.service.AdministrationPerson[] getPeople() {
        return people;
    }


    /**
     * Sets the people value for this AdministrationServiceResponse.
     * 
     * @param people
     */
    public void setPeople(com.hof.mi.web.service.AdministrationPerson[] people) {
        this.people = people;
    }


    /**
     * Gets the person value for this AdministrationServiceResponse.
     * 
     * @return person
     */
    public com.hof.mi.web.service.AdministrationPerson getPerson() {
        return person;
    }


    /**
     * Sets the person value for this AdministrationServiceResponse.
     * 
     * @param person
     */
    public void setPerson(com.hof.mi.web.service.AdministrationPerson person) {
        this.person = person;
    }


    /**
     * Gets the personfavourites value for this AdministrationServiceResponse.
     * 
     * @return personfavourites
     */
    public com.hof.mi.web.service.PersonFavourite[] getPersonfavourites() {
        return personfavourites;
    }


    /**
     * Sets the personfavourites value for this AdministrationServiceResponse.
     * 
     * @param personfavourites
     */
    public void setPersonfavourites(com.hof.mi.web.service.PersonFavourite[] personfavourites) {
        this.personfavourites = personfavourites;
    }


    /**
     * Gets the queryResults value for this AdministrationServiceResponse.
     * 
     * @return queryResults
     */
    public com.hof.mi.web.service.ReportRow[] getQueryResults() {
        return queryResults;
    }


    /**
     * Sets the queryResults value for this AdministrationServiceResponse.
     * 
     * @param queryResults
     */
    public void setQueryResults(com.hof.mi.web.service.ReportRow[] queryResults) {
        this.queryResults = queryResults;
    }


    /**
     * Gets the report value for this AdministrationServiceResponse.
     * 
     * @return report
     */
    public com.hof.mi.web.service.AdministrationReport getReport() {
        return report;
    }


    /**
     * Sets the report value for this AdministrationServiceResponse.
     * 
     * @param report
     */
    public void setReport(com.hof.mi.web.service.AdministrationReport report) {
        this.report = report;
    }


    /**
     * Gets the reportGroups value for this AdministrationServiceResponse.
     * 
     * @return reportGroups
     */
    public com.hof.mi.web.service.AdministrationReportGroup[] getReportGroups() {
        return reportGroups;
    }


    /**
     * Sets the reportGroups value for this AdministrationServiceResponse.
     * 
     * @param reportGroups
     */
    public void setReportGroups(com.hof.mi.web.service.AdministrationReportGroup[] reportGroups) {
        this.reportGroups = reportGroups;
    }


    /**
     * Gets the reportId value for this AdministrationServiceResponse.
     * 
     * @return reportId
     */
    public java.lang.Integer getReportId() {
        return reportId;
    }


    /**
     * Sets the reportId value for this AdministrationServiceResponse.
     * 
     * @param reportId
     */
    public void setReportId(java.lang.Integer reportId) {
        this.reportId = reportId;
    }


    /**
     * Gets the reports value for this AdministrationServiceResponse.
     * 
     * @return reports
     */
    public com.hof.mi.web.service.AdministrationReport[] getReports() {
        return reports;
    }


    /**
     * Sets the reports value for this AdministrationServiceResponse.
     * 
     * @param reports
     */
    public void setReports(com.hof.mi.web.service.AdministrationReport[] reports) {
        this.reports = reports;
    }


    /**
     * Gets the roles value for this AdministrationServiceResponse.
     * 
     * @return roles
     */
    public com.hof.mi.web.service.AdministrationRole[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this AdministrationServiceResponse.
     * 
     * @param roles
     */
    public void setRoles(com.hof.mi.web.service.AdministrationRole[] roles) {
        this.roles = roles;
    }


    /**
     * Gets the schedule value for this AdministrationServiceResponse.
     * 
     * @return schedule
     */
    public com.hof.mi.web.service.schedule.AdministrationSchedule getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this AdministrationServiceResponse.
     * 
     * @param schedule
     */
    public void setSchedule(com.hof.mi.web.service.schedule.AdministrationSchedule schedule) {
        this.schedule = schedule;
    }


    /**
     * Gets the schedules value for this AdministrationServiceResponse.
     * 
     * @return schedules
     */
    public com.hof.mi.web.service.schedule.AdministrationSchedule[] getSchedules() {
        return schedules;
    }


    /**
     * Sets the schedules value for this AdministrationServiceResponse.
     * 
     * @param schedules
     */
    public void setSchedules(com.hof.mi.web.service.schedule.AdministrationSchedule[] schedules) {
        this.schedules = schedules;
    }


    /**
     * Gets the sessionId value for this AdministrationServiceResponse.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this AdministrationServiceResponse.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the statusCode value for this AdministrationServiceResponse.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this AdministrationServiceResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationServiceResponse)) return false;
        AdministrationServiceResponse other = (AdministrationServiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.binaryAttachments==null && other.getBinaryAttachments()==null) || 
             (this.binaryAttachments!=null &&
              java.util.Arrays.equals(this.binaryAttachments, other.getBinaryAttachments()))) &&
            ((this.binaryData==null && other.getBinaryData()==null) || 
             (this.binaryData!=null &&
              this.binaryData.equals(other.getBinaryData()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.clients==null && other.getClients()==null) || 
             (this.clients!=null &&
              java.util.Arrays.equals(this.clients, other.getClients()))) &&
            ((this.contentResources==null && other.getContentResources()==null) || 
             (this.contentResources!=null &&
              java.util.Arrays.equals(this.contentResources, other.getContentResources()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.datasources==null && other.getDatasources()==null) || 
             (this.datasources!=null &&
              java.util.Arrays.equals(this.datasources, other.getDatasources()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              java.util.Arrays.equals(this.groups, other.getGroups()))) &&
            ((this.importIssues==null && other.getImportIssues()==null) || 
             (this.importIssues!=null &&
              java.util.Arrays.equals(this.importIssues, other.getImportIssues()))) &&
            ((this.loadedDataSource==null && other.getLoadedDataSource()==null) || 
             (this.loadedDataSource!=null &&
              this.loadedDataSource.equals(other.getLoadedDataSource()))) &&
            ((this.loginSessionId==null && other.getLoginSessionId()==null) || 
             (this.loginSessionId!=null &&
              this.loginSessionId.equals(other.getLoginSessionId()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.parentDashboard==null && other.getParentDashboard()==null) || 
             (this.parentDashboard!=null &&
              this.parentDashboard.equals(other.getParentDashboard()))) &&
            ((this.parentDashboards==null && other.getParentDashboards()==null) || 
             (this.parentDashboards!=null &&
              java.util.Arrays.equals(this.parentDashboards, other.getParentDashboards()))) &&
            ((this.parentReportGroups==null && other.getParentReportGroups()==null) || 
             (this.parentReportGroups!=null &&
              java.util.Arrays.equals(this.parentReportGroups, other.getParentReportGroups()))) &&
            ((this.people==null && other.getPeople()==null) || 
             (this.people!=null &&
              java.util.Arrays.equals(this.people, other.getPeople()))) &&
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.personfavourites==null && other.getPersonfavourites()==null) || 
             (this.personfavourites!=null &&
              java.util.Arrays.equals(this.personfavourites, other.getPersonfavourites()))) &&
            ((this.queryResults==null && other.getQueryResults()==null) || 
             (this.queryResults!=null &&
              java.util.Arrays.equals(this.queryResults, other.getQueryResults()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport()))) &&
            ((this.reportGroups==null && other.getReportGroups()==null) || 
             (this.reportGroups!=null &&
              java.util.Arrays.equals(this.reportGroups, other.getReportGroups()))) &&
            ((this.reportId==null && other.getReportId()==null) || 
             (this.reportId!=null &&
              this.reportId.equals(other.getReportId()))) &&
            ((this.reports==null && other.getReports()==null) || 
             (this.reports!=null &&
              java.util.Arrays.equals(this.reports, other.getReports()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles()))) &&
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              this.schedule.equals(other.getSchedule()))) &&
            ((this.schedules==null && other.getSchedules()==null) || 
             (this.schedules!=null &&
              java.util.Arrays.equals(this.schedules, other.getSchedules()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBinaryAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinaryAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinaryAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinaryData() != null) {
            _hashCode += getBinaryData().hashCode();
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getClients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getDatasources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatasources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatasources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImportIssues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImportIssues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImportIssues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoadedDataSource() != null) {
            _hashCode += getLoadedDataSource().hashCode();
        }
        if (getLoginSessionId() != null) {
            _hashCode += getLoginSessionId().hashCode();
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParentDashboard() != null) {
            _hashCode += getParentDashboard().hashCode();
        }
        if (getParentDashboards() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentDashboards());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentDashboards(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParentReportGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentReportGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentReportGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeople() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeople());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeople(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        if (getPersonfavourites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersonfavourites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersonfavourites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        if (getReportGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReportId() != null) {
            _hashCode += getReportId().hashCode();
        }
        if (getReports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchedule() != null) {
            _hashCode += getSchedule().hashCode();
        }
        if (getSchedules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationServiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationServiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binaryAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "binaryAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ReportBinaryObject"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binaryData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "binaryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationClientOrg"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationClientOrg"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentResources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ContentResource"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datasources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datasources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSource"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportIssue"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadedDataSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadedDataSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSource"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDashboard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentDashboard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentDashboard"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentDashboard"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentReportGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentReportGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentReportGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("people");
        elemField.setXmlName(new javax.xml.namespace.QName("", "people"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationPerson"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationPerson"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personfavourites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personfavourites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "PersonFavourite"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ReportRow"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReport"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReportGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reports");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReport"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationRole"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "AdministrationSchedule"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "AdministrationSchedule"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
