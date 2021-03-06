/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.synapse.v2020_12_01.ErrorResponseException;
import com.microsoft.azure.management.synapse.v2020_12_01.GeoBackupPolicyState;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SqlPoolGeoBackupPolicies.
 */
public class SqlPoolGeoBackupPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private SqlPoolGeoBackupPoliciesService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolGeoBackupPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SqlPoolGeoBackupPoliciesInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(SqlPoolGeoBackupPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlPoolGeoBackupPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlPoolGeoBackupPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolGeoBackupPolicies list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/geoBackupPolicies")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolGeoBackupPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/geoBackupPolicies/{geoBackupPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("geoBackupPolicyName") String geoBackupPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body GeoBackupPolicyInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolGeoBackupPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/geoBackupPolicies/{geoBackupPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("geoBackupPolicyName") String geoBackupPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List SQL pool geo backup policies.
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;GeoBackupPolicyInner&gt; object if successful.
     */
    public List<GeoBackupPolicyInner> list(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single().body();
    }

    /**
     * List SQL pool geo backup policies.
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<GeoBackupPolicyInner>> listAsync(String resourceGroupName, String workspaceName, String sqlPoolName, final ServiceCallback<List<GeoBackupPolicyInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName), serviceCallback);
    }

    /**
     * List SQL pool geo backup policies.
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;GeoBackupPolicyInner&gt; object
     */
    public Observable<List<GeoBackupPolicyInner>> listAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).map(new Func1<ServiceResponse<List<GeoBackupPolicyInner>>, List<GeoBackupPolicyInner>>() {
            @Override
            public List<GeoBackupPolicyInner> call(ServiceResponse<List<GeoBackupPolicyInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List SQL pool geo backup policies.
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;GeoBackupPolicyInner&gt; object
     */
    public Observable<ServiceResponse<List<GeoBackupPolicyInner>>> listWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<GeoBackupPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<GeoBackupPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<GeoBackupPolicyInner>> result = listDelegate(response);
                        List<GeoBackupPolicyInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<GeoBackupPolicyInner>> clientResponse = new ServiceResponse<List<GeoBackupPolicyInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<GeoBackupPolicyInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<GeoBackupPolicyInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<GeoBackupPolicyInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param state The state of the geo backup policy. Possible values include: 'Disabled', 'Enabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GeoBackupPolicyInner object if successful.
     */
    public GeoBackupPolicyInner createOrUpdate(String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyState state) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, state).toBlocking().single().body();
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param state The state of the geo backup policy. Possible values include: 'Disabled', 'Enabled'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GeoBackupPolicyInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyState state, final ServiceCallback<GeoBackupPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, state), serviceCallback);
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param state The state of the geo backup policy. Possible values include: 'Disabled', 'Enabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoBackupPolicyInner object
     */
    public Observable<GeoBackupPolicyInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyState state) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, state).map(new Func1<ServiceResponse<GeoBackupPolicyInner>, GeoBackupPolicyInner>() {
            @Override
            public GeoBackupPolicyInner call(ServiceResponse<GeoBackupPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param state The state of the geo backup policy. Possible values include: 'Disabled', 'Enabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoBackupPolicyInner object
     */
    public Observable<ServiceResponse<GeoBackupPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyState state) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (state == null) {
            throw new IllegalArgumentException("Parameter state is required and cannot be null.");
        }
        final String geoBackupPolicyName = "Default";
        GeoBackupPolicyInner parameters = new GeoBackupPolicyInner();
        parameters.withState(state);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GeoBackupPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<GeoBackupPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GeoBackupPolicyInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GeoBackupPolicyInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<GeoBackupPolicyInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GeoBackupPolicyInner>() { }.getType())
                .register(201, new TypeToken<GeoBackupPolicyInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a SQL pool geo backup policy.
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GeoBackupPolicyInner object if successful.
     */
    public GeoBackupPolicyInner get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single().body();
    }

    /**
     * Get a SQL pool geo backup policy.
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GeoBackupPolicyInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, final ServiceCallback<GeoBackupPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName), serviceCallback);
    }

    /**
     * Get a SQL pool geo backup policy.
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoBackupPolicyInner object
     */
    public Observable<GeoBackupPolicyInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).map(new Func1<ServiceResponse<GeoBackupPolicyInner>, GeoBackupPolicyInner>() {
            @Override
            public GeoBackupPolicyInner call(ServiceResponse<GeoBackupPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a SQL pool geo backup policy.
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoBackupPolicyInner object
     */
    public Observable<ServiceResponse<GeoBackupPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String geoBackupPolicyName = "Default";
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GeoBackupPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<GeoBackupPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GeoBackupPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GeoBackupPolicyInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<GeoBackupPolicyInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GeoBackupPolicyInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
