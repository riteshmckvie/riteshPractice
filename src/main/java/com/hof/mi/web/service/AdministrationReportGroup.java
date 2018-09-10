/**
 * AdministrationReportGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationReportGroup  implements java.io.Serializable {
    private int[] associatedReports;

    private java.lang.String groupDescription;

    private com.hof.mi.web.service.AdministrationReport[] groupReports;

    private java.lang.String publishUUID;

    private java.lang.String reportGroupDescription;

    private java.lang.Integer reportGroupId;

    private java.lang.String reportGroupInternalReference;

    private java.lang.String reportGroupName;

    private java.lang.String reportGroupStatus;

    private java.lang.String reportGroupType;

    public AdministrationReportGroup() {
    }

    public AdministrationReportGroup(
           int[] associatedReports,
           java.lang.String groupDescription,
           com.hof.mi.web.service.AdministrationReport[] groupReports,
           java.lang.String publishUUID,
           java.lang.String reportGroupDescription,
           java.lang.Integer reportGroupId,
           java.lang.String reportGroupInternalReference,
           java.lang.String reportGroupName,
           java.lang.String reportGroupStatus,
           java.lang.String reportGroupType) {
           this.associatedReports = associatedReports;
           this.groupDescription = groupDescription;
           this.groupReports = groupReports;
           this.publishUUID = publishUUID;
           this.reportGroupDescription = reportGroupDescription;
           this.reportGroupId = reportGroupId;
           this.reportGroupInternalReference = reportGroupInternalReference;
           this.reportGroupName = reportGroupName;
           this.reportGroupStatus = reportGroupStatus;
           this.reportGroupType = reportGroupType;
    }


    /**
     * Gets the associatedReports value for this AdministrationReportGroup.
     * 
     * @return associatedReports
     */
    public int[] getAssociatedReports() {
        return associatedReports;
    }


    /**
     * Sets the associatedReports value for this AdministrationReportGroup.
     * 
     * @param associatedReports
     */
    public void setAssociatedReports(int[] associatedReports) {
        this.associatedReports = associatedReports;
    }


    /**
     * Gets the groupDescription value for this AdministrationReportGroup.
     * 
     * @return groupDescription
     */
    public java.lang.String getGroupDescription() {
        return groupDescription;
    }


    /**
     * Sets the groupDescription value for this AdministrationReportGroup.
     * 
     * @param groupDescription
     */
    public void setGroupDescription(java.lang.String groupDescription) {
        this.groupDescription = groupDescription;
    }


    /**
     * Gets the groupReports value for this AdministrationReportGroup.
     * 
     * @return groupReports
     */
    public com.hof.mi.web.service.AdministrationReport[] getGroupReports() {
        return groupReports;
    }


    /**
     * Sets the groupReports value for this AdministrationReportGroup.
     * 
     * @param groupReports
     */
    public void setGroupReports(com.hof.mi.web.service.AdministrationReport[] groupReports) {
        this.groupReports = groupReports;
    }


    /**
     * Gets the publishUUID value for this AdministrationReportGroup.
     * 
     * @return publishUUID
     */
    public java.lang.String getPublishUUID() {
        return publishUUID;
    }


    /**
     * Sets the publishUUID value for this AdministrationReportGroup.
     * 
     * @param publishUUID
     */
    public void setPublishUUID(java.lang.String publishUUID) {
        this.publishUUID = publishUUID;
    }


    /**
     * Gets the reportGroupDescription value for this AdministrationReportGroup.
     * 
     * @return reportGroupDescription
     */
    public java.lang.String getReportGroupDescription() {
        return reportGroupDescription;
    }


    /**
     * Sets the reportGroupDescription value for this AdministrationReportGroup.
     * 
     * @param reportGroupDescription
     */
    public void setReportGroupDescription(java.lang.String reportGroupDescription) {
        this.reportGroupDescription = reportGroupDescription;
    }


    /**
     * Gets the reportGroupId value for this AdministrationReportGroup.
     * 
     * @return reportGroupId
     */
    public java.lang.Integer getReportGroupId() {
        return reportGroupId;
    }


    /**
     * Sets the reportGroupId value for this AdministrationReportGroup.
     * 
     * @param reportGroupId
     */
    public void setReportGroupId(java.lang.Integer reportGroupId) {
        this.reportGroupId = reportGroupId;
    }


    /**
     * Gets the reportGroupInternalReference value for this AdministrationReportGroup.
     * 
     * @return reportGroupInternalReference
     */
    public java.lang.String getReportGroupInternalReference() {
        return reportGroupInternalReference;
    }


    /**
     * Sets the reportGroupInternalReference value for this AdministrationReportGroup.
     * 
     * @param reportGroupInternalReference
     */
    public void setReportGroupInternalReference(java.lang.String reportGroupInternalReference) {
        this.reportGroupInternalReference = reportGroupInternalReference;
    }


    /**
     * Gets the reportGroupName value for this AdministrationReportGroup.
     * 
     * @return reportGroupName
     */
    public java.lang.String getReportGroupName() {
        return reportGroupName;
    }


    /**
     * Sets the reportGroupName value for this AdministrationReportGroup.
     * 
     * @param reportGroupName
     */
    public void setReportGroupName(java.lang.String reportGroupName) {
        this.reportGroupName = reportGroupName;
    }


    /**
     * Gets the reportGroupStatus value for this AdministrationReportGroup.
     * 
     * @return reportGroupStatus
     */
    public java.lang.String getReportGroupStatus() {
        return reportGroupStatus;
    }


    /**
     * Sets the reportGroupStatus value for this AdministrationReportGroup.
     * 
     * @param reportGroupStatus
     */
    public void setReportGroupStatus(java.lang.String reportGroupStatus) {
        this.reportGroupStatus = reportGroupStatus;
    }


    /**
     * Gets the reportGroupType value for this AdministrationReportGroup.
     * 
     * @return reportGroupType
     */
    public java.lang.String getReportGroupType() {
        return reportGroupType;
    }


    /**
     * Sets the reportGroupType value for this AdministrationReportGroup.
     * 
     * @param reportGroupType
     */
    public void setReportGroupType(java.lang.String reportGroupType) {
        this.reportGroupType = reportGroupType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministrationReportGroup)) return false;
        AdministrationReportGroup other = (AdministrationReportGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.associatedReports==null && other.getAssociatedReports()==null) || 
             (this.associatedReports!=null &&
              java.util.Arrays.equals(this.associatedReports, other.getAssociatedReports()))) &&
            ((this.groupDescription==null && other.getGroupDescription()==null) || 
             (this.groupDescription!=null &&
              this.groupDescription.equals(other.getGroupDescription()))) &&
            ((this.groupReports==null && other.getGroupReports()==null) || 
             (this.groupReports!=null &&
              java.util.Arrays.equals(this.groupReports, other.getGroupReports()))) &&
            ((this.publishUUID==null && other.getPublishUUID()==null) || 
             (this.publishUUID!=null &&
              this.publishUUID.equals(other.getPublishUUID()))) &&
            ((this.reportGroupDescription==null && other.getReportGroupDescription()==null) || 
             (this.reportGroupDescription!=null &&
              this.reportGroupDescription.equals(other.getReportGroupDescription()))) &&
            ((this.reportGroupId==null && other.getReportGroupId()==null) || 
             (this.reportGroupId!=null &&
              this.reportGroupId.equals(other.getReportGroupId()))) &&
            ((this.reportGroupInternalReference==null && other.getReportGroupInternalReference()==null) || 
             (this.reportGroupInternalReference!=null &&
              this.reportGroupInternalReference.equals(other.getReportGroupInternalReference()))) &&
            ((this.reportGroupName==null && other.getReportGroupName()==null) || 
             (this.reportGroupName!=null &&
              this.reportGroupName.equals(other.getReportGroupName()))) &&
            ((this.reportGroupStatus==null && other.getReportGroupStatus()==null) || 
             (this.reportGroupStatus!=null &&
              this.reportGroupStatus.equals(other.getReportGroupStatus()))) &&
            ((this.reportGroupType==null && other.getReportGroupType()==null) || 
             (this.reportGroupType!=null &&
              this.reportGroupType.equals(other.getReportGroupType())));
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
        if (getAssociatedReports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedReports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedReports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupDescription() != null) {
            _hashCode += getGroupDescription().hashCode();
        }
        if (getGroupReports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupReports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupReports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublishUUID() != null) {
            _hashCode += getPublishUUID().hashCode();
        }
        if (getReportGroupDescription() != null) {
            _hashCode += getReportGroupDescription().hashCode();
        }
        if (getReportGroupId() != null) {
            _hashCode += getReportGroupId().hashCode();
        }
        if (getReportGroupInternalReference() != null) {
            _hashCode += getReportGroupInternalReference().hashCode();
        }
        if (getReportGroupName() != null) {
            _hashCode += getReportGroupName().hashCode();
        }
        if (getReportGroupStatus() != null) {
            _hashCode += getReportGroupStatus().hashCode();
        }
        if (getReportGroupType() != null) {
            _hashCode += getReportGroupType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministrationReportGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReportGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedReports");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associatedReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupReports");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReport"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publishUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupInternalReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupInternalReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGroupType"));
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
