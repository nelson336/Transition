package br.com.transition;

import android.annotation.TargetApi;
import android.transition.Fade;
import android.view.View;
import android.view.Window;

public class Utils {

    @TargetApi(21)
    public static void transitionFadeActivity(Window window) {
       try {
           Fade fade = new Fade();
           View decor = window.getDecorView();
           fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
           fade.excludeTarget(android.R.id.statusBarBackground, true);
           fade.excludeTarget(android.R.id.navigationBarBackground, true);

           window.setEnterTransition(fade);
           window.setExitTransition(fade);
       }catch (Exception ignored){
       }
    }


}
