/**
 * AdministrationSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public abstract class AdministrationSchedule  implements java.io.Serializable {
    private com.hof.mi.web.service.schedule.ScheduleFrequency frequency;

    private java.util.Calendar lastRunDateTimeGMT;

    private java.lang.String lastRunError;

    private java.lang.String lastRunStatus;

    private java.util.Calendar nextRunDateTimeGMT;

    private boolean scheduleActive;

    private java.lang.String scheduleDescription;

    private java.lang.String scheduleTypeCode;

    private java.lang.String scheduleUUID;

    public AdministrationSchedule() {
    }

    public AdministrationSchedule(
           com.hof.mi.web.service.schedule.ScheduleFrequency frequency,
           java.util.Calendar lastRunDateTimeGMT,
           java.lang.String lastRunError,
           java.lang.String lastRunStatus,
           java.util.Calendar nextRunDateTimeGMT,
           boolean scheduleActive,
           java.lang.String scheduleDescription,
           java.lang.String scheduleTypeCode,
           java.lang.String scheduleUUID) {
           this.frequency = frequency;
           this.lastRunDateTimeGMT = lastRunDateTimeGMT;
           this.lastRunError = lastRunError;
           this.lastRunStatus = lastRunStatus;
           this.nextRunDateTimeGMT = nextRunDateTimeGMT;
           this.scheduleActive = scheduleActive;
           this.scheduleDescription = scheduleDescription;
           this.scheduleTypeCode = scheduleTypeCode;
           this.scheduleUUID = scheduleUUID;
    }


    /**
     * Gets the frequency value for this AdministrationSchedule.
     * 
     * @return frequency
     */
    public com.hof.mi.web.service.schedule.ScheduleFrequency getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this AdministrationSchedule.
     * 
     * @param frequency
     */
    public void setFrequency(com.hof.mi.web.service.schedule.ScheduleFrequency frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the lastRunDateTimeGMT value for this AdministrationSchedule.
     * 
     * @return lastRunDateTimeGMT
     */
    public java.util.Calendar getLastRunDateTimeGMT() {
        return lastRunDateTimeGMT;
    }


    /**
     * Sets the lastRunDateTimeGMT value for this AdministrationSchedule.
     * 
     * @param lastRunDateTimeGMT
     */
    public void setLastRunDateTimeGMT(java.util.Calendar lastRunDateTimeGMT) {
        this.lastRunDateTimeGMT = lastRunDateTimeGMT;
    }


    /**
     * Gets the lastRunError value for this AdministrationSchedule.
     * 
     * @return lastRunError
     */
    public java.lang.String getLastRunError() {
        return lastRunError;
    }


    /**
     * Sets the lastRunError value for this AdministrationSchedule.
     * 
     * @param lastRunError
     */
    public void setLastRunError(java.lang.String lastRunError) {
        this.lastRunError = lastRunError;
    }


    /**
     * Gets the lastRunStatus value for this AdministrationSchedule.
     * 
     * @return lastRunStatus
     */
    public java.lang.String getLastRunStatus() {
        return lastRunStatus;
    }


    /**
     * Sets the lastRunStatus value for this AdministrationSchedule.
     * 
     * @param lastRunStatus
     */
    public void setLastRunStatus(java.lang.String lastRunStatus) {
        this.lastRunStatus = lastRunStatus;
    }


    /**
     * Gets the nextRunDateTimeGMT value for this AdministrationSchedule.
     * 
     * @return nextRunDateTimeGMT
     */
    public java.util.Calendar getNextRunDateTimeGMT() {
        return nextRunDateTimeGMT;
    }


    /**
     * Sets the nextRunDateTimeGMT value for this AdministrationSchedule.
     * 
     * @param nextRunDateTimeGMT
     */
    public void setNextRunDateTimeGMT(java.util.Calendar nextRunDateTimeGMT) {
        this.nextRunDateTimeGMT = nextRunDateTimeGMT;
    }


    /**
     * Gets the scheduleActive value for this AdministrationSchedule.
     * 
     * @return scheduleActive
     */
    public boolean isScheduleActive() {
        return scheduleActive;
    }


    /**
     * Sets the scheduleActive value for this AdministrationSchedule.
     * 
     * @param scheduleActive
     */
    public void setScheduleActive(boolean scheduleActive) {
        this.scheduleActive = scheduleActive;
    }


    /**
     * Gets the scheduleDescription value for this AdministrationSchedule.
     * 
     * @return scheduleDescription
     */
    public java.lang.String getScheduleDescription() {
        return scheduleDescription;
    }


    /**
     * Sets the scheduleDescription value for this AdministrationSchedule.
     * 
     * @param scheduleDescription
     */
    public void setScheduleDescription(java.lang.String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }


    /**
     * Gets the scheduleTypeCode value for this AdministrationSchedule.
     * 
     * @return scheduleTypeCode
     */
    public java.lang.String getScheduleTypeCode() {
        return scheduleTypeCode;
    }


    /**
     * Sets the scheduleTypeCode value for this AdministrationSchedule.
     * 
     * @param scheduleTypeCode
     */
    public void setScheduleTypeCode(java.lang.String scheduleTypeCode) {
        this.scheduleTypeCode = scheduleTypeCode;
    }


    /**
     * Gets the scheduleUUID value for this AdministrationSchedule.
     * 
     * @return scheduleUUID
     */
    public java.lang.String getScheduleUUID() {
        return scheduleUUID;
    }


    /**
     * Sets the scheduleUUID value for this AdministrationSchedule.
     * 
     * @param scheduleUUID
     */
    public void setScheduleUUID(java.lang.String scheduleUUID) {
        this.scheduleUUID = scheduleUUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationSchedule)) return false;
        AdministrationSchedule other = (AdministrationSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.lastRunDateTimeGMT==null && other.getLastRunDateTimeGMT()==null) || 
             (this.lastRunDateTimeGMT!=null &&
              this.lastRunDateTimeGMT.equals(other.getLastRunDateTimeGMT()))) &&
            ((this.lastRunError==null && other.getLastRunError()==null) || 
             (this.lastRunError!=null &&
              this.lastRunError.equals(other.getLastRunError()))) &&
            ((this.lastRunStatus==null && other.getLastRunStatus()==null) || 
             (this.lastRunStatus!=null &&
              this.lastRunStatus.equals(other.getLastRunStatus()))) &&
            ((this.nextRunDateTimeGMT==null && other.getNextRunDateTimeGMT()==null) || 
             (this.nextRunDateTimeGMT!=null &&
              this.nextRunDateTimeGMT.equals(other.getNextRunDateTimeGMT()))) &&
            this.scheduleActive == other.isScheduleActive() &&
            ((this.scheduleDescription==null && other.getScheduleDescription()==null) || 
             (this.scheduleDescription!=null &&
              this.scheduleDescription.equals(other.getScheduleDescription()))) &&
            ((this.scheduleTypeCode==null && other.getScheduleTypeCode()==null) || 
             (this.scheduleTypeCode!=null &&
              this.scheduleTypeCode.equals(other.getScheduleTypeCode()))) &&
            ((this.scheduleUUID==null && other.getScheduleUUID()==null) || 
             (this.scheduleUUID!=null &&
              this.scheduleUUID.equals(other.getScheduleUUID())));
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
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getLastRunDateTimeGMT() != null) {
            _hashCode += getLastRunDateTimeGMT().hashCode();
        }
        if (getLastRunError() != null) {
            _hashCode += getLastRunError().hashCode();
        }
        if (getLastRunStatus() != null) {
            _hashCode += getLastRunStatus().hashCode();
        }
        if (getNextRunDateTimeGMT() != null) {
            _hashCode += getNextRunDateTimeGMT().hashCode();
        }
        _hashCode += (isScheduleActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getScheduleDescription() != null) {
            _hashCode += getScheduleDescription().hashCode();
        }
        if (getScheduleTypeCode() != null) {
            _hashCode += getScheduleTypeCode().hashCode();
        }
        if (getScheduleUUID() != null) {
            _hashCode += getScheduleUUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "AdministrationSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ScheduleFrequency"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunDateTimeGMT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastRunDateTimeGMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastRunError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastRunStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextRunDateTimeGMT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextRunDateTimeGMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleUUID"));
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
