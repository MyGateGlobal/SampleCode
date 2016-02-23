
package com.mygateglobal.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "APIService", targetNamespace = "https://api.mygateglobal.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface APIService {


    /**
     * 
     * @param authenticate
     * @param reqParam
     * @return
     *     returns com.mygateglobal.api.ResponseMessage
     */
    @WebMethod(action = "https://api.mygateglobal.com/execRequest")
    @WebResult(name = "responseMessage", targetNamespace = "https://api.mygateglobal.com/", partName = "resParam")
    public ResponseMessage execRequest(
        @WebParam(name = "requestMessage", targetNamespace = "https://api.mygateglobal.com/", partName = "reqParam")
        String reqParam,
        @WebParam(name = "authenticate", targetNamespace = "https://api.mygateglobal.com/", header = true, partName = "authenticate")
        Authenticate authenticate);

}