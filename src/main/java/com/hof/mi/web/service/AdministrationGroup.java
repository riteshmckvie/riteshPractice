/**
 * AdministrationGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationGroup  implements java.io.Serializable {
    private java.lang.String groupDescription;

    private java.lang.Integer groupId;

    private java.lang.String groupInternalReference;

    private com.hof.mi.web.service.AdministrationGroupMember[] groupMembers;

    private java.lang.String groupName;

    private java.lang.String groupStatus;

    public AdministrationGroup() {
    }

    public AdministrationGroup(
           java.lang.String groupDescription,
           java.lang.Integer groupId,
           java.lang.String groupInternalReference,
           com.hof.mi.web.service.AdministrationGroupMember[] groupMembers,
           java.lang.String groupName,
           java.lang.String groupStatus) {
           this.groupDescription = groupDescription;
           this.groupId = groupId;
           this.groupInternalReference = groupInternalReference;
           this.groupMembers = groupMembers;
           this.groupName = groupName;
           this.groupStatus = groupStatus;
    }


    /**
     * Gets the groupDescription value for this AdministrationGroup.
     * 
     * @return groupDescription
     */
    public java.lang.String getGroupDescription() {
        return groupDescription;
    }


    /**
     * Sets the groupDescription value for this AdministrationGroup.
     * 
     * @param groupDescription
     */
    public void setGroupDescription(java.lang.String groupDescription) {
        this.groupDescription = groupDescription;
    }


    /**
     * Gets the groupId value for this AdministrationGroup.
     * 
     * @return groupId
     */
    public java.lang.Integer getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this AdministrationGroup.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the groupInternalReference value for this AdministrationGroup.
     * 
     * @return groupInternalReference
     */
    public java.lang.String getGroupInternalReference() {
        return groupInternalReference;
    }


    /**
     * Sets the groupInternalReference value for this AdministrationGroup.
     * 
     * @param groupInternalReference
     */
    public void setGroupInternalReference(java.lang.String groupInternalReference) {
        this.groupInternalReference = groupInternalReference;
    }


    /**
     * Gets the groupMembers value for this AdministrationGroup.
     * 
     * @return groupMembers
     */
    public com.hof.mi.web.service.AdministrationGroupMember[] getGroupMembers() {
        return groupMembers;
    }


    /**
     * Sets the groupMembers value for this AdministrationGroup.
     * 
     * @param groupMembers
     */
    public void setGroupMembers(com.hof.mi.web.service.AdministrationGroupMember[] groupMembers) {
        this.groupMembers = groupMembers;
    }


    /**
     * Gets the groupName value for this AdministrationGroup.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this AdministrationGroup.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the groupStatus value for this AdministrationGroup.
     * 
     * @return groupStatus
     */
    public java.lang.String getGroupStatus() {
        return groupStatus;
    }


    /**
     * Sets the groupStatus value for this AdministrationGroup.
     * 
     * @param groupStatus
     */
    public void setGroupStatus(java.lang.String groupStatus) {
        this.groupStatus = groupStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationGroup)) return false;
        AdministrationGroup other = (AdministrationGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupDescription==null && other.getGroupDescription()==null) || 
             (this.groupDescription!=null &&
              this.groupDescription.equals(other.getGroupDescription()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.groupInternalReference==null && other.getGroupInternalReference()==null) || 
             (this.groupInternalReference!=null &&
              this.groupInternalReference.equals(other.getGroupInternalReference()))) &&
            ((this.groupMembers==null && other.getGroupMembers()==null) || 
             (this.groupMembers!=null &&
              java.util.Arrays.equals(this.groupMembers, other.getGroupMembers()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.groupStatus==null && other.getGroupStatus()==null) || 
             (this.groupStatus!=null &&
              this.groupStatus.equals(other.getGroupStatus())));
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
        if (getGroupDescription() != null) {
            _hashCode += getGroupDescription().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getGroupInternalReference() != null) {
            _hashCode += getGroupInternalReference().hashCode();
        }
        if (getGroupMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupMembers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getGroupStatus() != null) {
            _hashCode += getGroupStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupInternalReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupInternalReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationGroupMember"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupStatus"));
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
