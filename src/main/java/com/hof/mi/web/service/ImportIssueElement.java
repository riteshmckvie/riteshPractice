/**
 * ImportIssueElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class ImportIssueElement  implements java.io.Serializable {
    private java.lang.String[] messageComponents;

    private java.lang.String messageKey;

    private java.lang.String renderedMessage;

    public ImportIssueElement() {
    }

    public ImportIssueElement(
           java.lang.String[] messageComponents,
           java.lang.String messageKey,
           java.lang.String renderedMessage) {
           this.messageComponents = messageComponents;
           this.messageKey = messageKey;
           this.renderedMessage = renderedMessage;
    }


    /**
     * Gets the messageComponents value for this ImportIssueElement.
     * 
     * @return messageComponents
     */
    public java.lang.String[] getMessageComponents() {
        return messageComponents;
    }


    /**
     * Sets the messageComponents value for this ImportIssueElement.
     * 
     * @param messageComponents
     */
    public void setMessageComponents(java.lang.String[] messageComponents) {
        this.messageComponents = messageComponents;
    }


    /**
     * Gets the messageKey value for this ImportIssueElement.
     * 
     * @return messageKey
     */
    public java.lang.String getMessageKey() {
        return messageKey;
    }


    /**
     * Sets the messageKey value for this ImportIssueElement.
     * 
     * @param messageKey
     */
    public void setMessageKey(java.lang.String messageKey) {
        this.messageKey = messageKey;
    }


    /**
     * Gets the renderedMessage value for this ImportIssueElement.
     * 
     * @return renderedMessage
     */
    public java.lang.String getRenderedMessage() {
        return renderedMessage;
    }


    /**
     * Sets the renderedMessage value for this ImportIssueElement.
     * 
     * @param renderedMessage
     */
    public void setRenderedMessage(java.lang.String renderedMessage) {
        this.renderedMessage = renderedMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportIssueElement)) return false;
        ImportIssueElement other = (ImportIssueElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageComponents==null && other.getMessageComponents()==null) || 
             (this.messageComponents!=null &&
              java.util.Arrays.equals(this.messageComponents, other.getMessageComponents()))) &&
            ((this.messageKey==null && other.getMessageKey()==null) || 
             (this.messageKey!=null &&
              this.messageKey.equals(other.getMessageKey()))) &&
            ((this.renderedMessage==null && other.getRenderedMessage()==null) || 
             (this.renderedMessage!=null &&
              this.renderedMessage.equals(other.getRenderedMessage())));
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
        if (getMessageComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessageComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessageComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessageKey() != null) {
            _hashCode += getMessageKey().hashCode();
        }
        if (getRenderedMessage() != null) {
            _hashCode += getRenderedMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportIssueElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportIssueElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderedMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "renderedMessage"));
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
