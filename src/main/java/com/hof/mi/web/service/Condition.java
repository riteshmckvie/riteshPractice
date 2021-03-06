/**
 * Condition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class Condition  implements java.io.Serializable {
    private java.lang.Integer fieldId;

    private java.lang.String operator;

    private java.lang.String value1;

    private java.lang.String value2;

    public Condition() {
    }

    public Condition(
           java.lang.Integer fieldId,
           java.lang.String operator,
           java.lang.String value1,
           java.lang.String value2) {
           this.fieldId = fieldId;
           this.operator = operator;
           this.value1 = value1;
           this.value2 = value2;
    }


    /**
     * Gets the fieldId value for this Condition.
     * 
     * @return fieldId
     */
    public java.lang.Integer getFieldId() {
        return fieldId;
    }


    /**
     * Sets the fieldId value for this Condition.
     * 
     * @param fieldId
     */
    public void setFieldId(java.lang.Integer fieldId) {
        this.fieldId = fieldId;
    }


    /**
     * Gets the operator value for this Condition.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this Condition.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the value1 value for this Condition.
     * 
     * @return value1
     */
    public java.lang.String getValue1() {
        return value1;
    }


    /**
     * Sets the value1 value for this Condition.
     * 
     * @param value1
     */
    public void setValue1(java.lang.String value1) {
        this.value1 = value1;
    }


    /**
     * Gets the value2 value for this Condition.
     * 
     * @return value2
     */
    public java.lang.String getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this Condition.
     * 
     * @param value2
     */
    public void setValue2(java.lang.String value2) {
        this.value2 = value2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Condition)) return false;
        Condition other = (Condition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldId==null && other.getFieldId()==null) || 
             (this.fieldId!=null &&
              this.fieldId.equals(other.getFieldId()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.value1==null && other.getValue1()==null) || 
             (this.value1!=null &&
              this.value1.equals(other.getValue1()))) &&
            ((this.value2==null && other.getValue2()==null) || 
             (this.value2!=null &&
              this.value2.equals(other.getValue2())));
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
        if (getFieldId() != null) {
            _hashCode += getFieldId().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getValue1() != null) {
            _hashCode += getValue1().hashCode();
        }
        if (getValue2() != null) {
            _hashCode += getValue2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Condition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "Condition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value2"));
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
