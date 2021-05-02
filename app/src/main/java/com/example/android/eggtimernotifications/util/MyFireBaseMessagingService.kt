package com.example.android.eggtimernotifications.util


/**
class MyFirebaseMessagingService {
// MyFirebaseMessagingService.kt

// [START receive_message]
override fun onMessageReceived(remoteMessage: RemoteMessage?) {
// Not getting messages here? See why this may be: https://goo.gl/39bRNJ
Log.d(TAG, "From: ${remoteMessage?.from}")

// TODO: Step 3.5 check messages for data
// Check if message contains a data payload.
remoteMessage?.data?.let {
Log.d(TAG, "Message data payload: " + remoteMessage.data)
}

}
// [END receive_message]

// TODO: Step 3.6 check messages for notification and call sendNotification
// Check if message contains a notification payload.
remoteMessage?.notification?.let {
Log.d(TAG, "Message Notification Body: ${it.body}")
sendNotification(it.body!!)
}
}

 **/