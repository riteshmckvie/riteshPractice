/**
 * ImportIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class ImportIssue  implements java.io.Serializable {
    private com.hof.mi.web.service.ImportIssueElement[] issueElements;

    private java.lang.String itemKey;

    private com.hof.mi.web.service.ContentResource resource;

    public ImportIssue() {
    }

    public ImportIssue(
           com.hof.mi.web.service.ImportIssueElement[] issueElements,
           java.lang.String itemKey,
           com.hof.mi.web.service.ContentResource resource) {
           this.issueElements = issueElements;
           this.itemKey = itemKey;
           this.resource = resource;
    }


    /**
     * Gets the issueElements value for this ImportIssue.
     * 
     * @return issueElements
     */
    public com.hof.mi.web.service.ImportIssueElement[] getIssueElements() {
        return issueElements;
    }


    /**
     * Sets the issueElements value for this ImportIssue.
     * 
     * @param issueElements
     */
    public void setIssueElements(com.hof.mi.web.service.ImportIssueElement[] issueElements) {
        this.issueElements = issueElements;
    }


    /**
     * Gets the itemKey value for this ImportIssue.
     * 
     * @return itemKey
     */
    public java.lang.String getItemKey() {
        return itemKey;
    }


    /**
     * Sets the itemKey value for this ImportIssue.
     * 
     * @param itemKey
     */
    public void setItemKey(java.lang.String itemKey) {
        this.itemKey = itemKey;
    }


    /**
     * Gets the resource value for this ImportIssue.
     * 
     * @return resource
     */
    public com.hof.mi.web.service.ContentResource getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this ImportIssue.
     * 
     * @param resource
     */
    public void setResource(com.hof.mi.web.service.ContentResource resource) {
        this.resource = resource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportIssue)) return false;
        ImportIssue other = (ImportIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issueElements==null && other.getIssueElements()==null) || 
             (this.issueElements!=null &&
              java.util.Arrays.equals(this.issueElements, other.getIssueElements()))) &&
            ((this.itemKey==null && other.getItemKey()==null) || 
             (this.itemKey!=null &&
              this.itemKey.equals(other.getItemKey()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource())));
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
        if (getIssueElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemKey() != null) {
            _hashCode += getItemKey().hashCode();
        }
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueElements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issueElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportIssueElement"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ContentResource"));
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
