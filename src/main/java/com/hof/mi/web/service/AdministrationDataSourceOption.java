/**
 * AdministrationDataSourceOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationDataSourceOption  implements java.io.Serializable {
    private java.lang.String optionKey;

    private java.lang.String optionValue;

    private java.lang.String valueDataType;

    public AdministrationDataSourceOption() {
    }

    public AdministrationDataSourceOption(
           java.lang.String optionKey,
           java.lang.String optionValue,
           java.lang.String valueDataType) {
           this.optionKey = optionKey;
           this.optionValue = optionValue;
           this.valueDataType = valueDataType;
    }


    /**
     * Gets the optionKey value for this AdministrationDataSourceOption.
     * 
     * @return optionKey
     */
    public java.lang.String getOptionKey() {
        return optionKey;
    }


    /**
     * Sets the optionKey value for this AdministrationDataSourceOption.
     * 
     * @param optionKey
     */
    public void setOptionKey(java.lang.String optionKey) {
        this.optionKey = optionKey;
    }


    /**
     * Gets the optionValue value for this AdministrationDataSourceOption.
     * 
     * @return optionValue
     */
    public java.lang.String getOptionValue() {
        return optionValue;
    }


    /**
     * Sets the optionValue value for this AdministrationDataSourceOption.
     * 
     * @param optionValue
     */
    public void setOptionValue(java.lang.String optionValue) {
        this.optionValue = optionValue;
    }


    /**
     * Gets the valueDataType value for this AdministrationDataSourceOption.
     * 
     * @return valueDataType
     */
    public java.lang.String getValueDataType() {
        return valueDataType;
    }


    /**
     * Sets the valueDataType value for this AdministrationDataSourceOption.
     * 
     * @param valueDataType
     */
    public void setValueDataType(java.lang.String valueDataType) {
        this.valueDataType = valueDataType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationDataSourceOption)) return false;
        AdministrationDataSourceOption other = (AdministrationDataSourceOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.optionKey==null && other.getOptionKey()==null) || 
             (this.optionKey!=null &&
              this.optionKey.equals(other.getOptionKey()))) &&
            ((this.optionValue==null && other.getOptionValue()==null) || 
             (this.optionValue!=null &&
              this.optionValue.equals(other.getOptionValue()))) &&
            ((this.valueDataType==null && other.getValueDataType()==null) || 
             (this.valueDataType!=null &&
              this.valueDataType.equals(other.getValueDataType())));
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
        if (getOptionKey() != null) {
            _hashCode += getOptionKey().hashCode();
        }
        if (getOptionValue() != null) {
            _hashCode += getOptionValue().hashCode();
        }
        if (getValueDataType() != null) {
            _hashCode += getValueDataType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationDataSourceOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueDataType"));
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
