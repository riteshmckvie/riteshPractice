/**
 * ScheduleFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public abstract class ScheduleFrequency  implements java.io.Serializable {
    private java.lang.String frequencyCode;

    private java.lang.String frequencyTypeCode;

    private java.lang.Integer frequencyUnit;

    private java.lang.Integer localRunTime;

    private java.lang.String localTimezoneCode;

    public ScheduleFrequency() {
    }

    public ScheduleFrequency(
           java.lang.String frequencyCode,
           java.lang.String frequencyTypeCode,
           java.lang.Integer frequencyUnit,
           java.lang.Integer localRunTime,
           java.lang.String localTimezoneCode) {
           this.frequencyCode = frequencyCode;
           this.frequencyTypeCode = frequencyTypeCode;
           this.frequencyUnit = frequencyUnit;
           this.localRunTime = localRunTime;
           this.localTimezoneCode = localTimezoneCode;
    }


    /**
     * Gets the frequencyCode value for this ScheduleFrequency.
     * 
     * @return frequencyCode
     */
    public java.lang.String getFrequencyCode() {
        return frequencyCode;
    }


    /**
     * Sets the frequencyCode value for this ScheduleFrequency.
     * 
     * @param frequencyCode
     */
    public void setFrequencyCode(java.lang.String frequencyCode) {
        this.frequencyCode = frequencyCode;
    }


    /**
     * Gets the frequencyTypeCode value for this ScheduleFrequency.
     * 
     * @return frequencyTypeCode
     */
    public java.lang.String getFrequencyTypeCode() {
        return frequencyTypeCode;
    }


    /**
     * Sets the frequencyTypeCode value for this ScheduleFrequency.
     * 
     * @param frequencyTypeCode
     */
    public void setFrequencyTypeCode(java.lang.String frequencyTypeCode) {
        this.frequencyTypeCode = frequencyTypeCode;
    }


    /**
     * Gets the frequencyUnit value for this ScheduleFrequency.
     * 
     * @return frequencyUnit
     */
    public java.lang.Integer getFrequencyUnit() {
        return frequencyUnit;
    }


    /**
     * Sets the frequencyUnit value for this ScheduleFrequency.
     * 
     * @param frequencyUnit
     */
    public void setFrequencyUnit(java.lang.Integer frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
    }


    /**
     * Gets the localRunTime value for this ScheduleFrequency.
     * 
     * @return localRunTime
     */
    public java.lang.Integer getLocalRunTime() {
        return localRunTime;
    }


    /**
     * Sets the localRunTime value for this ScheduleFrequency.
     * 
     * @param localRunTime
     */
    public void setLocalRunTime(java.lang.Integer localRunTime) {
        this.localRunTime = localRunTime;
    }


    /**
     * Gets the localTimezoneCode value for this ScheduleFrequency.
     * 
     * @return localTimezoneCode
     */
    public java.lang.String getLocalTimezoneCode() {
        return localTimezoneCode;
    }


    /**
     * Sets the localTimezoneCode value for this ScheduleFrequency.
     * 
     * @param localTimezoneCode
     */
    public void setLocalTimezoneCode(java.lang.String localTimezoneCode) {
        this.localTimezoneCode = localTimezoneCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleFrequency)) return false;
        ScheduleFrequency other = (ScheduleFrequency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.frequencyCode==null && other.getFrequencyCode()==null) || 
             (this.frequencyCode!=null &&
              this.frequencyCode.equals(other.getFrequencyCode()))) &&
            ((this.frequencyTypeCode==null && other.getFrequencyTypeCode()==null) || 
             (this.frequencyTypeCode!=null &&
              this.frequencyTypeCode.equals(other.getFrequencyTypeCode()))) &&
            ((this.frequencyUnit==null && other.getFrequencyUnit()==null) || 
             (this.frequencyUnit!=null &&
              this.frequencyUnit.equals(other.getFrequencyUnit()))) &&
            ((this.localRunTime==null && other.getLocalRunTime()==null) || 
             (this.localRunTime!=null &&
              this.localRunTime.equals(other.getLocalRunTime()))) &&
            ((this.localTimezoneCode==null && other.getLocalTimezoneCode()==null) || 
             (this.localTimezoneCode!=null &&
              this.localTimezoneCode.equals(other.getLocalTimezoneCode())));
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
        if (getFrequencyCode() != null) {
            _hashCode += getFrequencyCode().hashCode();
        }
        if (getFrequencyTypeCode() != null) {
            _hashCode += getFrequencyTypeCode().hashCode();
        }
        if (getFrequencyUnit() != null) {
            _hashCode += getFrequencyUnit().hashCode();
        }
        if (getLocalRunTime() != null) {
            _hashCode += getLocalRunTime().hashCode();
        }
        if (getLocalTimezoneCode() != null) {
            _hashCode += getLocalTimezoneCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleFrequency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ScheduleFrequency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequencyTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequencyUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localTimezoneCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localTimezoneCode"));
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
