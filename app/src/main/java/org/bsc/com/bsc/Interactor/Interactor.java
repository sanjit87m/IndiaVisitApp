package org.bsc.com.bsc.Interactor;

/**
 * Created by sanjit on 26/12/17.
 */

public interface Interactor {
    void getData(DataRetriveListener listener, String url);

        interface DataRetriveListener{
            void onSuccess(String data);
            void onFaliure();

        }
}
