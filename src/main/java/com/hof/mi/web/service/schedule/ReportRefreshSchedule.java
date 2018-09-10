/**
 * ReportRefreshSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public class ReportRefreshSchedule  extends com.hof.mi.web.service.schedule.AdministrationSchedule  implements java.io.Serializable {
    private java.lang.Integer reportId;

    public ReportRefreshSchedule() {
    }

    public ReportRefreshSchedule(
           com.hof.mi.web.service.schedule.ScheduleFrequency frequency,
           java.util.Calendar lastRunDateTimeGMT,
           java.lang.String lastRunError,
           java.lang.String lastRunStatus,
           java.util.Calendar nextRunDateTimeGMT,
           boolean scheduleActive,
           java.lang.String scheduleDescription,
           java.lang.String scheduleTypeCode,
           java.lang.String scheduleUUID,
           java.lang.Integer reportId) {
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
        this.reportId = reportId;
    }


    /**
     * Gets the reportId value for this ReportRefreshSchedule.
     * 
     * @return reportId
     */
    public java.lang.Integer getReportId() {
        return reportId;
    }


    /**
     * Sets the reportId value for this ReportRefreshSchedule.
     * 
     * @param reportId
     */
    public void setReportId(java.lang.Integer reportId) {
        this.reportId = reportId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportRefreshSchedule)) return false;
        ReportRefreshSchedule other = (ReportRefreshSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reportId==null && other.getReportId()==null) || 
             (this.reportId!=null &&
              this.reportId.equals(other.getReportId())));
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
        if (getReportId() != null) {
            _hashCode += getReportId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportRefreshSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ReportRefreshSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportId"));
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
