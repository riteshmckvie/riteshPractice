/**
 * QuarterlyFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public class QuarterlyFrequency  extends com.hof.mi.web.service.schedule.ScheduleFrequency  implements java.io.Serializable {
    private java.lang.Integer dayOfMonth;

    private java.lang.Integer monthOfQuarter;

    public QuarterlyFrequency() {
    }

    public QuarterlyFrequency(
           java.lang.String frequencyCode,
           java.lang.String frequencyTypeCode,
           java.lang.Integer frequencyUnit,
           java.lang.Integer localRunTime,
           java.lang.String localTimezoneCode,
           java.lang.Integer dayOfMonth,
           java.lang.Integer monthOfQuarter) {
        super(
            frequencyCode,
            frequencyTypeCode,
            frequencyUnit,
            localRunTime,
            localTimezoneCode);
        this.dayOfMonth = dayOfMonth;
        this.monthOfQuarter = monthOfQuarter;
    }


    /**
     * Gets the dayOfMonth value for this QuarterlyFrequency.
     * 
     * @return dayOfMonth
     */
    public java.lang.Integer getDayOfMonth() {
        return dayOfMonth;
    }


    /**
     * Sets the dayOfMonth value for this QuarterlyFrequency.
     * 
     * @param dayOfMonth
     */
    public void setDayOfMonth(java.lang.Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }


    /**
     * Gets the monthOfQuarter value for this QuarterlyFrequency.
     * 
     * @return monthOfQuarter
     */
    public java.lang.Integer getMonthOfQuarter() {
        return monthOfQuarter;
    }


    /**
     * Sets the monthOfQuarter value for this QuarterlyFrequency.
     * 
     * @param monthOfQuarter
     */
    public void setMonthOfQuarter(java.lang.Integer monthOfQuarter) {
        this.monthOfQuarter = monthOfQuarter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuarterlyFrequency)) return false;
        QuarterlyFrequency other = (QuarterlyFrequency) obj;
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
            ((this.monthOfQuarter==null && other.getMonthOfQuarter()==null) || 
             (this.monthOfQuarter!=null &&
              this.monthOfQuarter.equals(other.getMonthOfQuarter())));
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
        if (getMonthOfQuarter() != null) {
            _hashCode += getMonthOfQuarter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuarterlyFrequency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "QuarterlyFrequency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthOfQuarter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthOfQuarter"));
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
