package com.webank.wecross.stub;

import java.util.List;

public interface Connection {

    // Callback for asyncSend
    interface Callback {
        void onResponse(Response response);
    }

    /**
     * send request to blockchain
     *
     * @param request
     * @return
     */
    Response send(Request request);

    /**
     * asyncSend request to blockchain
     *
     * @param request
     * @param callback
     * @return
     */
    default void asyncSend(Request request, Connection.Callback callback) {
        callback.onResponse(send(request));
    }

    /**
     * get resources name
     *
     * @return resources
     */
    List<ResourceInfo> getResources();
}
