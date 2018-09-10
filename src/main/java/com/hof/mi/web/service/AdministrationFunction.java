/**
 * AdministrationFunction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationFunction  implements java.io.Serializable {
    private java.lang.String accessLevelCode;

    private java.lang.String functionCode;

    private java.lang.String functionDescription;

    private java.lang.String functionName;

    private java.lang.String functionTypeCode;

    public AdministrationFunction() {
    }

    public AdministrationFunction(
           java.lang.String accessLevelCode,
           java.lang.String functionCode,
           java.lang.String functionDescription,
           java.lang.String functionName,
           java.lang.String functionTypeCode) {
           this.accessLevelCode = accessLevelCode;
           this.functionCode = functionCode;
           this.functionDescription = functionDescription;
           this.functionName = functionName;
           this.functionTypeCode = functionTypeCode;
    }


    /**
     * Gets the accessLevelCode value for this AdministrationFunction.
     * 
     * @return accessLevelCode
     */
    public java.lang.String getAccessLevelCode() {
        return accessLevelCode;
    }


    /**
     * Sets the accessLevelCode value for this AdministrationFunction.
     * 
     * @param accessLevelCode
     */
    public void setAccessLevelCode(java.lang.String accessLevelCode) {
        this.accessLevelCode = accessLevelCode;
    }


    /**
     * Gets the functionCode value for this AdministrationFunction.
     * 
     * @return functionCode
     */
    public java.lang.String getFunctionCode() {
        return functionCode;
    }


    /**
     * Sets the functionCode value for this AdministrationFunction.
     * 
     * @param functionCode
     */
    public void setFunctionCode(java.lang.String functionCode) {
        this.functionCode = functionCode;
    }


    /**
     * Gets the functionDescription value for this AdministrationFunction.
     * 
     * @return functionDescription
     */
    public java.lang.String getFunctionDescription() {
        return functionDescription;
    }


    /**
     * Sets the functionDescription value for this AdministrationFunction.
     * 
     * @param functionDescription
     */
    public void setFunctionDescription(java.lang.String functionDescription) {
        this.functionDescription = functionDescription;
    }


    /**
     * Gets the functionName value for this AdministrationFunction.
     * 
     * @return functionName
     */
    public java.lang.String getFunctionName() {
        return functionName;
    }


    /**
     * Sets the functionName value for this AdministrationFunction.
     * 
     * @param functionName
     */
    public void setFunctionName(java.lang.String functionName) {
        this.functionName = functionName;
    }


    /**
     * Gets the functionTypeCode value for this AdministrationFunction.
     * 
     * @return functionTypeCode
     */
    public java.lang.String getFunctionTypeCode() {
        return functionTypeCode;
    }


    /**
     * Sets the functionTypeCode value for this AdministrationFunction.
     * 
     * @param functionTypeCode
     */
    public void setFunctionTypeCode(java.lang.String functionTypeCode) {
        this.functionTypeCode = functionTypeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationFunction)) return false;
        AdministrationFunction other = (AdministrationFunction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessLevelCode==null && other.getAccessLevelCode()==null) || 
             (this.accessLevelCode!=null &&
              this.accessLevelCode.equals(other.getAccessLevelCode()))) &&
            ((this.functionCode==null && other.getFunctionCode()==null) || 
             (this.functionCode!=null &&
              this.functionCode.equals(other.getFunctionCode()))) &&
            ((this.functionDescription==null && other.getFunctionDescription()==null) || 
             (this.functionDescription!=null &&
              this.functionDescription.equals(other.getFunctionDescription()))) &&
            ((this.functionName==null && other.getFunctionName()==null) || 
             (this.functionName!=null &&
              this.functionName.equals(other.getFunctionName()))) &&
            ((this.functionTypeCode==null && other.getFunctionTypeCode()==null) || 
             (this.functionTypeCode!=null &&
              this.functionTypeCode.equals(other.getFunctionTypeCode())));
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
        if (getAccessLevelCode() != null) {
            _hashCode += getAccessLevelCode().hashCode();
        }
        if (getFunctionCode() != null) {
            _hashCode += getFunctionCode().hashCode();
        }
        if (getFunctionDescription() != null) {
            _hashCode += getFunctionDescription().hashCode();
        }
        if (getFunctionName() != null) {
            _hashCode += getFunctionName().hashCode();
        }
        if (getFunctionTypeCode() != null) {
            _hashCode += getFunctionTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationFunction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationFunction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessLevelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "functionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "functionDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "functionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "functionTypeCode"));
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
