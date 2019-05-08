package org.kkarvounis.chasemate.app.lambda;

public class GetTreeResponse {
    private Object data;
    private String error;

    public GetTreeResponse() {
    }

    public GetTreeResponse(Object data, String error) {
        this.data = data;
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
