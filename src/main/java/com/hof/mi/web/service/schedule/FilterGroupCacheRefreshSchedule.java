/**
 * FilterGroupCacheRefreshSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public class FilterGroupCacheRefreshSchedule  extends com.hof.mi.web.service.schedule.AdministrationSchedule  implements java.io.Serializable {
    private java.lang.Integer filterGroupId;

    private java.lang.Integer viewId;

    public FilterGroupCacheRefreshSchedule() {
    }

    public FilterGroupCacheRefreshSchedule(
           com.hof.mi.web.service.schedule.ScheduleFrequency frequency,
           java.util.Calendar lastRunDateTimeGMT,
           java.lang.String lastRunError,
           java.lang.String lastRunStatus,
           java.util.Calendar nextRunDateTimeGMT,
           boolean scheduleActive,
           java.lang.String scheduleDescription,
           java.lang.String scheduleTypeCode,
           java.lang.String scheduleUUID,
           java.lang.Integer filterGroupId,
           java.lang.Integer viewId) {
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
        this.filterGroupId = filterGroupId;
        this.viewId = viewId;
    }


    /**
     * Gets the filterGroupId value for this FilterGroupCacheRefreshSchedule.
     * 
     * @return filterGroupId
     */
    public java.lang.Integer getFilterGroupId() {
        return filterGroupId;
    }


    /**
     * Sets the filterGroupId value for this FilterGroupCacheRefreshSchedule.
     * 
     * @param filterGroupId
     */
    public void setFilterGroupId(java.lang.Integer filterGroupId) {
        this.filterGroupId = filterGroupId;
    }


    /**
     * Gets the viewId value for this FilterGroupCacheRefreshSchedule.
     * 
     * @return viewId
     */
    public java.lang.Integer getViewId() {
        return viewId;
    }


    /**
     * Sets the viewId value for this FilterGroupCacheRefreshSchedule.
     * 
     * @param viewId
     */
    public void setViewId(java.lang.Integer viewId) {
        this.viewId = viewId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterGroupCacheRefreshSchedule)) return false;
        FilterGroupCacheRefreshSchedule other = (FilterGroupCacheRefreshSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.filterGroupId==null && other.getFilterGroupId()==null) || 
             (this.filterGroupId!=null &&
              this.filterGroupId.equals(other.getFilterGroupId()))) &&
            ((this.viewId==null && other.getViewId()==null) || 
             (this.viewId!=null &&
              this.viewId.equals(other.getViewId())));
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
        if (getFilterGroupId() != null) {
            _hashCode += getFilterGroupId().hashCode();
        }
        if (getViewId() != null) {
            _hashCode += getViewId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterGroupCacheRefreshSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "FilterGroupCacheRefreshSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewId"));
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
