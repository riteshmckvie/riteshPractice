/**
 * AdministrationDataSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationDataSource  implements java.io.Serializable {
    private java.lang.String accessLevelCode;

    private com.hof.mi.web.service.AdministrationDataSourceClientLink[] clientSources;

    private java.lang.String connectionDriver;

    private java.lang.String connectionPath;

    private java.lang.String connectionString;

    private java.lang.Integer connectionTimeout;

    private java.lang.String connectionType;

    private java.lang.String connectionTypeCode;

    private boolean inheritChildSourceFilters;

    private java.lang.String logFile;

    private java.lang.Integer maxRows;

    private java.lang.Integer maxmimumConnections;

    private java.lang.Integer minimumConnections;

    private java.lang.Integer refreshTime;

    private java.lang.String sourceDescription;

    private java.lang.Integer sourceId;

    private java.lang.String sourceName;

    private com.hof.mi.web.service.AdministrationDataSourceOption[] sourceOptions;

    private java.lang.String sourceType;

    private java.lang.String timezone;

    private java.lang.String userName;

    private java.lang.String userPassword;

    public AdministrationDataSource() {
    }

    public AdministrationDataSource(
           java.lang.String accessLevelCode,
           com.hof.mi.web.service.AdministrationDataSourceClientLink[] clientSources,
           java.lang.String connectionDriver,
           java.lang.String connectionPath,
           java.lang.String connectionString,
           java.lang.Integer connectionTimeout,
           java.lang.String connectionType,
           java.lang.String connectionTypeCode,
           boolean inheritChildSourceFilters,
           java.lang.String logFile,
           java.lang.Integer maxRows,
           java.lang.Integer maxmimumConnections,
           java.lang.Integer minimumConnections,
           java.lang.Integer refreshTime,
           java.lang.String sourceDescription,
           java.lang.Integer sourceId,
           java.lang.String sourceName,
           com.hof.mi.web.service.AdministrationDataSourceOption[] sourceOptions,
           java.lang.String sourceType,
           java.lang.String timezone,
           java.lang.String userName,
           java.lang.String userPassword) {
           this.accessLevelCode = accessLevelCode;
           this.clientSources = clientSources;
           this.connectionDriver = connectionDriver;
           this.connectionPath = connectionPath;
           this.connectionString = connectionString;
           this.connectionTimeout = connectionTimeout;
           this.connectionType = connectionType;
           this.connectionTypeCode = connectionTypeCode;
           this.inheritChildSourceFilters = inheritChildSourceFilters;
           this.logFile = logFile;
           this.maxRows = maxRows;
           this.maxmimumConnections = maxmimumConnections;
           this.minimumConnections = minimumConnections;
           this.refreshTime = refreshTime;
           this.sourceDescription = sourceDescription;
           this.sourceId = sourceId;
           this.sourceName = sourceName;
           this.sourceOptions = sourceOptions;
           this.sourceType = sourceType;
           this.timezone = timezone;
           this.userName = userName;
           this.userPassword = userPassword;
    }


    /**
     * Gets the accessLevelCode value for this AdministrationDataSource.
     * 
     * @return accessLevelCode
     */
    public java.lang.String getAccessLevelCode() {
        return accessLevelCode;
    }


    /**
     * Sets the accessLevelCode value for this AdministrationDataSource.
     * 
     * @param accessLevelCode
     */
    public void setAccessLevelCode(java.lang.String accessLevelCode) {
        this.accessLevelCode = accessLevelCode;
    }


    /**
     * Gets the clientSources value for this AdministrationDataSource.
     * 
     * @return clientSources
     */
    public com.hof.mi.web.service.AdministrationDataSourceClientLink[] getClientSources() {
        return clientSources;
    }


    /**
     * Sets the clientSources value for this AdministrationDataSource.
     * 
     * @param clientSources
     */
    public void setClientSources(com.hof.mi.web.service.AdministrationDataSourceClientLink[] clientSources) {
        this.clientSources = clientSources;
    }


    /**
     * Gets the connectionDriver value for this AdministrationDataSource.
     * 
     * @return connectionDriver
     */
    public java.lang.String getConnectionDriver() {
        return connectionDriver;
    }


    /**
     * Sets the connectionDriver value for this AdministrationDataSource.
     * 
     * @param connectionDriver
     */
    public void setConnectionDriver(java.lang.String connectionDriver) {
        this.connectionDriver = connectionDriver;
    }


    /**
     * Gets the connectionPath value for this AdministrationDataSource.
     * 
     * @return connectionPath
     */
    public java.lang.String getConnectionPath() {
        return connectionPath;
    }


    /**
     * Sets the connectionPath value for this AdministrationDataSource.
     * 
     * @param connectionPath
     */
    public void setConnectionPath(java.lang.String connectionPath) {
        this.connectionPath = connectionPath;
    }


    /**
     * Gets the connectionString value for this AdministrationDataSource.
     * 
     * @return connectionString
     */
    public java.lang.String getConnectionString() {
        return connectionString;
    }


    /**
     * Sets the connectionString value for this AdministrationDataSource.
     * 
     * @param connectionString
     */
    public void setConnectionString(java.lang.String connectionString) {
        this.connectionString = connectionString;
    }


    /**
     * Gets the connectionTimeout value for this AdministrationDataSource.
     * 
     * @return connectionTimeout
     */
    public java.lang.Integer getConnectionTimeout() {
        return connectionTimeout;
    }


    /**
     * Sets the connectionTimeout value for this AdministrationDataSource.
     * 
     * @param connectionTimeout
     */
    public void setConnectionTimeout(java.lang.Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }


    /**
     * Gets the connectionType value for this AdministrationDataSource.
     * 
     * @return connectionType
     */
    public java.lang.String getConnectionType() {
        return connectionType;
    }


    /**
     * Sets the connectionType value for this AdministrationDataSource.
     * 
     * @param connectionType
     */
    public void setConnectionType(java.lang.String connectionType) {
        this.connectionType = connectionType;
    }


    /**
     * Gets the connectionTypeCode value for this AdministrationDataSource.
     * 
     * @return connectionTypeCode
     */
    public java.lang.String getConnectionTypeCode() {
        return connectionTypeCode;
    }


    /**
     * Sets the connectionTypeCode value for this AdministrationDataSource.
     * 
     * @param connectionTypeCode
     */
    public void setConnectionTypeCode(java.lang.String connectionTypeCode) {
        this.connectionTypeCode = connectionTypeCode;
    }


    /**
     * Gets the inheritChildSourceFilters value for this AdministrationDataSource.
     * 
     * @return inheritChildSourceFilters
     */
    public boolean isInheritChildSourceFilters() {
        return inheritChildSourceFilters;
    }


    /**
     * Sets the inheritChildSourceFilters value for this AdministrationDataSource.
     * 
     * @param inheritChildSourceFilters
     */
    public void setInheritChildSourceFilters(boolean inheritChildSourceFilters) {
        this.inheritChildSourceFilters = inheritChildSourceFilters;
    }


    /**
     * Gets the logFile value for this AdministrationDataSource.
     * 
     * @return logFile
     */
    public java.lang.String getLogFile() {
        return logFile;
    }


    /**
     * Sets the logFile value for this AdministrationDataSource.
     * 
     * @param logFile
     */
    public void setLogFile(java.lang.String logFile) {
        this.logFile = logFile;
    }


    /**
     * Gets the maxRows value for this AdministrationDataSource.
     * 
     * @return maxRows
     */
    public java.lang.Integer getMaxRows() {
        return maxRows;
    }


    /**
     * Sets the maxRows value for this AdministrationDataSource.
     * 
     * @param maxRows
     */
    public void setMaxRows(java.lang.Integer maxRows) {
        this.maxRows = maxRows;
    }


    /**
     * Gets the maxmimumConnections value for this AdministrationDataSource.
     * 
     * @return maxmimumConnections
     */
    public java.lang.Integer getMaxmimumConnections() {
        return maxmimumConnections;
    }


    /**
     * Sets the maxmimumConnections value for this AdministrationDataSource.
     * 
     * @param maxmimumConnections
     */
    public void setMaxmimumConnections(java.lang.Integer maxmimumConnections) {
        this.maxmimumConnections = maxmimumConnections;
    }


    /**
     * Gets the minimumConnections value for this AdministrationDataSource.
     * 
     * @return minimumConnections
     */
    public java.lang.Integer getMinimumConnections() {
        return minimumConnections;
    }


    /**
     * Sets the minimumConnections value for this AdministrationDataSource.
     * 
     * @param minimumConnections
     */
    public void setMinimumConnections(java.lang.Integer minimumConnections) {
        this.minimumConnections = minimumConnections;
    }


    /**
     * Gets the refreshTime value for this AdministrationDataSource.
     * 
     * @return refreshTime
     */
    public java.lang.Integer getRefreshTime() {
        return refreshTime;
    }


    /**
     * Sets the refreshTime value for this AdministrationDataSource.
     * 
     * @param refreshTime
     */
    public void setRefreshTime(java.lang.Integer refreshTime) {
        this.refreshTime = refreshTime;
    }


    /**
     * Gets the sourceDescription value for this AdministrationDataSource.
     * 
     * @return sourceDescription
     */
    public java.lang.String getSourceDescription() {
        return sourceDescription;
    }


    /**
     * Sets the sourceDescription value for this AdministrationDataSource.
     * 
     * @param sourceDescription
     */
    public void setSourceDescription(java.lang.String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }


    /**
     * Gets the sourceId value for this AdministrationDataSource.
     * 
     * @return sourceId
     */
    public java.lang.Integer getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this AdministrationDataSource.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.Integer sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the sourceName value for this AdministrationDataSource.
     * 
     * @return sourceName
     */
    public java.lang.String getSourceName() {
        return sourceName;
    }


    /**
     * Sets the sourceName value for this AdministrationDataSource.
     * 
     * @param sourceName
     */
    public void setSourceName(java.lang.String sourceName) {
        this.sourceName = sourceName;
    }


    /**
     * Gets the sourceOptions value for this AdministrationDataSource.
     * 
     * @return sourceOptions
     */
    public com.hof.mi.web.service.AdministrationDataSourceOption[] getSourceOptions() {
        return sourceOptions;
    }


    /**
     * Sets the sourceOptions value for this AdministrationDataSource.
     * 
     * @param sourceOptions
     */
    public void setSourceOptions(com.hof.mi.web.service.AdministrationDataSourceOption[] sourceOptions) {
        this.sourceOptions = sourceOptions;
    }


    /**
     * Gets the sourceType value for this AdministrationDataSource.
     * 
     * @return sourceType
     */
    public java.lang.String getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this AdministrationDataSource.
     * 
     * @param sourceType
     */
    public void setSourceType(java.lang.String sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the timezone value for this AdministrationDataSource.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this AdministrationDataSource.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the userName value for this AdministrationDataSource.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this AdministrationDataSource.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPassword value for this AdministrationDataSource.
     * 
     * @return userPassword
     */
    public java.lang.String getUserPassword() {
        return userPassword;
    }


    /**
     * Sets the userPassword value for this AdministrationDataSource.
     * 
     * @param userPassword
     */
    public void setUserPassword(java.lang.String userPassword) {
        this.userPassword = userPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationDataSource)) return false;
        AdministrationDataSource other = (AdministrationDataSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessLevelCode==null && other.getAccessLevelCode()==null) || 
             (this.accessLevelCode!=null &&
              this.accessLevelCode.equals(other.getAccessLevelCode()))) &&
            ((this.clientSources==null && other.getClientSources()==null) || 
             (this.clientSources!=null &&
              java.util.Arrays.equals(this.clientSources, other.getClientSources()))) &&
            ((this.connectionDriver==null && other.getConnectionDriver()==null) || 
             (this.connectionDriver!=null &&
              this.connectionDriver.equals(other.getConnectionDriver()))) &&
            ((this.connectionPath==null && other.getConnectionPath()==null) || 
             (this.connectionPath!=null &&
              this.connectionPath.equals(other.getConnectionPath()))) &&
            ((this.connectionString==null && other.getConnectionString()==null) || 
             (this.connectionString!=null &&
              this.connectionString.equals(other.getConnectionString()))) &&
            ((this.connectionTimeout==null && other.getConnectionTimeout()==null) || 
             (this.connectionTimeout!=null &&
              this.connectionTimeout.equals(other.getConnectionTimeout()))) &&
            ((this.connectionType==null && other.getConnectionType()==null) || 
             (this.connectionType!=null &&
              this.connectionType.equals(other.getConnectionType()))) &&
            ((this.connectionTypeCode==null && other.getConnectionTypeCode()==null) || 
             (this.connectionTypeCode!=null &&
              this.connectionTypeCode.equals(other.getConnectionTypeCode()))) &&
            this.inheritChildSourceFilters == other.isInheritChildSourceFilters() &&
            ((this.logFile==null && other.getLogFile()==null) || 
             (this.logFile!=null &&
              this.logFile.equals(other.getLogFile()))) &&
            ((this.maxRows==null && other.getMaxRows()==null) || 
             (this.maxRows!=null &&
              this.maxRows.equals(other.getMaxRows()))) &&
            ((this.maxmimumConnections==null && other.getMaxmimumConnections()==null) || 
             (this.maxmimumConnections!=null &&
              this.maxmimumConnections.equals(other.getMaxmimumConnections()))) &&
            ((this.minimumConnections==null && other.getMinimumConnections()==null) || 
             (this.minimumConnections!=null &&
              this.minimumConnections.equals(other.getMinimumConnections()))) &&
            ((this.refreshTime==null && other.getRefreshTime()==null) || 
             (this.refreshTime!=null &&
              this.refreshTime.equals(other.getRefreshTime()))) &&
            ((this.sourceDescription==null && other.getSourceDescription()==null) || 
             (this.sourceDescription!=null &&
              this.sourceDescription.equals(other.getSourceDescription()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.sourceName==null && other.getSourceName()==null) || 
             (this.sourceName!=null &&
              this.sourceName.equals(other.getSourceName()))) &&
            ((this.sourceOptions==null && other.getSourceOptions()==null) || 
             (this.sourceOptions!=null &&
              java.util.Arrays.equals(this.sourceOptions, other.getSourceOptions()))) &&
            ((this.sourceType==null && other.getSourceType()==null) || 
             (this.sourceType!=null &&
              this.sourceType.equals(other.getSourceType()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPassword==null && other.getUserPassword()==null) || 
             (this.userPassword!=null &&
              this.userPassword.equals(other.getUserPassword())));
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
        if (getAccessLevelCode() != null) {
            _hashCode += getAccessLevelCode().hashCode();
        }
        if (getClientSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientSources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientSources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnectionDriver() != null) {
            _hashCode += getConnectionDriver().hashCode();
        }
        if (getConnectionPath() != null) {
            _hashCode += getConnectionPath().hashCode();
        }
        if (getConnectionString() != null) {
            _hashCode += getConnectionString().hashCode();
        }
        if (getConnectionTimeout() != null) {
            _hashCode += getConnectionTimeout().hashCode();
        }
        if (getConnectionType() != null) {
            _hashCode += getConnectionType().hashCode();
        }
        if (getConnectionTypeCode() != null) {
            _hashCode += getConnectionTypeCode().hashCode();
        }
        _hashCode += (isInheritChildSourceFilters() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLogFile() != null) {
            _hashCode += getLogFile().hashCode();
        }
        if (getMaxRows() != null) {
            _hashCode += getMaxRows().hashCode();
        }
        if (getMaxmimumConnections() != null) {
            _hashCode += getMaxmimumConnections().hashCode();
        }
        if (getMinimumConnections() != null) {
            _hashCode += getMinimumConnections().hashCode();
        }
        if (getRefreshTime() != null) {
            _hashCode += getRefreshTime().hashCode();
        }
        if (getSourceDescription() != null) {
            _hashCode += getSourceDescription().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getSourceName() != null) {
            _hashCode += getSourceName().hashCode();
        }
        if (getSourceOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceType() != null) {
            _hashCode += getSourceType().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPassword() != null) {
            _hashCode += getUserPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationDataSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessLevelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientSources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceClientLink"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionDriver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionDriver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritChildSourceFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inheritChildSourceFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxmimumConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxmimumConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refreshTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceOption"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPassword"));
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
