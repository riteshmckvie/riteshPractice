/**
 * AdministrationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public interface AdministrationService extends java.rmi.Remote {
    public com.hof.mi.web.service.AdministrationServiceResponse remoteAdministrationCall(com.hof.mi.web.service.AdministrationServiceRequest req) throws java.rmi.RemoteException;
    public com.hof.mi.web.service.AdministrationServiceResponse addColumnToViews(java.lang.String userName, java.lang.String password, java.lang.String dataSourceName, java.lang.String tableName, java.lang.String columnName, java.lang.String fieldCategoryName) throws java.rmi.RemoteException;
    public com.hof.mi.web.service.AdministrationServiceResponse addColumnToViews(java.lang.String userName, java.lang.String password, java.lang.Integer sourceId, java.lang.String tableName, java.lang.String columnName, java.lang.String fieldCategoryName) throws java.rmi.RemoteException;
}
