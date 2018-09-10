/**
 * AdministrationDataSourceClientLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationDataSourceClientLink  implements java.io.Serializable {
    private java.lang.Integer clientOrgId;

    private java.lang.String clientOrgRef;

    private java.lang.Integer sourceId;

    public AdministrationDataSourceClientLink() {
    }

    public AdministrationDataSourceClientLink(
           java.lang.Integer clientOrgId,
           java.lang.String clientOrgRef,
           java.lang.Integer sourceId) {
           this.clientOrgId = clientOrgId;
           this.clientOrgRef = clientOrgRef;
           this.sourceId = sourceId;
    }


    /**
     * Gets the clientOrgId value for this AdministrationDataSourceClientLink.
     * 
     * @return clientOrgId
     */
    public java.lang.Integer getClientOrgId() {
        return clientOrgId;
    }


    /**
     * Sets the clientOrgId value for this AdministrationDataSourceClientLink.
     * 
     * @param clientOrgId
     */
    public void setClientOrgId(java.lang.Integer clientOrgId) {
        this.clientOrgId = clientOrgId;
    }


    /**
     * Gets the clientOrgRef value for this AdministrationDataSourceClientLink.
     * 
     * @return clientOrgRef
     */
    public java.lang.String getClientOrgRef() {
        return clientOrgRef;
    }


    /**
     * Sets the clientOrgRef value for this AdministrationDataSourceClientLink.
     * 
     * @param clientOrgRef
     */
    public void setClientOrgRef(java.lang.String clientOrgRef) {
        this.clientOrgRef = clientOrgRef;
    }


    /**
     * Gets the sourceId value for this AdministrationDataSourceClientLink.
     * 
     * @return sourceId
     */
    public java.lang.Integer getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this AdministrationDataSourceClientLink.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.Integer sourceId) {
        this.sourceId = sourceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationDataSourceClientLink)) return false;
        AdministrationDataSourceClientLink other = (AdministrationDataSourceClientLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientOrgId==null && other.getClientOrgId()==null) || 
             (this.clientOrgId!=null &&
              this.clientOrgId.equals(other.getClientOrgId()))) &&
            ((this.clientOrgRef==null && other.getClientOrgRef()==null) || 
             (this.clientOrgRef!=null &&
              this.clientOrgRef.equals(other.getClientOrgRef()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId())));
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
        if (getClientOrgId() != null) {
            _hashCode += getClientOrgId().hashCode();
        }
        if (getClientOrgRef() != null) {
            _hashCode += getClientOrgRef().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationDataSourceClientLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceClientLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientOrgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientOrgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientOrgRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientOrgRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceId"));
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
