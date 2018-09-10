/**
 * ParentDashboard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class ParentDashboard  implements java.io.Serializable {
    private java.lang.Integer dashboardGroupId;

    private java.lang.String dashboardName;

    private java.lang.String[] statusCodes;

    private java.lang.String[] tabIds;

    private java.lang.String[] tabNames;

    public ParentDashboard() {
    }

    public ParentDashboard(
           java.lang.Integer dashboardGroupId,
           java.lang.String dashboardName,
           java.lang.String[] statusCodes,
           java.lang.String[] tabIds,
           java.lang.String[] tabNames) {
           this.dashboardGroupId = dashboardGroupId;
           this.dashboardName = dashboardName;
           this.statusCodes = statusCodes;
           this.tabIds = tabIds;
           this.tabNames = tabNames;
    }


    /**
     * Gets the dashboardGroupId value for this ParentDashboard.
     * 
     * @return dashboardGroupId
     */
    public java.lang.Integer getDashboardGroupId() {
        return dashboardGroupId;
    }


    /**
     * Sets the dashboardGroupId value for this ParentDashboard.
     * 
     * @param dashboardGroupId
     */
    public void setDashboardGroupId(java.lang.Integer dashboardGroupId) {
        this.dashboardGroupId = dashboardGroupId;
    }


    /**
     * Gets the dashboardName value for this ParentDashboard.
     * 
     * @return dashboardName
     */
    public java.lang.String getDashboardName() {
        return dashboardName;
    }


    /**
     * Sets the dashboardName value for this ParentDashboard.
     * 
     * @param dashboardName
     */
    public void setDashboardName(java.lang.String dashboardName) {
        this.dashboardName = dashboardName;
    }


    /**
     * Gets the statusCodes value for this ParentDashboard.
     * 
     * @return statusCodes
     */
    public java.lang.String[] getStatusCodes() {
        return statusCodes;
    }


    /**
     * Sets the statusCodes value for this ParentDashboard.
     * 
     * @param statusCodes
     */
    public void setStatusCodes(java.lang.String[] statusCodes) {
        this.statusCodes = statusCodes;
    }


    /**
     * Gets the tabIds value for this ParentDashboard.
     * 
     * @return tabIds
     */
    public java.lang.String[] getTabIds() {
        return tabIds;
    }


    /**
     * Sets the tabIds value for this ParentDashboard.
     * 
     * @param tabIds
     */
    public void setTabIds(java.lang.String[] tabIds) {
        this.tabIds = tabIds;
    }


    /**
     * Gets the tabNames value for this ParentDashboard.
     * 
     * @return tabNames
     */
    public java.lang.String[] getTabNames() {
        return tabNames;
    }


    /**
     * Sets the tabNames value for this ParentDashboard.
     * 
     * @param tabNames
     */
    public void setTabNames(java.lang.String[] tabNames) {
        this.tabNames = tabNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParentDashboard)) return false;
        ParentDashboard other = (ParentDashboard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dashboardGroupId==null && other.getDashboardGroupId()==null) || 
             (this.dashboardGroupId!=null &&
              this.dashboardGroupId.equals(other.getDashboardGroupId()))) &&
            ((this.dashboardName==null && other.getDashboardName()==null) || 
             (this.dashboardName!=null &&
              this.dashboardName.equals(other.getDashboardName()))) &&
            ((this.statusCodes==null && other.getStatusCodes()==null) || 
             (this.statusCodes!=null &&
              java.util.Arrays.equals(this.statusCodes, other.getStatusCodes()))) &&
            ((this.tabIds==null && other.getTabIds()==null) || 
             (this.tabIds!=null &&
              java.util.Arrays.equals(this.tabIds, other.getTabIds()))) &&
            ((this.tabNames==null && other.getTabNames()==null) || 
             (this.tabNames!=null &&
              java.util.Arrays.equals(this.tabNames, other.getTabNames())));
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
        if (getDashboardGroupId() != null) {
            _hashCode += getDashboardGroupId().hashCode();
        }
        if (getDashboardName() != null) {
            _hashCode += getDashboardName().hashCode();
        }
        if (getStatusCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTabIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTabIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTabIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTabNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTabNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTabNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParentDashboard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentDashboard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dashboardGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dashboardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tabIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tabNames"));
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
