package me.jcala.xmarket.mvp.user.login;


import me.jcala.xmarket.data.dto.Result;
import me.jcala.xmarket.data.pojo.User;

interface LoginRegisterModel {

    interface onLoginRegisterListener{

        void loginComplete(Result<String> result,final String username,final String password);

        void registerComplete(Result<String> result,final String username,final String password);
    }

    void loginRequest(final String username,final String password,final onLoginRegisterListener listener);

    void registerRequest(final String username,final String password,final onLoginRegisterListener listener);
}
