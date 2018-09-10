/**
 * AdministrationServiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationServiceRequest  implements java.io.Serializable {
    private byte[] binaryData;

    private com.hof.mi.web.service.AdministrationClientOrg client;

    private com.hof.mi.web.service.ContentResource[] contentResources;

    private java.lang.String customParameters;

    private java.lang.Integer dashboardTabId;

    private com.hof.mi.web.service.AdministrationDataSource datasource;

    private com.hof.mi.web.service.PersonFavourite favourite;

    private java.lang.String function;

    private com.hof.mi.web.service.AdministrationGroup group;

    private com.hof.mi.web.service.ImportOption[] importOptions;

    private java.lang.String loginId;

    private java.lang.String loginSessionId;

    private boolean ntlm;

    private java.lang.Integer orgId;

    private java.lang.String orgRef;

    private java.lang.String[] parameters;

    private java.lang.String password;

    private com.hof.mi.web.service.AdministrationPerson[] people;

    private com.hof.mi.web.service.AdministrationPerson person;

    private java.lang.String query;

    private com.hof.mi.web.service.AdministrationReport report;

    private com.hof.mi.web.service.AdministrationReportGroup reportGroup;

    private java.lang.Integer reportId;

    private java.lang.Integer retrospectiveDays;

    private com.hof.mi.web.service.AdministrationRole role;

    private com.hof.mi.web.service.schedule.AdministrationSchedule schedule;

    private java.lang.String sessionId;

    private com.hof.mi.web.service.AdministrationDataSourceClientLink sourceClientLink;

    private java.lang.Integer sourceId;

    private com.hof.mi.web.service.AdministrationTask task;

    private java.lang.String yellowfinContentExportFileType;

    public AdministrationServiceRequest() {
    }

    public AdministrationServiceRequest(
           byte[] binaryData,
           com.hof.mi.web.service.AdministrationClientOrg client,
           com.hof.mi.web.service.ContentResource[] contentResources,
           java.lang.String customParameters,
           java.lang.Integer dashboardTabId,
           com.hof.mi.web.service.AdministrationDataSource datasource,
           com.hof.mi.web.service.PersonFavourite favourite,
           java.lang.String function,
           com.hof.mi.web.service.AdministrationGroup group,
           com.hof.mi.web.service.ImportOption[] importOptions,
           java.lang.String loginId,
           java.lang.String loginSessionId,
           boolean ntlm,
           java.lang.Integer orgId,
           java.lang.String orgRef,
           java.lang.String[] parameters,
           java.lang.String password,
           com.hof.mi.web.service.AdministrationPerson[] people,
           com.hof.mi.web.service.AdministrationPerson person,
           java.lang.String query,
           com.hof.mi.web.service.AdministrationReport report,
           com.hof.mi.web.service.AdministrationReportGroup reportGroup,
           java.lang.Integer reportId,
           java.lang.Integer retrospectiveDays,
           com.hof.mi.web.service.AdministrationRole role,
           com.hof.mi.web.service.schedule.AdministrationSchedule schedule,
           java.lang.String sessionId,
           com.hof.mi.web.service.AdministrationDataSourceClientLink sourceClientLink,
           java.lang.Integer sourceId,
           com.hof.mi.web.service.AdministrationTask task,
           java.lang.String yellowfinContentExportFileType) {
           this.binaryData = binaryData;
           this.client = client;
           this.contentResources = contentResources;
           this.customParameters = customParameters;
           this.dashboardTabId = dashboardTabId;
           this.datasource = datasource;
           this.favourite = favourite;
           this.function = function;
           this.group = group;
           this.importOptions = importOptions;
           this.loginId = loginId;
           this.loginSessionId = loginSessionId;
           this.ntlm = ntlm;
           this.orgId = orgId;
           this.orgRef = orgRef;
           this.parameters = parameters;
           this.password = password;
           this.people = people;
           this.person = person;
           this.query = query;
           this.report = report;
           this.reportGroup = reportGroup;
           this.reportId = reportId;
           this.retrospectiveDays = retrospectiveDays;
           this.role = role;
           this.schedule = schedule;
           this.sessionId = sessionId;
           this.sourceClientLink = sourceClientLink;
           this.sourceId = sourceId;
           this.task = task;
           this.yellowfinContentExportFileType = yellowfinContentExportFileType;
    }


    /**
     * Gets the binaryData value for this AdministrationServiceRequest.
     * 
     * @return binaryData
     */
    public byte[] getBinaryData() {
        return binaryData;
    }


    /**
     * Sets the binaryData value for this AdministrationServiceRequest.
     * 
     * @param binaryData
     */
    public void setBinaryData(byte[] binaryData) {
        this.binaryData = binaryData;
    }


    /**
     * Gets the client value for this AdministrationServiceRequest.
     * 
     * @return client
     */
    public com.hof.mi.web.service.AdministrationClientOrg getClient() {
        return client;
    }


    /**
     * Sets the client value for this AdministrationServiceRequest.
     * 
     * @param client
     */
    public void setClient(com.hof.mi.web.service.AdministrationClientOrg client) {
        this.client = client;
    }


    /**
     * Gets the contentResources value for this AdministrationServiceRequest.
     * 
     * @return contentResources
     */
    public com.hof.mi.web.service.ContentResource[] getContentResources() {
        return contentResources;
    }


    /**
     * Sets the contentResources value for this AdministrationServiceRequest.
     * 
     * @param contentResources
     */
    public void setContentResources(com.hof.mi.web.service.ContentResource[] contentResources) {
        this.contentResources = contentResources;
    }


    /**
     * Gets the customParameters value for this AdministrationServiceRequest.
     * 
     * @return customParameters
     */
    public java.lang.String getCustomParameters() {
        return customParameters;
    }


    /**
     * Sets the customParameters value for this AdministrationServiceRequest.
     * 
     * @param customParameters
     */
    public void setCustomParameters(java.lang.String customParameters) {
        this.customParameters = customParameters;
    }


    /**
     * Gets the dashboardTabId value for this AdministrationServiceRequest.
     * 
     * @return dashboardTabId
     */
    public java.lang.Integer getDashboardTabId() {
        return dashboardTabId;
    }


    /**
     * Sets the dashboardTabId value for this AdministrationServiceRequest.
     * 
     * @param dashboardTabId
     */
    public void setDashboardTabId(java.lang.Integer dashboardTabId) {
        this.dashboardTabId = dashboardTabId;
    }


    /**
     * Gets the datasource value for this AdministrationServiceRequest.
     * 
     * @return datasource
     */
    public com.hof.mi.web.service.AdministrationDataSource getDatasource() {
        return datasource;
    }


    /**
     * Sets the datasource value for this AdministrationServiceRequest.
     * 
     * @param datasource
     */
    public void setDatasource(com.hof.mi.web.service.AdministrationDataSource datasource) {
        this.datasource = datasource;
    }


    /**
     * Gets the favourite value for this AdministrationServiceRequest.
     * 
     * @return favourite
     */
    public com.hof.mi.web.service.PersonFavourite getFavourite() {
        return favourite;
    }


    /**
     * Sets the favourite value for this AdministrationServiceRequest.
     * 
     * @param favourite
     */
    public void setFavourite(com.hof.mi.web.service.PersonFavourite favourite) {
        this.favourite = favourite;
    }


    /**
     * Gets the function value for this AdministrationServiceRequest.
     * 
     * @return function
     */
    public java.lang.String getFunction() {
        return function;
    }


    /**
     * Sets the function value for this AdministrationServiceRequest.
     * 
     * @param function
     */
    public void setFunction(java.lang.String function) {
        this.function = function;
    }


    /**
     * Gets the group value for this AdministrationServiceRequest.
     * 
     * @return group
     */
    public com.hof.mi.web.service.AdministrationGroup getGroup() {
        return group;
    }


    /**
     * Sets the group value for this AdministrationServiceRequest.
     * 
     * @param group
     */
    public void setGroup(com.hof.mi.web.service.AdministrationGroup group) {
        this.group = group;
    }


    /**
     * Gets the importOptions value for this AdministrationServiceRequest.
     * 
     * @return importOptions
     */
    public com.hof.mi.web.service.ImportOption[] getImportOptions() {
        return importOptions;
    }


    /**
     * Sets the importOptions value for this AdministrationServiceRequest.
     * 
     * @param importOptions
     */
    public void setImportOptions(com.hof.mi.web.service.ImportOption[] importOptions) {
        this.importOptions = importOptions;
    }


    /**
     * Gets the loginId value for this AdministrationServiceRequest.
     * 
     * @return loginId
     */
    public java.lang.String getLoginId() {
        return loginId;
    }


    /**
     * Sets the loginId value for this AdministrationServiceRequest.
     * 
     * @param loginId
     */
    public void setLoginId(java.lang.String loginId) {
        this.loginId = loginId;
    }


    /**
     * Gets the loginSessionId value for this AdministrationServiceRequest.
     * 
     * @return loginSessionId
     */
    public java.lang.String getLoginSessionId() {
        return loginSessionId;
    }


    /**
     * Sets the loginSessionId value for this AdministrationServiceRequest.
     * 
     * @param loginSessionId
     */
    public void setLoginSessionId(java.lang.String loginSessionId) {
        this.loginSessionId = loginSessionId;
    }


    /**
     * Gets the ntlm value for this AdministrationServiceRequest.
     * 
     * @return ntlm
     */
    public boolean isNtlm() {
        return ntlm;
    }


    /**
     * Sets the ntlm value for this AdministrationServiceRequest.
     * 
     * @param ntlm
     */
    public void setNtlm(boolean ntlm) {
        this.ntlm = ntlm;
    }


    /**
     * Gets the orgId value for this AdministrationServiceRequest.
     * 
     * @return orgId
     */
    public java.lang.Integer getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this AdministrationServiceRequest.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.Integer orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the orgRef value for this AdministrationServiceRequest.
     * 
     * @return orgRef
     */
    public java.lang.String getOrgRef() {
        return orgRef;
    }


    /**
     * Sets the orgRef value for this AdministrationServiceRequest.
     * 
     * @param orgRef
     */
    public void setOrgRef(java.lang.String orgRef) {
        this.orgRef = orgRef;
    }


    /**
     * Gets the parameters value for this AdministrationServiceRequest.
     * 
     * @return parameters
     */
    public java.lang.String[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this AdministrationServiceRequest.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String[] parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the password value for this AdministrationServiceRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AdministrationServiceRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the people value for this AdministrationServiceRequest.
     * 
     * @return people
     */
    public com.hof.mi.web.service.AdministrationPerson[] getPeople() {
        return people;
    }


    /**
     * Sets the people value for this AdministrationServiceRequest.
     * 
     * @param people
     */
    public void setPeople(com.hof.mi.web.service.AdministrationPerson[] people) {
        this.people = people;
    }


    /**
     * Gets the person value for this AdministrationServiceRequest.
     * 
     * @return person
     */
    public com.hof.mi.web.service.AdministrationPerson getPerson() {
        return person;
    }


    /**
     * Sets the person value for this AdministrationServiceRequest.
     * 
     * @param person
     */
    public void setPerson(com.hof.mi.web.service.AdministrationPerson person) {
        this.person = person;
    }


    /**
     * Gets the query value for this AdministrationServiceRequest.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this AdministrationServiceRequest.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the report value for this AdministrationServiceRequest.
     * 
     * @return report
     */
    public com.hof.mi.web.service.AdministrationReport getReport() {
        return report;
    }


    /**
     * Sets the report value for this AdministrationServiceRequest.
     * 
     * @param report
     */
    public void setReport(com.hof.mi.web.service.AdministrationReport report) {
        this.report = report;
    }


    /**
     * Gets the reportGroup value for this AdministrationServiceRequest.
     * 
     * @return reportGroup
     */
    public com.hof.mi.web.service.AdministrationReportGroup getReportGroup() {
        return reportGroup;
    }


    /**
     * Sets the reportGroup value for this AdministrationServiceRequest.
     * 
     * @param reportGroup
     */
    public void setReportGroup(com.hof.mi.web.service.AdministrationReportGroup reportGroup) {
        this.reportGroup = reportGroup;
    }


    /**
     * Gets the reportId value for this AdministrationServiceRequest.
     * 
     * @return reportId
     */
    public java.lang.Integer getReportId() {
        return reportId;
    }


    /**
     * Sets the reportId value for this AdministrationServiceRequest.
     * 
     * @param reportId
     */
    public void setReportId(java.lang.Integer reportId) {
        this.reportId = reportId;
    }


    /**
     * Gets the retrospectiveDays value for this AdministrationServiceRequest.
     * 
     * @return retrospectiveDays
     */
    public java.lang.Integer getRetrospectiveDays() {
        return retrospectiveDays;
    }


    /**
     * Sets the retrospectiveDays value for this AdministrationServiceRequest.
     * 
     * @param retrospectiveDays
     */
    public void setRetrospectiveDays(java.lang.Integer retrospectiveDays) {
        this.retrospectiveDays = retrospectiveDays;
    }


    /**
     * Gets the role value for this AdministrationServiceRequest.
     * 
     * @return role
     */
    public com.hof.mi.web.service.AdministrationRole getRole() {
        return role;
    }


    /**
     * Sets the role value for this AdministrationServiceRequest.
     * 
     * @param role
     */
    public void setRole(com.hof.mi.web.service.AdministrationRole role) {
        this.role = role;
    }


    /**
     * Gets the schedule value for this AdministrationServiceRequest.
     * 
     * @return schedule
     */
    public com.hof.mi.web.service.schedule.AdministrationSchedule getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this AdministrationServiceRequest.
     * 
     * @param schedule
     */
    public void setSchedule(com.hof.mi.web.service.schedule.AdministrationSchedule schedule) {
        this.schedule = schedule;
    }


    /**
     * Gets the sessionId value for this AdministrationServiceRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this AdministrationServiceRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the sourceClientLink value for this AdministrationServiceRequest.
     * 
     * @return sourceClientLink
     */
    public com.hof.mi.web.service.AdministrationDataSourceClientLink getSourceClientLink() {
        return sourceClientLink;
    }


    /**
     * Sets the sourceClientLink value for this AdministrationServiceRequest.
     * 
     * @param sourceClientLink
     */
    public void setSourceClientLink(com.hof.mi.web.service.AdministrationDataSourceClientLink sourceClientLink) {
        this.sourceClientLink = sourceClientLink;
    }


    /**
     * Gets the sourceId value for this AdministrationServiceRequest.
     * 
     * @return sourceId
     */
    public java.lang.Integer getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this AdministrationServiceRequest.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.Integer sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the task value for this AdministrationServiceRequest.
     * 
     * @return task
     */
    public com.hof.mi.web.service.AdministrationTask getTask() {
        return task;
    }


    /**
     * Sets the task value for this AdministrationServiceRequest.
     * 
     * @param task
     */
    public void setTask(com.hof.mi.web.service.AdministrationTask task) {
        this.task = task;
    }


    /**
     * Gets the yellowfinContentExportFileType value for this AdministrationServiceRequest.
     * 
     * @return yellowfinContentExportFileType
     */
    public java.lang.String getYellowfinContentExportFileType() {
        return yellowfinContentExportFileType;
    }


    /**
     * Sets the yellowfinContentExportFileType value for this AdministrationServiceRequest.
     * 
     * @param yellowfinContentExportFileType
     */
    public void setYellowfinContentExportFileType(java.lang.String yellowfinContentExportFileType) {
        this.yellowfinContentExportFileType = yellowfinContentExportFileType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationServiceRequest)) return false;
        AdministrationServiceRequest other = (AdministrationServiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.binaryData==null && other.getBinaryData()==null) || 
             (this.binaryData!=null &&
              java.util.Arrays.equals(this.binaryData, other.getBinaryData()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.contentResources==null && other.getContentResources()==null) || 
             (this.contentResources!=null &&
              java.util.Arrays.equals(this.contentResources, other.getContentResources()))) &&
            ((this.customParameters==null && other.getCustomParameters()==null) || 
             (this.customParameters!=null &&
              this.customParameters.equals(other.getCustomParameters()))) &&
            ((this.dashboardTabId==null && other.getDashboardTabId()==null) || 
             (this.dashboardTabId!=null &&
              this.dashboardTabId.equals(other.getDashboardTabId()))) &&
            ((this.datasource==null && other.getDatasource()==null) || 
             (this.datasource!=null &&
              this.datasource.equals(other.getDatasource()))) &&
            ((this.favourite==null && other.getFavourite()==null) || 
             (this.favourite!=null &&
              this.favourite.equals(other.getFavourite()))) &&
            ((this.function==null && other.getFunction()==null) || 
             (this.function!=null &&
              this.function.equals(other.getFunction()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.importOptions==null && other.getImportOptions()==null) || 
             (this.importOptions!=null &&
              java.util.Arrays.equals(this.importOptions, other.getImportOptions()))) &&
            ((this.loginId==null && other.getLoginId()==null) || 
             (this.loginId!=null &&
              this.loginId.equals(other.getLoginId()))) &&
            ((this.loginSessionId==null && other.getLoginSessionId()==null) || 
             (this.loginSessionId!=null &&
              this.loginSessionId.equals(other.getLoginSessionId()))) &&
            this.ntlm == other.isNtlm() &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.orgRef==null && other.getOrgRef()==null) || 
             (this.orgRef!=null &&
              this.orgRef.equals(other.getOrgRef()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.people==null && other.getPeople()==null) || 
             (this.people!=null &&
              java.util.Arrays.equals(this.people, other.getPeople()))) &&
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport()))) &&
            ((this.reportGroup==null && other.getReportGroup()==null) || 
             (this.reportGroup!=null &&
              this.reportGroup.equals(other.getReportGroup()))) &&
            ((this.reportId==null && other.getReportId()==null) || 
             (this.reportId!=null &&
              this.reportId.equals(other.getReportId()))) &&
            ((this.retrospectiveDays==null && other.getRetrospectiveDays()==null) || 
             (this.retrospectiveDays!=null &&
              this.retrospectiveDays.equals(other.getRetrospectiveDays()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              this.schedule.equals(other.getSchedule()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.sourceClientLink==null && other.getSourceClientLink()==null) || 
             (this.sourceClientLink!=null &&
              this.sourceClientLink.equals(other.getSourceClientLink()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.task==null && other.getTask()==null) || 
             (this.task!=null &&
              this.task.equals(other.getTask()))) &&
            ((this.yellowfinContentExportFileType==null && other.getYellowfinContentExportFileType()==null) || 
             (this.yellowfinContentExportFileType!=null &&
              this.yellowfinContentExportFileType.equals(other.getYellowfinContentExportFileType())));
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
        if (getBinaryData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinaryData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinaryData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
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
        if (getCustomParameters() != null) {
            _hashCode += getCustomParameters().hashCode();
        }
        if (getDashboardTabId() != null) {
            _hashCode += getDashboardTabId().hashCode();
        }
        if (getDatasource() != null) {
            _hashCode += getDatasource().hashCode();
        }
        if (getFavourite() != null) {
            _hashCode += getFavourite().hashCode();
        }
        if (getFunction() != null) {
            _hashCode += getFunction().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getImportOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImportOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImportOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoginId() != null) {
            _hashCode += getLoginId().hashCode();
        }
        if (getLoginSessionId() != null) {
            _hashCode += getLoginSessionId().hashCode();
        }
        _hashCode += (isNtlm() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getOrgRef() != null) {
            _hashCode += getOrgRef().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        if (getReportGroup() != null) {
            _hashCode += getReportGroup().hashCode();
        }
        if (getReportId() != null) {
            _hashCode += getReportId().hashCode();
        }
        if (getRetrospectiveDays() != null) {
            _hashCode += getRetrospectiveDays().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getSchedule() != null) {
            _hashCode += getSchedule().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getSourceClientLink() != null) {
            _hashCode += getSourceClientLink().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getTask() != null) {
            _hashCode += getTask().hashCode();
        }
        if (getYellowfinContentExportFileType() != null) {
            _hashCode += getYellowfinContentExportFileType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationServiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationServiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binaryData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "binaryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "client"));
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
        elemField.setFieldName("customParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardTabId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dashboardTabId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datasource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datasource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSource"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favourite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "favourite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "PersonFavourite"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function");
        elemField.setXmlName(new javax.xml.namespace.QName("", "function"));
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
        elemField.setFieldName("importOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportOption"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ntlm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ntlm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReport"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroup"));
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
        elemField.setFieldName("retrospectiveDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrospectiveDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
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
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceClientLink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceClientLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceClientLink"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task");
        elemField.setXmlName(new javax.xml.namespace.QName("", "task"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationTask"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yellowfinContentExportFileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yellowfinContentExportFileType"));
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
