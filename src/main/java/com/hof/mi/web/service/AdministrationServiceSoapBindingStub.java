/**
 * AdministrationServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service;

public class AdministrationServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.hof.mi.web.service.AdministrationService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remoteAdministrationCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationServiceRequest"), com.hof.mi.web.service.AdministrationServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationServiceResponse"));
        oper.setReturnClass(com.hof.mi.web.service.AdministrationServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "remoteAdministrationCallReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addColumnToViews");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tableName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "columnName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldCategoryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationServiceResponse"));
        oper.setReturnClass(com.hof.mi.web.service.AdministrationServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addColumnToViewsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addColumnToViews");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sourceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tableName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "columnName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldCategoryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationServiceResponse"));
        oper.setReturnClass(com.hof.mi.web.service.AdministrationServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addColumnToViewsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

    }

    public AdministrationServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AdministrationServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AdministrationServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "AdministrationSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.AdministrationSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "AnnualFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.AnnualFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ArrayOfAdministrationSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.AdministrationSchedule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "AdministrationSchedule");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "BiannualFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.BiannualFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "CompositeViewRefreshSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.CompositeViewRefreshSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "DailyFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.DailyFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "EndOfMonthFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.EndOfMonthFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "FilterGroupCacheRefreshSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.FilterGroupCacheRefreshSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "FortnightlyFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.FortnightlyFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "MinutesFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.MinutesFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "MonthlyFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.MonthlyFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "QuarterlyFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.QuarterlyFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "RefCodeRefreshSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.RefCodeRefreshSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ReportBroadcastSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.ReportBroadcastSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ReportFilterCacheRefreshSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.ReportFilterCacheRefreshSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ReportRefreshSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.ReportRefreshSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ScheduleFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.ScheduleFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "SourceFilterRefreshSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.SourceFilterRefreshSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "SourceFilterUpdateReminderSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.SourceFilterUpdateReminderSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "SystemTaskSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.SystemTaskSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "ThirdPartySourceAutoRunSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.ThirdPartySourceAutoRunSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "TransformationFlowSchedule");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.TransformationFlowSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "WeekdaysFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.WeekdaysFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "WeeklyFrequency");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.schedule.WeeklyFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationClientOrg");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationClientOrg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSource");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationDataSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceClientLink");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationDataSourceClientLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceOption");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationDataSourceOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationFunction");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationFunction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationGroup");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationGroupMember");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationGroupMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationPerson");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReport");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReportGroup");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationReportGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationRole");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationTask");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOf_soapenc_int");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOf_soapenc_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationClientOrg");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationClientOrg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationClientOrg");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationDataClientLink");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationDataSourceClientLink[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceClientLink");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationDataSource");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationDataSource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSource");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationDataSourceOption");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationDataSourceOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationDataSourceOption");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationFunction");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationFunction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationFunction");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationGroup");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationGroup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationGroupMember");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationGroupMember[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationGroupMember");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationPerson");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationPerson[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationPerson");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationReport");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationReportGroup");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationReportGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationReportGroup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfAdministrationRole");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.AdministrationRole[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "AdministrationRole");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfCondition");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.Condition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "Condition");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfContentResource");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ContentResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ContentResource");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfImportIssue");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ImportIssue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportIssue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfImportIssueElement");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ImportIssueElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportIssueElement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfImportOption");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ImportOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportOption");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfParentDashboard");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ParentDashboard[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentDashboard");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfParentReportGroup");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ParentReportGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentReportGroup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfPersonFavourite");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.PersonFavourite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "PersonFavourite");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfReportBinaryObject");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ReportBinaryObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ReportBinaryObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ArrayOfReportRow");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ReportRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ReportRow");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "Condition");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.Condition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ContentResource");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ContentResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportIssue");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ImportIssue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportIssueElement");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ImportIssueElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ImportOption");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ImportOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentDashboard");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ParentDashboard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ParentReportGroup");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ParentReportGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "PersonFavourite");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.PersonFavourite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ReportBinaryObject");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ReportBinaryObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.web.mi.hof.com", "ReportRow");
            cachedSerQNames.add(qName);
            cls = com.hof.mi.web.service.ReportRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.hof.mi.web.service.AdministrationServiceResponse remoteAdministrationCall(com.hof.mi.web.service.AdministrationServiceRequest req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "remoteAdministrationCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hof.mi.web.service.AdministrationServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hof.mi.web.service.AdministrationServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hof.mi.web.service.AdministrationServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hof.mi.web.service.AdministrationServiceResponse addColumnToViews(java.lang.String userName, java.lang.String password, java.lang.String dataSourceName, java.lang.String tableName, java.lang.String columnName, java.lang.String fieldCategoryName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "addColumnToViews"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, dataSourceName, tableName, columnName, fieldCategoryName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hof.mi.web.service.AdministrationServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hof.mi.web.service.AdministrationServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hof.mi.web.service.AdministrationServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hof.mi.web.service.AdministrationServiceResponse addColumnToViews(java.lang.String userName, java.lang.String password, java.lang.Integer sourceId, java.lang.String tableName, java.lang.String columnName, java.lang.String fieldCategoryName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.web.mi.hof.com", "addColumnToViews"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, sourceId, tableName, columnName, fieldCategoryName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hof.mi.web.service.AdministrationServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hof.mi.web.service.AdministrationServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hof.mi.web.service.AdministrationServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
