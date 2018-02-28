package rojesh.neverstoplearning.advancedandroidmvvm.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mulasa.arunkumar on 28-02-2018.
 */

@Module
public class ApplicationModule {

    private Application application;

    ApplicationModule(Application application){
        this.application = application;
    }

    @Provides
    Context provideApplicationContext(){
        return application;
    }
}
