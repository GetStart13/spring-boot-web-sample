package com.example.domain;

/**
 * <p> 2023/7/3 </p>
 * 返回结果
 *
 * @author Fqq
 */
public class Result<T> {
    private static final Integer SUCCESS = 200;
    private static final Integer FAILURE = 400;
    private Integer status;
    private String message;
    private T data;
    private Integer page;
    private Integer perPage;

    public Result() {
    }

    private Result(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(SUCCESS, "success", data);
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>(FAILURE, "failure", null);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", page=" + page +
                ", perPage=" + perPage +
                '}';
    }
}
