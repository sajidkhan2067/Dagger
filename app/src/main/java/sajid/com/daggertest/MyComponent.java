package sajid.com.daggertest;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
  void inject(MainActivity mainActivity);

}
