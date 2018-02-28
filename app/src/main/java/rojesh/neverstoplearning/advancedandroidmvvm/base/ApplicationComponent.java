package rojesh.neverstoplearning.advancedandroidmvvm.base;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mulasa.arunkumar on 28-02-2018.
 */
@Singleton
@Component(modules = {ApplicationModule.class,})
public interface ApplicationComponent {

}
