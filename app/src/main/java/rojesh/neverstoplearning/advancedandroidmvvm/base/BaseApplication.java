package rojesh.neverstoplearning.advancedandroidmvvm.base;

import android.app.Application;

/**
 * Created by mulasa.arunkumar on 28-02-2018.
 */

public class BaseApplication extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
