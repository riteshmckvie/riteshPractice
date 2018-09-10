/**
 * AdministrationClientOrg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationClientOrg  implements java.io.Serializable {
    private java.lang.Integer clientId;

    private java.lang.String clientName;

    private java.lang.String clientReferenceId;

    private boolean defaultOrg;

    private java.lang.String timeZoneCode;

    public AdministrationClientOrg() {
    }

    public AdministrationClientOrg(
           java.lang.Integer clientId,
           java.lang.String clientName,
           java.lang.String clientReferenceId,
           boolean defaultOrg,
           java.lang.String timeZoneCode) {
           this.clientId = clientId;
           this.clientName = clientName;
           this.clientReferenceId = clientReferenceId;
           this.defaultOrg = defaultOrg;
           this.timeZoneCode = timeZoneCode;
    }


    /**
     * Gets the clientId value for this AdministrationClientOrg.
     * 
     * @return clientId
     */
    public java.lang.Integer getClientId() {
        return clientId;
    }


    /**
     * Sets the clientId value for this AdministrationClientOrg.
     * 
     * @param clientId
     */
    public void setClientId(java.lang.Integer clientId) {
        this.clientId = clientId;
    }


    /**
     * Gets the clientName value for this AdministrationClientOrg.
     * 
     * @return clientName
     */
    public java.lang.String getClientName() {
        return clientName;
    }


    /**
     * Sets the clientName value for this AdministrationClientOrg.
     * 
     * @param clientName
     */
    public void setClientName(java.lang.String clientName) {
        this.clientName = clientName;
    }


    /**
     * Gets the clientReferenceId value for this AdministrationClientOrg.
     * 
     * @return clientReferenceId
     */
    public java.lang.String getClientReferenceId() {
        return clientReferenceId;
    }


    /**
     * Sets the clientReferenceId value for this AdministrationClientOrg.
     * 
     * @param clientReferenceId
     */
    public void setClientReferenceId(java.lang.String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
    }


    /**
     * Gets the defaultOrg value for this AdministrationClientOrg.
     * 
     * @return defaultOrg
     */
    public boolean isDefaultOrg() {
        return defaultOrg;
    }


    /**
     * Sets the defaultOrg value for this AdministrationClientOrg.
     * 
     * @param defaultOrg
     */
    public void setDefaultOrg(boolean defaultOrg) {
        this.defaultOrg = defaultOrg;
    }


    /**
     * Gets the timeZoneCode value for this AdministrationClientOrg.
     * 
     * @return timeZoneCode
     */
    public java.lang.String getTimeZoneCode() {
        return timeZoneCode;
    }


    /**
     * Sets the timeZoneCode value for this AdministrationClientOrg.
     * 
     * @param timeZoneCode
     */
    public void setTimeZoneCode(java.lang.String timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationClientOrg)) return false;
        AdministrationClientOrg other = (AdministrationClientOrg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientId==null && other.getClientId()==null) || 
             (this.clientId!=null &&
              this.clientId.equals(other.getClientId()))) &&
            ((this.clientName==null && other.getClientName()==null) || 
             (this.clientName!=null &&
              this.clientName.equals(other.getClientName()))) &&
            ((this.clientReferenceId==null && other.getClientReferenceId()==null) || 
             (this.clientReferenceId!=null &&
              this.clientReferenceId.equals(other.getClientReferenceId()))) &&
            this.defaultOrg == other.isDefaultOrg() &&
            ((this.timeZoneCode==null && other.getTimeZoneCode()==null) || 
             (this.timeZoneCode!=null &&
              this.timeZoneCode.equals(other.getTimeZoneCode())));
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
        if (getClientId() != null) {
            _hashCode += getClientId().hashCode();
        }
        if (getClientName() != null) {
            _hashCode += getClientName().hashCode();
        }
        if (getClientReferenceId() != null) {
            _hashCode += getClientReferenceId().hashCode();
        }
        _hashCode += (isDefaultOrg() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimeZoneCode() != null) {
            _hashCode += getTimeZoneCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationClientOrg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationClientOrg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZoneCode"));
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
