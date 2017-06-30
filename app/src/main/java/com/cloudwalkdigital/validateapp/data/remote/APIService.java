package com.cloudwalkdigital.validateapp.data.remote;

import com.cloudwalkdigital.validateapp.data.models.JobOrder;
import com.cloudwalkdigital.validateapp.data.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by alleoindong on 6/19/17.
 */

public interface APIService {
    @GET("/auth")
    Call<User> doLogin(@Field("email") String email, @Field("password") String password);

    @GET("/v1/validate/job-orders")
    Call<JobOrder> getJobOrders();

    @GET("/v1/validate/ratees/{jobOrderId}/{validateType}")
    Call<List<User>> getRatees(@Path("jobOrderId") Integer jobOrderId,
                               @Path("validateType") String validateType);

    @GET("/v1/validate/questions/{rateeId}/{jobOrderId}/{validateType}")
    Call<List<User>> getQuestions(@Path("rateeId") Integer rateeId,
                                  @Path("jobOrderId") Integer jobOrderId,
                                  @Path("validateType") String validateType);
}
