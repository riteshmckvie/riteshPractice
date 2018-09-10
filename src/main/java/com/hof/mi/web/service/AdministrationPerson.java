/**
 * AdministrationPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationPerson  implements java.io.Serializable {
    private java.lang.String emailAddress;

    private java.lang.String firstName;

    private java.lang.String initial;

    private java.lang.Integer ipId;

    private java.lang.String languageCode;

    private java.lang.String lastName;

    private java.lang.String password;

    private java.lang.String roleCode;

    private java.lang.String salutationCode;

    private java.lang.String status;

    private java.lang.String timeZoneCode;

    private java.lang.String userId;

    public AdministrationPerson() {
    }

    public AdministrationPerson(
           java.lang.String emailAddress,
           java.lang.String firstName,
           java.lang.String initial,
           java.lang.Integer ipId,
           java.lang.String languageCode,
           java.lang.String lastName,
           java.lang.String password,
           java.lang.String roleCode,
           java.lang.String salutationCode,
           java.lang.String status,
           java.lang.String timeZoneCode,
           java.lang.String userId) {
           this.emailAddress = emailAddress;
           this.firstName = firstName;
           this.initial = initial;
           this.ipId = ipId;
           this.languageCode = languageCode;
           this.lastName = lastName;
           this.password = password;
           this.roleCode = roleCode;
           this.salutationCode = salutationCode;
           this.status = status;
           this.timeZoneCode = timeZoneCode;
           this.userId = userId;
    }


    /**
     * Gets the emailAddress value for this AdministrationPerson.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this AdministrationPerson.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the firstName value for this AdministrationPerson.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this AdministrationPerson.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the initial value for this AdministrationPerson.
     * 
     * @return initial
     */
    public java.lang.String getInitial() {
        return initial;
    }


    /**
     * Sets the initial value for this AdministrationPerson.
     * 
     * @param initial
     */
    public void setInitial(java.lang.String initial) {
        this.initial = initial;
    }


    /**
     * Gets the ipId value for this AdministrationPerson.
     * 
     * @return ipId
     */
    public java.lang.Integer getIpId() {
        return ipId;
    }


    /**
     * Sets the ipId value for this AdministrationPerson.
     * 
     * @param ipId
     */
    public void setIpId(java.lang.Integer ipId) {
        this.ipId = ipId;
    }


    /**
     * Gets the languageCode value for this AdministrationPerson.
     * 
     * @return languageCode
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this AdministrationPerson.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the lastName value for this AdministrationPerson.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this AdministrationPerson.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the password value for this AdministrationPerson.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AdministrationPerson.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the roleCode value for this AdministrationPerson.
     * 
     * @return roleCode
     */
    public java.lang.String getRoleCode() {
        return roleCode;
    }


    /**
     * Sets the roleCode value for this AdministrationPerson.
     * 
     * @param roleCode
     */
    public void setRoleCode(java.lang.String roleCode) {
        this.roleCode = roleCode;
    }


    /**
     * Gets the salutationCode value for this AdministrationPerson.
     * 
     * @return salutationCode
     */
    public java.lang.String getSalutationCode() {
        return salutationCode;
    }


    /**
     * Sets the salutationCode value for this AdministrationPerson.
     * 
     * @param salutationCode
     */
    public void setSalutationCode(java.lang.String salutationCode) {
        this.salutationCode = salutationCode;
    }


    /**
     * Gets the status value for this AdministrationPerson.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdministrationPerson.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the timeZoneCode value for this AdministrationPerson.
     * 
     * @return timeZoneCode
     */
    public java.lang.String getTimeZoneCode() {
        return timeZoneCode;
    }


    /**
     * Sets the timeZoneCode value for this AdministrationPerson.
     * 
     * @param timeZoneCode
     */
    public void setTimeZoneCode(java.lang.String timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
    }


    /**
     * Gets the userId value for this AdministrationPerson.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this AdministrationPerson.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationPerson)) return false;
        AdministrationPerson other = (AdministrationPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.initial==null && other.getInitial()==null) || 
             (this.initial!=null &&
              this.initial.equals(other.getInitial()))) &&
            ((this.ipId==null && other.getIpId()==null) || 
             (this.ipId!=null &&
              this.ipId.equals(other.getIpId()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.roleCode==null && other.getRoleCode()==null) || 
             (this.roleCode!=null &&
              this.roleCode.equals(other.getRoleCode()))) &&
            ((this.salutationCode==null && other.getSalutationCode()==null) || 
             (this.salutationCode!=null &&
              this.salutationCode.equals(other.getSalutationCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.timeZoneCode==null && other.getTimeZoneCode()==null) || 
             (this.timeZoneCode!=null &&
              this.timeZoneCode.equals(other.getTimeZoneCode()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getInitial() != null) {
            _hashCode += getInitial().hashCode();
        }
        if (getIpId() != null) {
            _hashCode += getIpId().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getRoleCode() != null) {
            _hashCode += getRoleCode().hashCode();
        }
        if (getSalutationCode() != null) {
            _hashCode += getSalutationCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTimeZoneCode() != null) {
            _hashCode += getTimeZoneCode().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salutationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZoneCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
