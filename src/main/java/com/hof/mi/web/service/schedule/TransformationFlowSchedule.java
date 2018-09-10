/**
 * TransformationFlowSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public class TransformationFlowSchedule  extends com.hof.mi.web.service.schedule.AdministrationSchedule  implements java.io.Serializable {
    private java.lang.Integer failureNotificationGroup;

    private java.util.Calendar scheduleEndDate;

    private java.util.Calendar scheduleStartDate;

    private int[] successNotifyRecipients;

    private java.lang.Integer transformationId;

    public TransformationFlowSchedule() {
    }

    public TransformationFlowSchedule(
           com.hof.mi.web.service.schedule.ScheduleFrequency frequency,
           java.util.Calendar lastRunDateTimeGMT,
           java.lang.String lastRunError,
           java.lang.String lastRunStatus,
           java.util.Calendar nextRunDateTimeGMT,
           boolean scheduleActive,
           java.lang.String scheduleDescription,
           java.lang.String scheduleTypeCode,
           java.lang.String scheduleUUID,
           java.lang.Integer failureNotificationGroup,
           java.util.Calendar scheduleEndDate,
           java.util.Calendar scheduleStartDate,
           int[] successNotifyRecipients,
           java.lang.Integer transformationId) {
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
        this.failureNotificationGroup = failureNotificationGroup;
        this.scheduleEndDate = scheduleEndDate;
        this.scheduleStartDate = scheduleStartDate;
        this.successNotifyRecipients = successNotifyRecipients;
        this.transformationId = transformationId;
    }


    /**
     * Gets the failureNotificationGroup value for this TransformationFlowSchedule.
     * 
     * @return failureNotificationGroup
     */
    public java.lang.Integer getFailureNotificationGroup() {
        return failureNotificationGroup;
    }


    /**
     * Sets the failureNotificationGroup value for this TransformationFlowSchedule.
     * 
     * @param failureNotificationGroup
     */
    public void setFailureNotificationGroup(java.lang.Integer failureNotificationGroup) {
        this.failureNotificationGroup = failureNotificationGroup;
    }


    /**
     * Gets the scheduleEndDate value for this TransformationFlowSchedule.
     * 
     * @return scheduleEndDate
     */
    public java.util.Calendar getScheduleEndDate() {
        return scheduleEndDate;
    }


    /**
     * Sets the scheduleEndDate value for this TransformationFlowSchedule.
     * 
     * @param scheduleEndDate
     */
    public void setScheduleEndDate(java.util.Calendar scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
    }


    /**
     * Gets the scheduleStartDate value for this TransformationFlowSchedule.
     * 
     * @return scheduleStartDate
     */
    public java.util.Calendar getScheduleStartDate() {
        return scheduleStartDate;
    }


    /**
     * Sets the scheduleStartDate value for this TransformationFlowSchedule.
     * 
     * @param scheduleStartDate
     */
    public void setScheduleStartDate(java.util.Calendar scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }


    /**
     * Gets the successNotifyRecipients value for this TransformationFlowSchedule.
     * 
     * @return successNotifyRecipients
     */
    public int[] getSuccessNotifyRecipients() {
        return successNotifyRecipients;
    }


    /**
     * Sets the successNotifyRecipients value for this TransformationFlowSchedule.
     * 
     * @param successNotifyRecipients
     */
    public void setSuccessNotifyRecipients(int[] successNotifyRecipients) {
        this.successNotifyRecipients = successNotifyRecipients;
    }


    /**
     * Gets the transformationId value for this TransformationFlowSchedule.
     * 
     * @return transformationId
     */
    public java.lang.Integer getTransformationId() {
        return transformationId;
    }


    /**
     * Sets the transformationId value for this TransformationFlowSchedule.
     * 
     * @param transformationId
     */
    public void setTransformationId(java.lang.Integer transformationId) {
        this.transformationId = transformationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransformationFlowSchedule)) return false;
        TransformationFlowSchedule other = (TransformationFlowSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.failureNotificationGroup==null && other.getFailureNotificationGroup()==null) || 
             (this.failureNotificationGroup!=null &&
              this.failureNotificationGroup.equals(other.getFailureNotificationGroup()))) &&
            ((this.scheduleEndDate==null && other.getScheduleEndDate()==null) || 
             (this.scheduleEndDate!=null &&
              this.scheduleEndDate.equals(other.getScheduleEndDate()))) &&
            ((this.scheduleStartDate==null && other.getScheduleStartDate()==null) || 
             (this.scheduleStartDate!=null &&
              this.scheduleStartDate.equals(other.getScheduleStartDate()))) &&
            ((this.successNotifyRecipients==null && other.getSuccessNotifyRecipients()==null) || 
             (this.successNotifyRecipients!=null &&
              java.util.Arrays.equals(this.successNotifyRecipients, other.getSuccessNotifyRecipients()))) &&
            ((this.transformationId==null && other.getTransformationId()==null) || 
             (this.transformationId!=null &&
              this.transformationId.equals(other.getTransformationId())));
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
        if (getFailureNotificationGroup() != null) {
            _hashCode += getFailureNotificationGroup().hashCode();
        }
        if (getScheduleEndDate() != null) {
            _hashCode += getScheduleEndDate().hashCode();
        }
        if (getScheduleStartDate() != null) {
            _hashCode += getScheduleStartDate().hashCode();
        }
        if (getSuccessNotifyRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessNotifyRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessNotifyRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformationId() != null) {
            _hashCode += getTransformationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransformationFlowSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "TransformationFlowSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureNotificationGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failureNotificationGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successNotifyRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "successNotifyRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
