package com.example.andlinker;

import com.codezjx.andlinker.annotation.RemoteInterface;

/**
 * Created by codezjx on 2018/3/13.<br/>
 */
@RemoteInterface
public interface IRemoteCallback extends IBaseCallback {

    void onStart(String status);

    void onValueChange(int value);
}