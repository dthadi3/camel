/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.servlet;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ServletEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "chunked": ((ServletEndpoint) target).setChunked(property(camelContext, boolean.class, value)); return true;
        case "disableStreamCache": ((ServletEndpoint) target).setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "headerFilterStrategy": ((ServletEndpoint) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "httpBinding": ((ServletEndpoint) target).setHttpBinding(property(camelContext, org.apache.camel.http.common.HttpBinding.class, value)); return true;
        case "async": ((ServletEndpoint) target).setAsync(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((ServletEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "httpMethodRestrict": ((ServletEndpoint) target).setHttpMethodRestrict(property(camelContext, java.lang.String.class, value)); return true;
        case "matchOnUriPrefix": ((ServletEndpoint) target).setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "muteException": ((ServletEndpoint) target).setMuteException(property(camelContext, boolean.class, value)); return true;
        case "responseBufferSize": ((ServletEndpoint) target).setResponseBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "servletName": ((ServletEndpoint) target).setServletName(property(camelContext, java.lang.String.class, value)); return true;
        case "transferException": ((ServletEndpoint) target).setTransferException(property(camelContext, boolean.class, value)); return true;
        case "attachmentMultipartBinding": ((ServletEndpoint) target).setAttachmentMultipartBinding(property(camelContext, boolean.class, value)); return true;
        case "eagerCheckContentAvailable": ((ServletEndpoint) target).setEagerCheckContentAvailable(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((ServletEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((ServletEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fileNameExtWhitelist": ((ServletEndpoint) target).setFileNameExtWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "optionsEnabled": ((ServletEndpoint) target).setOptionsEnabled(property(camelContext, boolean.class, value)); return true;
        case "traceEnabled": ((ServletEndpoint) target).setTraceEnabled(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((ServletEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "mapHttpMessageBody": ((ServletEndpoint) target).setMapHttpMessageBody(property(camelContext, boolean.class, value)); return true;
        case "mapHttpMessageFormUrlEncodedBody": ((ServletEndpoint) target).setMapHttpMessageFormUrlEncodedBody(property(camelContext, boolean.class, value)); return true;
        case "mapHttpMessageHeaders": ((ServletEndpoint) target).setMapHttpMessageHeaders(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((ServletEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "chunked": ((ServletEndpoint) target).setChunked(property(camelContext, boolean.class, value)); return true;
        case "disablestreamcache": ((ServletEndpoint) target).setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy": ((ServletEndpoint) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "httpbinding": ((ServletEndpoint) target).setHttpBinding(property(camelContext, org.apache.camel.http.common.HttpBinding.class, value)); return true;
        case "async": ((ServletEndpoint) target).setAsync(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((ServletEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "httpmethodrestrict": ((ServletEndpoint) target).setHttpMethodRestrict(property(camelContext, java.lang.String.class, value)); return true;
        case "matchonuriprefix": ((ServletEndpoint) target).setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "muteexception": ((ServletEndpoint) target).setMuteException(property(camelContext, boolean.class, value)); return true;
        case "responsebuffersize": ((ServletEndpoint) target).setResponseBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "servletname": ((ServletEndpoint) target).setServletName(property(camelContext, java.lang.String.class, value)); return true;
        case "transferexception": ((ServletEndpoint) target).setTransferException(property(camelContext, boolean.class, value)); return true;
        case "attachmentmultipartbinding": ((ServletEndpoint) target).setAttachmentMultipartBinding(property(camelContext, boolean.class, value)); return true;
        case "eagercheckcontentavailable": ((ServletEndpoint) target).setEagerCheckContentAvailable(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((ServletEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((ServletEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filenameextwhitelist": ((ServletEndpoint) target).setFileNameExtWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "optionsenabled": ((ServletEndpoint) target).setOptionsEnabled(property(camelContext, boolean.class, value)); return true;
        case "traceenabled": ((ServletEndpoint) target).setTraceEnabled(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((ServletEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "maphttpmessagebody": ((ServletEndpoint) target).setMapHttpMessageBody(property(camelContext, boolean.class, value)); return true;
        case "maphttpmessageformurlencodedbody": ((ServletEndpoint) target).setMapHttpMessageFormUrlEncodedBody(property(camelContext, boolean.class, value)); return true;
        case "maphttpmessageheaders": ((ServletEndpoint) target).setMapHttpMessageHeaders(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((ServletEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
