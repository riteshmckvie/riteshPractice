/**
 * ParentReportGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class ParentReportGroup  implements java.io.Serializable {
    private java.lang.Integer displayOrder;

    private com.hof.mi.web.service.AdministrationReportGroup reportGroup;

    private java.lang.Integer reportGroupId;

    private com.hof.mi.web.service.AdministrationReportGroup[] reportGroupSubTabs;

    private java.lang.String reportGroupUUID;

    public ParentReportGroup() {
    }

    public ParentReportGroup(
           java.lang.Integer displayOrder,
           com.hof.mi.web.service.AdministrationReportGroup reportGroup,
           java.lang.Integer reportGroupId,
           com.hof.mi.web.service.AdministrationReportGroup[] reportGroupSubTabs,
           java.lang.String reportGroupUUID) {
           this.displayOrder = displayOrder;
           this.reportGroup = reportGroup;
           this.reportGroupId = reportGroupId;
           this.reportGroupSubTabs = reportGroupSubTabs;
           this.reportGroupUUID = reportGroupUUID;
    }


    /**
     * Gets the displayOrder value for this ParentReportGroup.
     * 
     * @return displayOrder
     */
    public java.lang.Integer getDisplayOrder() {
        return displayOrder;
    }


    /**
     * Sets the displayOrder value for this ParentReportGroup.
     * 
     * @param displayOrder
     */
    public void setDisplayOrder(java.lang.Integer displayOrder) {
        this.displayOrder = displayOrder;
    }


    /**
     * Gets the reportGroup value for this ParentReportGroup.
     * 
     * @return reportGroup
     */
    public com.hof.mi.web.service.AdministrationReportGroup getReportGroup() {
        return reportGroup;
    }


    /**
     * Sets the reportGroup value for this ParentReportGroup.
     * 
     * @param reportGroup
     */
    public void setReportGroup(com.hof.mi.web.service.AdministrationReportGroup reportGroup) {
        this.reportGroup = reportGroup;
    }


    /**
     * Gets the reportGroupId value for this ParentReportGroup.
     * 
     * @return reportGroupId
     */
    public java.lang.Integer getReportGroupId() {
        return reportGroupId;
    }


    /**
     * Sets the reportGroupId value for this ParentReportGroup.
     * 
     * @param reportGroupId
     */
    public void setReportGroupId(java.lang.Integer reportGroupId) {
        this.reportGroupId = reportGroupId;
    }


    /**
     * Gets the reportGroupSubTabs value for this ParentReportGroup.
     * 
     * @return reportGroupSubTabs
     */
    public com.hof.mi.web.service.AdministrationReportGroup[] getReportGroupSubTabs() {
        return reportGroupSubTabs;
    }


    /**
     * Sets the reportGroupSubTabs value for this ParentReportGroup.
     * 
     * @param reportGroupSubTabs
     */
    public void setReportGroupSubTabs(com.hof.mi.web.service.AdministrationReportGroup[] reportGroupSubTabs) {
        this.reportGroupSubTabs = reportGroupSubTabs;
    }


    /**
     * Gets the reportGroupUUID value for this ParentReportGroup.
     * 
     * @return reportGroupUUID
     */
    public java.lang.String getReportGroupUUID() {
        return reportGroupUUID;
    }


    /**
     * Sets the reportGroupUUID value for this ParentReportGroup.
     * 
     * @param reportGroupUUID
     */
    public void setReportGroupUUID(java.lang.String reportGroupUUID) {
        this.reportGroupUUID = reportGroupUUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParentReportGroup)) return false;
        ParentReportGroup other = (ParentReportGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayOrder==null && other.getDisplayOrder()==null) || 
             (this.displayOrder!=null &&
              this.displayOrder.equals(other.getDisplayOrder()))) &&
            ((this.reportGroup==null && other.getReportGroup()==null) || 
             (this.reportGroup!=null &&
              this.reportGroup.equals(other.getReportGroup()))) &&
            ((this.reportGroupId==null && other.getReportGroupId()==null) || 
             (this.reportGroupId!=null &&
              this.reportGroupId.equals(other.getReportGroupId()))) &&
            ((this.reportGroupSubTabs==null && other.getReportGroupSubTabs()==null) || 
             (this.reportGroupSubTabs!=null &&
              java.util.Arrays.equals(this.reportGroupSubTabs, other.getReportGroupSubTabs()))) &&
            ((this.reportGroupUUID==null && other.getReportGroupUUID()==null) || 
             (this.reportGroupUUID!=null &&
              this.reportGroupUUID.equals(other.getReportGroupUUID())));
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
        if (getDisplayOrder() != null) {
            _hashCode += getDisplayOrder().hashCode();
        }
        if (getReportGroup() != null) {
            _hashCode += getReportGroup().hashCode();
        }
        if (getReportGroupId() != null) {
            _hashCode += getReportGroupId().hashCode();
        }
        if (getReportGroupSubTabs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportGroupSubTabs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportGroupSubTabs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReportGroupUUID() != null) {
            _hashCode += getReportGroupUUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParentReportGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentReportGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReportGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupSubTabs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupSubTabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReportGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupUUID"));
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
