/**
 * ContentResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class ContentResource  implements java.io.Serializable {
    private java.lang.String resourceCode;

    private java.lang.String resourceDescription;

    private java.lang.Integer resourceId;

    private java.lang.String resourceName;

    private java.lang.Integer resourceOrgId;

    private java.lang.String resourceType;

    private java.lang.String resourceUUID;

    public ContentResource() {
    }

    public ContentResource(
           java.lang.String resourceCode,
           java.lang.String resourceDescription,
           java.lang.Integer resourceId,
           java.lang.String resourceName,
           java.lang.Integer resourceOrgId,
           java.lang.String resourceType,
           java.lang.String resourceUUID) {
           this.resourceCode = resourceCode;
           this.resourceDescription = resourceDescription;
           this.resourceId = resourceId;
           this.resourceName = resourceName;
           this.resourceOrgId = resourceOrgId;
           this.resourceType = resourceType;
           this.resourceUUID = resourceUUID;
    }


    /**
     * Gets the resourceCode value for this ContentResource.
     * 
     * @return resourceCode
     */
    public java.lang.String getResourceCode() {
        return resourceCode;
    }


    /**
     * Sets the resourceCode value for this ContentResource.
     * 
     * @param resourceCode
     */
    public void setResourceCode(java.lang.String resourceCode) {
        this.resourceCode = resourceCode;
    }


    /**
     * Gets the resourceDescription value for this ContentResource.
     * 
     * @return resourceDescription
     */
    public java.lang.String getResourceDescription() {
        return resourceDescription;
    }


    /**
     * Sets the resourceDescription value for this ContentResource.
     * 
     * @param resourceDescription
     */
    public void setResourceDescription(java.lang.String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }


    /**
     * Gets the resourceId value for this ContentResource.
     * 
     * @return resourceId
     */
    public java.lang.Integer getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this ContentResource.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Integer resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the resourceName value for this ContentResource.
     * 
     * @return resourceName
     */
    public java.lang.String getResourceName() {
        return resourceName;
    }


    /**
     * Sets the resourceName value for this ContentResource.
     * 
     * @param resourceName
     */
    public void setResourceName(java.lang.String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * Gets the resourceOrgId value for this ContentResource.
     * 
     * @return resourceOrgId
     */
    public java.lang.Integer getResourceOrgId() {
        return resourceOrgId;
    }


    /**
     * Sets the resourceOrgId value for this ContentResource.
     * 
     * @param resourceOrgId
     */
    public void setResourceOrgId(java.lang.Integer resourceOrgId) {
        this.resourceOrgId = resourceOrgId;
    }


    /**
     * Gets the resourceType value for this ContentResource.
     * 
     * @return resourceType
     */
    public java.lang.String getResourceType() {
        return resourceType;
    }


    /**
     * Sets the resourceType value for this ContentResource.
     * 
     * @param resourceType
     */
    public void setResourceType(java.lang.String resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * Gets the resourceUUID value for this ContentResource.
     * 
     * @return resourceUUID
     */
    public java.lang.String getResourceUUID() {
        return resourceUUID;
    }


    /**
     * Sets the resourceUUID value for this ContentResource.
     * 
     * @param resourceUUID
     */
    public void setResourceUUID(java.lang.String resourceUUID) {
        this.resourceUUID = resourceUUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentResource)) return false;
        ContentResource other = (ContentResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceCode==null && other.getResourceCode()==null) || 
             (this.resourceCode!=null &&
              this.resourceCode.equals(other.getResourceCode()))) &&
            ((this.resourceDescription==null && other.getResourceDescription()==null) || 
             (this.resourceDescription!=null &&
              this.resourceDescription.equals(other.getResourceDescription()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.resourceName==null && other.getResourceName()==null) || 
             (this.resourceName!=null &&
              this.resourceName.equals(other.getResourceName()))) &&
            ((this.resourceOrgId==null && other.getResourceOrgId()==null) || 
             (this.resourceOrgId!=null &&
              this.resourceOrgId.equals(other.getResourceOrgId()))) &&
            ((this.resourceType==null && other.getResourceType()==null) || 
             (this.resourceType!=null &&
              this.resourceType.equals(other.getResourceType()))) &&
            ((this.resourceUUID==null && other.getResourceUUID()==null) || 
             (this.resourceUUID!=null &&
              this.resourceUUID.equals(other.getResourceUUID())));
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
        if (getResourceCode() != null) {
            _hashCode += getResourceCode().hashCode();
        }
        if (getResourceDescription() != null) {
            _hashCode += getResourceDescription().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getResourceName() != null) {
            _hashCode += getResourceName().hashCode();
        }
        if (getResourceOrgId() != null) {
            _hashCode += getResourceOrgId().hashCode();
        }
        if (getResourceType() != null) {
            _hashCode += getResourceType().hashCode();
        }
        if (getResourceUUID() != null) {
            _hashCode += getResourceUUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ContentResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceOrgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceOrgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceUUID"));
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
