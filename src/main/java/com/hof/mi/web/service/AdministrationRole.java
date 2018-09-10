/**
 * AdministrationRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationRole  implements java.io.Serializable {
    private com.hof.mi.web.service.AdministrationFunction[] functions;

    private java.lang.String roleCode;

    private java.lang.String roleDescription;

    private java.lang.String roleName;

    public AdministrationRole() {
    }

    public AdministrationRole(
           com.hof.mi.web.service.AdministrationFunction[] functions,
           java.lang.String roleCode,
           java.lang.String roleDescription,
           java.lang.String roleName) {
           this.functions = functions;
           this.roleCode = roleCode;
           this.roleDescription = roleDescription;
           this.roleName = roleName;
    }


    /**
     * Gets the functions value for this AdministrationRole.
     * 
     * @return functions
     */
    public com.hof.mi.web.service.AdministrationFunction[] getFunctions() {
        return functions;
    }


    /**
     * Sets the functions value for this AdministrationRole.
     * 
     * @param functions
     */
    public void setFunctions(com.hof.mi.web.service.AdministrationFunction[] functions) {
        this.functions = functions;
    }


    /**
     * Gets the roleCode value for this AdministrationRole.
     * 
     * @return roleCode
     */
    public java.lang.String getRoleCode() {
        return roleCode;
    }


    /**
     * Sets the roleCode value for this AdministrationRole.
     * 
     * @param roleCode
     */
    public void setRoleCode(java.lang.String roleCode) {
        this.roleCode = roleCode;
    }


    /**
     * Gets the roleDescription value for this AdministrationRole.
     * 
     * @return roleDescription
     */
    public java.lang.String getRoleDescription() {
        return roleDescription;
    }


    /**
     * Sets the roleDescription value for this AdministrationRole.
     * 
     * @param roleDescription
     */
    public void setRoleDescription(java.lang.String roleDescription) {
        this.roleDescription = roleDescription;
    }


    /**
     * Gets the roleName value for this AdministrationRole.
     * 
     * @return roleName
     */
    public java.lang.String getRoleName() {
        return roleName;
    }


    /**
     * Sets the roleName value for this AdministrationRole.
     * 
     * @param roleName
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationRole)) return false;
        AdministrationRole other = (AdministrationRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.functions==null && other.getFunctions()==null) || 
             (this.functions!=null &&
              java.util.Arrays.equals(this.functions, other.getFunctions()))) &&
            ((this.roleCode==null && other.getRoleCode()==null) || 
             (this.roleCode!=null &&
              this.roleCode.equals(other.getRoleCode()))) &&
            ((this.roleDescription==null && other.getRoleDescription()==null) || 
             (this.roleDescription!=null &&
              this.roleDescription.equals(other.getRoleDescription()))) &&
            ((this.roleName==null && other.getRoleName()==null) || 
             (this.roleName!=null &&
              this.roleName.equals(other.getRoleName())));
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
        if (getFunctions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFunctions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFunctions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleCode() != null) {
            _hashCode += getRoleCode().hashCode();
        }
        if (getRoleDescription() != null) {
            _hashCode += getRoleDescription().hashCode();
        }
        if (getRoleName() != null) {
            _hashCode += getRoleName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "functions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationFunction"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleName"));
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
