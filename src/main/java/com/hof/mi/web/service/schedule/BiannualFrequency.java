/**
 * BiannualFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public class BiannualFrequency  extends com.hof.mi.web.service.schedule.ScheduleFrequency  implements java.io.Serializable {
    private java.lang.Integer dayOfMonth;

    private java.lang.Integer monthOfYear;

    public BiannualFrequency() {
    }

    public BiannualFrequency(
           java.lang.String frequencyCode,
           java.lang.String frequencyTypeCode,
           java.lang.Integer frequencyUnit,
           java.lang.Integer localRunTime,
           java.lang.String localTimezoneCode,
           java.lang.Integer dayOfMonth,
           java.lang.Integer monthOfYear) {
        super(
            frequencyCode,
            frequencyTypeCode,
            frequencyUnit,
            localRunTime,
            localTimezoneCode);
        this.dayOfMonth = dayOfMonth;
        this.monthOfYear = monthOfYear;
    }


    /**
     * Gets the dayOfMonth value for this BiannualFrequency.
     * 
     * @return dayOfMonth
     */
    public java.lang.Integer getDayOfMonth() {
        return dayOfMonth;
    }


    /**
     * Sets the dayOfMonth value for this BiannualFrequency.
     * 
     * @param dayOfMonth
     */
    public void setDayOfMonth(java.lang.Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }


    /**
     * Gets the monthOfYear value for this BiannualFrequency.
     * 
     * @return monthOfYear
     */
    public java.lang.Integer getMonthOfYear() {
        return monthOfYear;
    }


    /**
     * Sets the monthOfYear value for this BiannualFrequency.
     * 
     * @param monthOfYear
     */
    public void setMonthOfYear(java.lang.Integer monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiannualFrequency)) return false;
        BiannualFrequency other = (BiannualFrequency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dayOfMonth==null && other.getDayOfMonth()==null) || 
             (this.dayOfMonth!=null &&
              this.dayOfMonth.equals(other.getDayOfMonth()))) &&
            ((this.monthOfYear==null && other.getMonthOfYear()==null) || 
             (this.monthOfYear!=null &&
              this.monthOfYear.equals(other.getMonthOfYear())));
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
        if (getDayOfMonth() != null) {
            _hashCode += getDayOfMonth().hashCode();
        }
        if (getMonthOfYear() != null) {
            _hashCode += getMonthOfYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiannualFrequency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "BiannualFrequency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthOfYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthOfYear"));
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
