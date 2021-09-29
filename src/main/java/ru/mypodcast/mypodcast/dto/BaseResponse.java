package ru.mypodcast.mypodcast.dto;

// T payload
public class BaseResponse<T> {

    private T payLoad;

    private String error;

    public BaseResponse(T payLoad) {
        this.payLoad = payLoad;
    }

    public BaseResponse(String error) {
        this.error = error;
    }

    public T getPayLoad() {
        return payLoad;
    }

    public String getError() {
        return error;
    }

}
