//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.ComponentModel;
using System.Diagnostics;
using System.Web.Services;
using System.Web.Services.Protocols;
using System.Xml.Serialization;

// 
// This source code was auto-generated by Web Services Description Language Utility
//Mono Framework v4.0.30319.42000
//


/// CodeRemarks
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "0.0.0.0")]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Web.Services.WebServiceBindingAttribute(Name="SayHelloServicePortBinding", Namespace="http://hello/")]
public partial class SayHelloServiceService : System.Web.Services.Protocols.SoapHttpClientProtocol {
    
    private System.Threading.SendOrPostCallback sayHelloOperationCompleted;
    
    /// CodeRemarks
    public SayHelloServiceService() {
        this.Url = "http://e-mc137-123:8080/q1/SayHelloServiceService";
    }
    
    /// CodeRemarks
    public event sayHelloCompletedEventHandler sayHelloCompleted;
    
    /// CodeRemarks
    [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", RequestNamespace="http://hello/", ResponseNamespace="http://hello/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
    [return: System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string sayHello([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string arg0) {
        object[] results = this.Invoke("sayHello", new object[] {
                    arg0});
        return ((string)(results[0]));
    }
    
    /// CodeRemarks
    public void sayHelloAsync(string arg0) {
        this.sayHelloAsync(arg0, null);
    }
    
    /// CodeRemarks
    public void sayHelloAsync(string arg0, object userState) {
        if ((this.sayHelloOperationCompleted == null)) {
            this.sayHelloOperationCompleted = new System.Threading.SendOrPostCallback(this.OnsayHelloOperationCompleted);
        }
        this.InvokeAsync("sayHello", new object[] {
                    arg0}, this.sayHelloOperationCompleted, userState);
    }
    
    private void OnsayHelloOperationCompleted(object arg) {
        if ((this.sayHelloCompleted != null)) {
            System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
            this.sayHelloCompleted(this, new sayHelloCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
        }
    }
    
    /// CodeRemarks
    public new void CancelAsync(object userState) {
        base.CancelAsync(userState);
    }
}

/// CodeRemarks
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "0.0.0.0")]
public delegate void sayHelloCompletedEventHandler(object sender, sayHelloCompletedEventArgs e);

/// CodeRemarks
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "0.0.0.0")]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
public partial class sayHelloCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
    
    private object[] results;
    
    internal sayHelloCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
            base(exception, cancelled, userState) {
        this.results = results;
    }
    
    /// CodeRemarks
    public string Result {
        get {
            this.RaiseExceptionIfNecessary();
            return ((string)(this.results[0]));
        }
    }
}
