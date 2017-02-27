package mangeroo.mangeroo;

import com.firebase.client.Firebase;

/**
 * Created by shoyu on 28/2/2017.
 */

public class CrowdFriend extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
