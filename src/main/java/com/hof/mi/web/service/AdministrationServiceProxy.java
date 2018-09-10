package com.hof.mi.web.service;

public class AdministrationServiceProxy implements com.hof.mi.web.service.AdministrationService {
  private String _endpoint = null;
  private com.hof.mi.web.service.AdministrationService administrationService = null;
  
  public AdministrationServiceProxy() {
    _initAdministrationServiceProxy();
  }
  
  public AdministrationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdministrationServiceProxy();
  }
  
  private void _initAdministrationServiceProxy() {
    try {
      administrationService = (new com.hof.mi.web.service.AdministrationServiceServiceLocator()).getAdministrationService();
      if (administrationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)administrationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)administrationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (administrationService != null)
      ((javax.xml.rpc.Stub)administrationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hof.mi.web.service.AdministrationService getAdministrationService() {
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService;
  }
  
  public com.hof.mi.web.service.AdministrationServiceResponse remoteAdministrationCall(com.hof.mi.web.service.AdministrationServiceRequest req) throws java.rmi.RemoteException{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.remoteAdministrationCall(req);
  }
  
  public com.hof.mi.web.service.AdministrationServiceResponse addColumnToViews(java.lang.String userName, java.lang.String password, java.lang.String dataSourceName, java.lang.String tableName, java.lang.String columnName, java.lang.String fieldCategoryName) throws java.rmi.RemoteException{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.addColumnToViews(userName, password, dataSourceName, tableName, columnName, fieldCategoryName);
  }
  
  public com.hof.mi.web.service.AdministrationServiceResponse addColumnToViews(java.lang.String userName, java.lang.String password, java.lang.Integer sourceId, java.lang.String tableName, java.lang.String columnName, java.lang.String fieldCategoryName) throws java.rmi.RemoteException{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.addColumnToViews(userName, password, sourceId, tableName, columnName, fieldCategoryName);
  }
  
  
}