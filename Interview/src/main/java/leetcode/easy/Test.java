package leetcode.easy;

import com.wso2telco.logging.LogHandler;
import com.wso2telco.logging.dto.ErrorDTO;
import com.wso2telco.logging.dto.RequestDTO;
import com.wso2telco.logging.dto.ResponseDTO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.config.Entry;

public class PropertyLogHandler extends LogHandler {

    private static final String REGISTRY_PATH = "gov:/apimgt/";
    private static final String PAYLOAD_LOGGING_ENABLED = "payload.logging.enabled";
    private static final Log logHandler = LogFactory.getLog("REQUEST_RESPONSE_LOGGER");


    public void logRequestProperties(MessageContext messageContext,
                                     org.apache.axis2.context.MessageContext axis2MessageContext,
                                     boolean isPayloadLoggingEnabled){

        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setApiRequestId(String.valueOf(messageContext.getProperty(UUID)));
        requestDTO.setApiName(String.valueOf(messageContext.getProperty(API_NAME)));
        requestDTO.setSpName(String.valueOf(messageContext.getProperty(SP_NAME)));
        requestDTO.setApiPublisher(String.valueOf(messageContext.getProperty(API_PUBLISHER)));
        requestDTO.setApiVersion(String.valueOf(messageContext.getProperty(API_VERSION)));
        requestDTO.setApiContext(String.valueOf(messageContext.getProperty(API_CONTEXT)));
        requestDTO.setApplicationName(String.valueOf(messageContext.getProperty(APPLICATION_NAME)));
        requestDTO.setApplicationId(String.valueOf(messageContext.getProperty(APPLICATION_ID)));
        requestDTO.setConsumerKey(String.valueOf(messageContext.getProperty(CONSUMER_KEY)));
        requestDTO.setRestSubRequestPath(String.valueOf(messageContext.getProperty(REST_SUB_REQUEST_PATH)));
        requestDTO.setMethod(String.valueOf(messageContext.getProperty(METHOD)));
        requestDTO.setRequestBody(super.handleAndReturnPayload(messageContext));

    }

    @Override
    public void logResponseProperties(MessageContext messageContext,
                                      org.apache.axis2.context.MessageContext axis2MessageContext,
                                      boolean isPayloadLoggingEnabled) {

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setApiRequestId(String.valueOf(messageContext.getProperty(UUID)));
        responseDTO.setHttpStatus(String.valueOf(axis2MessageContext.getProperty(HTTP_SC)));
        responseDTO.setResponseTime(String.valueOf(messageContext.getProperty(RESPONSE_TIME)));
        responseDTO.setResponseBody(super.handleAndReturnPayload(messageContext));

        super.printLog(logHandler,super.captureResponseProperties(responseDTO, isPayloadLoggingEnabled));
    }

    @Override
    public void logErrorProperties(MessageContext messageContext,
                                   org.apache.axis2.context.MessageContext axis2MessageContext,
                                   boolean isPayloadLoggingEnabled) {

        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setApiRequestId(String.valueOf(messageContext.getProperty(UUID)));
        errorDTO.setRequestBody(messageContext.getEnvelope().getBody().toString());
        errorDTO.setRestFullRequestPath(String.valueOf(messageContext.getProperty(REST_FULL_REQUEST_PATH)));
        errorDTO.setSynapseRestApi(String.valueOf(messageContext.getProperty(SYNAPSE_REST_API)));
        errorDTO.setSynapseRestApiVersion(String.valueOf(messageContext.getProperty(API_VERSION)));
        errorDTO.setApiResourceCacheKey(String.valueOf(messageContext.getProperty(API_RESOURCE_CACHE_KEY)));
        errorDTO.setErrorException(String.valueOf(messageContext.getProperty(ERROR_EXCEPTION)));
        errorDTO.setApplicationName(String.valueOf(messageContext.getProperty(APPLICATION_NAME)));
        errorDTO.setApplicationId(String.valueOf(messageContext.getProperty(APPLICATION_ID)));
        errorDTO.setErrorCode(String.valueOf(messageContext.getProperty(ERROR_CODE)));
        errorDTO.setHttpStatusCode(String.valueOf(axis2MessageContext.getProperty(HTTP_SC)));
        errorDTO.setErrorMessage(String.valueOf(messageContext.getProperty(ERROR_MESSAGE)));

        super.printLog(logHandler, super.captureErrorProperties(errorDTO, isPayloadLoggingEnabled));
    }

    Entry getPayloadEntry() {
        return new Entry(REGISTRY_PATH + PAYLOAD_LOGGING_ENABLED);
    }


}
