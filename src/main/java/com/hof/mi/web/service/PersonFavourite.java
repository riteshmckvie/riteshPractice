/**
 * PersonFavourite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class PersonFavourite  implements java.io.Serializable {
    private java.lang.Integer contentId;

    private java.lang.String contentType;

    private java.lang.String creationCode;

    private java.util.Date creationDate;

    private java.lang.Integer creatorId;

    private java.lang.String favouriteType;

    private java.lang.Integer instanceId;

    private java.lang.String message;

    private java.lang.Integer personId;

    private java.lang.String subject;

    private java.lang.Integer textEntityId;

    private java.lang.String widthCode;

    public PersonFavourite() {
    }

    public PersonFavourite(
           java.lang.Integer contentId,
           java.lang.String contentType,
           java.lang.String creationCode,
           java.util.Date creationDate,
           java.lang.Integer creatorId,
           java.lang.String favouriteType,
           java.lang.Integer instanceId,
           java.lang.String message,
           java.lang.Integer personId,
           java.lang.String subject,
           java.lang.Integer textEntityId,
           java.lang.String widthCode) {
           this.contentId = contentId;
           this.contentType = contentType;
           this.creationCode = creationCode;
           this.creationDate = creationDate;
           this.creatorId = creatorId;
           this.favouriteType = favouriteType;
           this.instanceId = instanceId;
           this.message = message;
           this.personId = personId;
           this.subject = subject;
           this.textEntityId = textEntityId;
           this.widthCode = widthCode;
    }


    /**
     * Gets the contentId value for this PersonFavourite.
     * 
     * @return contentId
     */
    public java.lang.Integer getContentId() {
        return contentId;
    }


    /**
     * Sets the contentId value for this PersonFavourite.
     * 
     * @param contentId
     */
    public void setContentId(java.lang.Integer contentId) {
        this.contentId = contentId;
    }


    /**
     * Gets the contentType value for this PersonFavourite.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this PersonFavourite.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the creationCode value for this PersonFavourite.
     * 
     * @return creationCode
     */
    public java.lang.String getCreationCode() {
        return creationCode;
    }


    /**
     * Sets the creationCode value for this PersonFavourite.
     * 
     * @param creationCode
     */
    public void setCreationCode(java.lang.String creationCode) {
        this.creationCode = creationCode;
    }


    /**
     * Gets the creationDate value for this PersonFavourite.
     * 
     * @return creationDate
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this PersonFavourite.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the creatorId value for this PersonFavourite.
     * 
     * @return creatorId
     */
    public java.lang.Integer getCreatorId() {
        return creatorId;
    }


    /**
     * Sets the creatorId value for this PersonFavourite.
     * 
     * @param creatorId
     */
    public void setCreatorId(java.lang.Integer creatorId) {
        this.creatorId = creatorId;
    }


    /**
     * Gets the favouriteType value for this PersonFavourite.
     * 
     * @return favouriteType
     */
    public java.lang.String getFavouriteType() {
        return favouriteType;
    }


    /**
     * Sets the favouriteType value for this PersonFavourite.
     * 
     * @param favouriteType
     */
    public void setFavouriteType(java.lang.String favouriteType) {
        this.favouriteType = favouriteType;
    }


    /**
     * Gets the instanceId value for this PersonFavourite.
     * 
     * @return instanceId
     */
    public java.lang.Integer getInstanceId() {
        return instanceId;
    }


    /**
     * Sets the instanceId value for this PersonFavourite.
     * 
     * @param instanceId
     */
    public void setInstanceId(java.lang.Integer instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * Gets the message value for this PersonFavourite.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this PersonFavourite.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the personId value for this PersonFavourite.
     * 
     * @return personId
     */
    public java.lang.Integer getPersonId() {
        return personId;
    }


    /**
     * Sets the personId value for this PersonFavourite.
     * 
     * @param personId
     */
    public void setPersonId(java.lang.Integer personId) {
        this.personId = personId;
    }


    /**
     * Gets the subject value for this PersonFavourite.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this PersonFavourite.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the textEntityId value for this PersonFavourite.
     * 
     * @return textEntityId
     */
    public java.lang.Integer getTextEntityId() {
        return textEntityId;
    }


    /**
     * Sets the textEntityId value for this PersonFavourite.
     * 
     * @param textEntityId
     */
    public void setTextEntityId(java.lang.Integer textEntityId) {
        this.textEntityId = textEntityId;
    }


    /**
     * Gets the widthCode value for this PersonFavourite.
     * 
     * @return widthCode
     */
    public java.lang.String getWidthCode() {
        return widthCode;
    }


    /**
     * Sets the widthCode value for this PersonFavourite.
     * 
     * @param widthCode
     */
    public void setWidthCode(java.lang.String widthCode) {
        this.widthCode = widthCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonFavourite)) return false;
        PersonFavourite other = (PersonFavourite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentId==null && other.getContentId()==null) || 
             (this.contentId!=null &&
              this.contentId.equals(other.getContentId()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.creationCode==null && other.getCreationCode()==null) || 
             (this.creationCode!=null &&
              this.creationCode.equals(other.getCreationCode()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.creatorId==null && other.getCreatorId()==null) || 
             (this.creatorId!=null &&
              this.creatorId.equals(other.getCreatorId()))) &&
            ((this.favouriteType==null && other.getFavouriteType()==null) || 
             (this.favouriteType!=null &&
              this.favouriteType.equals(other.getFavouriteType()))) &&
            ((this.instanceId==null && other.getInstanceId()==null) || 
             (this.instanceId!=null &&
              this.instanceId.equals(other.getInstanceId()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.personId==null && other.getPersonId()==null) || 
             (this.personId!=null &&
              this.personId.equals(other.getPersonId()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.textEntityId==null && other.getTextEntityId()==null) || 
             (this.textEntityId!=null &&
              this.textEntityId.equals(other.getTextEntityId()))) &&
            ((this.widthCode==null && other.getWidthCode()==null) || 
             (this.widthCode!=null &&
              this.widthCode.equals(other.getWidthCode())));
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
        if (getContentId() != null) {
            _hashCode += getContentId().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getCreationCode() != null) {
            _hashCode += getCreationCode().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getCreatorId() != null) {
            _hashCode += getCreatorId().hashCode();
        }
        if (getFavouriteType() != null) {
            _hashCode += getFavouriteType().hashCode();
        }
        if (getInstanceId() != null) {
            _hashCode += getInstanceId().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPersonId() != null) {
            _hashCode += getPersonId().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getTextEntityId() != null) {
            _hashCode += getTextEntityId().hashCode();
        }
        if (getWidthCode() != null) {
            _hashCode += getWidthCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonFavourite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "PersonFavourite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favouriteType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "favouriteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "textEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "widthCode"));
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
