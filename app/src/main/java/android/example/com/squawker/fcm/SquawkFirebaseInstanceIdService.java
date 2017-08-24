
// DONE (1) Make a new package for your FCM service classes called "fcm"
package android.example.com.squawker.fcm;


import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

// DONE (2) Create a new Service class that extends FirebaseInstanceIdService.
// You'll need to implement the onTokenRefresh method. Simply have it print out
// the new token.
public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static String TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
        // Method is blank for this app
    }
}
