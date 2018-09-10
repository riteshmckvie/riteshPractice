/**
 * ReportBroadcastSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public class ReportBroadcastSchedule  extends com.hof.mi.web.service.schedule.AdministrationSchedule  implements java.io.Serializable {
    private java.lang.Boolean appendDate;

    private java.lang.String bodyText;

    private java.util.Calendar broadcastEndDate;

    private java.util.Calendar broadcastStartDate;

    private com.hof.mi.web.service.Condition[] conditionList;

    private java.lang.Integer failureNotificationGroup;

    private java.lang.String format;

    private int[] recipients;

    private java.lang.Integer reportId;

    private java.lang.String subject;

    public ReportBroadcastSchedule() {
    }

    public ReportBroadcastSchedule(
           com.hof.mi.web.service.schedule.ScheduleFrequency frequency,
           java.util.Calendar lastRunDateTimeGMT,
           java.lang.String lastRunError,
           java.lang.String lastRunStatus,
           java.util.Calendar nextRunDateTimeGMT,
           boolean scheduleActive,
           java.lang.String scheduleDescription,
           java.lang.String scheduleTypeCode,
           java.lang.String scheduleUUID,
           java.lang.Boolean appendDate,
           java.lang.String bodyText,
           java.util.Calendar broadcastEndDate,
           java.util.Calendar broadcastStartDate,
           com.hof.mi.web.service.Condition[] conditionList,
           java.lang.Integer failureNotificationGroup,
           java.lang.String format,
           int[] recipients,
           java.lang.Integer reportId,
           java.lang.String subject) {
        super(
            frequency,
            lastRunDateTimeGMT,
            lastRunError,
            lastRunStatus,
            nextRunDateTimeGMT,
            scheduleActive,
            scheduleDescription,
            scheduleTypeCode,
            scheduleUUID);
        this.appendDate = appendDate;
        this.bodyText = bodyText;
        this.broadcastEndDate = broadcastEndDate;
        this.broadcastStartDate = broadcastStartDate;
        this.conditionList = conditionList;
        this.failureNotificationGroup = failureNotificationGroup;
        this.format = format;
        this.recipients = recipients;
        this.reportId = reportId;
        this.subject = subject;
    }


    /**
     * Gets the appendDate value for this ReportBroadcastSchedule.
     * 
     * @return appendDate
     */
    public java.lang.Boolean getAppendDate() {
        return appendDate;
    }


    /**
     * Sets the appendDate value for this ReportBroadcastSchedule.
     * 
     * @param appendDate
     */
    public void setAppendDate(java.lang.Boolean appendDate) {
        this.appendDate = appendDate;
    }


    /**
     * Gets the bodyText value for this ReportBroadcastSchedule.
     * 
     * @return bodyText
     */
    public java.lang.String getBodyText() {
        return bodyText;
    }


    /**
     * Sets the bodyText value for this ReportBroadcastSchedule.
     * 
     * @param bodyText
     */
    public void setBodyText(java.lang.String bodyText) {
        this.bodyText = bodyText;
    }


    /**
     * Gets the broadcastEndDate value for this ReportBroadcastSchedule.
     * 
     * @return broadcastEndDate
     */
    public java.util.Calendar getBroadcastEndDate() {
        return broadcastEndDate;
    }


    /**
     * Sets the broadcastEndDate value for this ReportBroadcastSchedule.
     * 
     * @param broadcastEndDate
     */
    public void setBroadcastEndDate(java.util.Calendar broadcastEndDate) {
        this.broadcastEndDate = broadcastEndDate;
    }


    /**
     * Gets the broadcastStartDate value for this ReportBroadcastSchedule.
     * 
     * @return broadcastStartDate
     */
    public java.util.Calendar getBroadcastStartDate() {
        return broadcastStartDate;
    }


    /**
     * Sets the broadcastStartDate value for this ReportBroadcastSchedule.
     * 
     * @param broadcastStartDate
     */
    public void setBroadcastStartDate(java.util.Calendar broadcastStartDate) {
        this.broadcastStartDate = broadcastStartDate;
    }


    /**
     * Gets the conditionList value for this ReportBroadcastSchedule.
     * 
     * @return conditionList
     */
    public com.hof.mi.web.service.Condition[] getConditionList() {
        return conditionList;
    }


    /**
     * Sets the conditionList value for this ReportBroadcastSchedule.
     * 
     * @param conditionList
     */
    public void setConditionList(com.hof.mi.web.service.Condition[] conditionList) {
        this.conditionList = conditionList;
    }


    /**
     * Gets the failureNotificationGroup value for this ReportBroadcastSchedule.
     * 
     * @return failureNotificationGroup
     */
    public java.lang.Integer getFailureNotificationGroup() {
        return failureNotificationGroup;
    }


    /**
     * Sets the failureNotificationGroup value for this ReportBroadcastSchedule.
     * 
     * @param failureNotificationGroup
     */
    public void setFailureNotificationGroup(java.lang.Integer failureNotificationGroup) {
        this.failureNotificationGroup = failureNotificationGroup;
    }


    /**
     * Gets the format value for this ReportBroadcastSchedule.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ReportBroadcastSchedule.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the recipients value for this ReportBroadcastSchedule.
     * 
     * @return recipients
     */
    public int[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this ReportBroadcastSchedule.
     * 
     * @param recipients
     */
    public void setRecipients(int[] recipients) {
        this.recipients = recipients;
    }


    /**
     * Gets the reportId value for this ReportBroadcastSchedule.
     * 
     * @return reportId
     */
    public java.lang.Integer getReportId() {
        return reportId;
    }


    /**
     * Sets the reportId value for this ReportBroadcastSchedule.
     * 
     * @param reportId
     */
    public void setReportId(java.lang.Integer reportId) {
        this.reportId = reportId;
    }


    /**
     * Gets the subject value for this ReportBroadcastSchedule.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ReportBroadcastSchedule.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportBroadcastSchedule)) return false;
        ReportBroadcastSchedule other = (ReportBroadcastSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appendDate==null && other.getAppendDate()==null) || 
             (this.appendDate!=null &&
              this.appendDate.equals(other.getAppendDate()))) &&
            ((this.bodyText==null && other.getBodyText()==null) || 
             (this.bodyText!=null &&
              this.bodyText.equals(other.getBodyText()))) &&
            ((this.broadcastEndDate==null && other.getBroadcastEndDate()==null) || 
             (this.broadcastEndDate!=null &&
              this.broadcastEndDate.equals(other.getBroadcastEndDate()))) &&
            ((this.broadcastStartDate==null && other.getBroadcastStartDate()==null) || 
             (this.broadcastStartDate!=null &&
              this.broadcastStartDate.equals(other.getBroadcastStartDate()))) &&
            ((this.conditionList==null && other.getConditionList()==null) || 
             (this.conditionList!=null &&
              java.util.Arrays.equals(this.conditionList, other.getConditionList()))) &&
            ((this.failureNotificationGroup==null && other.getFailureNotificationGroup()==null) || 
             (this.failureNotificationGroup!=null &&
              this.failureNotificationGroup.equals(other.getFailureNotificationGroup()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients()))) &&
            ((this.reportId==null && other.getReportId()==null) || 
             (this.reportId!=null &&
              this.reportId.equals(other.getReportId()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAppendDate() != null) {
            _hashCode += getAppendDate().hashCode();
        }
        if (getBodyText() != null) {
            _hashCode += getBodyText().hashCode();
        }
        if (getBroadcastEndDate() != null) {
            _hashCode += getBroadcastEndDate().hashCode();
        }
        if (getBroadcastStartDate() != null) {
            _hashCode += getBroadcastStartDate().hashCode();
        }
        if (getConditionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConditionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConditionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailureNotificationGroup() != null) {
            _hashCode += getFailureNotificationGroup().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReportId() != null) {
            _hashCode += getReportId().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportBroadcastSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ReportBroadcastSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bodyText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadcastEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "broadcastEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadcastStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "broadcastStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conditionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "Condition"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureNotificationGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failureNotificationGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
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
